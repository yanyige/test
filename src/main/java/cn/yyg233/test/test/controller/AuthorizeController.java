package cn.yyg233.test.test.controller;

import cn.yyg233.test.test.dto.AccessTokenDTO;
import cn.yyg233.test.test.dto.GithubUser;
import cn.yyg233.test.test.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yige.yyg
 * @date 2019-07-03 11:10 PM
 **/
@Controller
public class AuthorizeController {

    @Autowired
    private GithubProvider githubProvider;

    @Value("${github.client.id}")
    private String clientId;

    @Value("${github.client.secret}")
    private String clientSecret;

    @Value("${github.redirect.uri}")
    private String redirectUri;

    @GetMapping("/callback")
    public String callback(@RequestParam(name = "code") String code,
                           @RequestParam(name = "state") String state,
                           HttpServletRequest request) {
        // AccessDTO赋值
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setCode(code);
        accessTokenDTO.setState(state);
        accessTokenDTO.setClient_id(clientId);
        accessTokenDTO.setClient_secret(clientSecret);
        accessTokenDTO.setRedirect_uri(redirectUri);
        // 获取accessToken
        String accessToken = githubProvider.getAccessToken(accessTokenDTO);
        // 根据accessToken拿用户信息
        GithubUser githubUser = githubProvider.getUser(accessToken);

        if (githubUser != null) {
            // 登陆成功，写入cookie和session
            request.getSession().setAttribute("user", githubUser);
            return "redirect:/";
        } else {
            // 登陆失败，重新登陆
            return "redirect:/";
        }
    }
}
