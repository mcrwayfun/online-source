package com.qingtian;

import com.qingtian.domain.User;
import com.qingtian.utils.JwtUtils;
import io.jsonwebtoken.Claims;
import org.junit.Test;

/**
 * @author mcrwayfun
 * @version v1.0
 * @date Created in 2018/08/20
 * @description
 */
public class CommonTest {

    @Test
    public void testGeneJwt() {

        User user = new User();
        user.setId(999);
        user.setHeadImg("mcrwayfun");
        user.setName("mcrwayfun");

        String token = JwtUtils.geneJsonWebToken(user);
        System.out.println(token);

    }


    @Test
    public void testCheck() {

        String token = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJtY3J3YXlmdW4iLCJpZCI6OTk5LCJuYW1lIjoibWNyd2F5ZnVuIiwiaW1nIjoibWNyd2F5ZnVuIiwiaWF0IjoxNTM0Nzc5NzI2LCJleHAiOjE1MzUzODQ1MjZ9.4ToahkncgZulW5QKAd-YXmuqk8ZSiwfL6dFVvC7HGYc";

        Claims claims = JwtUtils.checkJWT(token);
        if (claims != null) {
            String name = (String) claims.get("name");
            String img = (String) claims.get("img");
            int id = (Integer) claims.get("id");
            System.out.println(name);
            System.out.println(img);
            System.out.println(id);
        } else {
            System.out.println("非法token");
        }


    }

}
