package cn.yyg233.test.test.controller;

import cn.yyg233.test.test.dto.AccessTokenDTO;
import cn.yyg233.test.test.dto.GithubUser;
import cn.yyg233.test.test.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yige.yyg
 * @date 2019-07-03 11:10 PM
 **/
@Controller
public class AuthorizeController {

    @Autowired
    private GithubProvider githubProvider;

    @GetMapping("/callback")
    public String callback(@RequestParam(name = "code") String code,
                           @RequestParam(name = "state") String state) {
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setCode(code);
        accessTokenDTO.setState(state);
        accessTokenDTO.setClient_id("d368172cda4335e46e44");
        accessTokenDTO.setClient_secret("da8a9ca35616bf78114f5cafe96433deac85c6cb");
        accessTokenDTO.setRedirect_uri("http://localhost:8819/callback");
        String accessToken = githubProvider.getAccessToken(accessTokenDTO);
        GithubUser githubUser = githubProvider.getUser(accessToken);
        System.out.println(githubUser.getName());
        return "index";
    }
}
