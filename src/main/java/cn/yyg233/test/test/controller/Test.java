package cn.yyg233.test.test.controller;

/**
 * @author yige.yyg
 * @date 2019-10-08 8:51 PM
 **/
public class Test {
    public static void main(String[] args) {
        int t = 0b101;
        int mysql = 1-1;
        int odps = 2-1;
        int oss = 3-1;
        String tt = "100";
        int ttl = Integer.parseInt(tt, 2);
        System.out.println(ttl);
        System.out.println((ttl >> mysql & 1) == 1);
        System.out.println((ttl >> odps & 1) == 1);
        System.out.println((ttl >> oss & 1) == 1);
        System.out.println((ttl >> mysql & 1));
        System.out.println((ttl >> odps & 1));
        System.out.println((ttl >> oss & 1));
    }
}
