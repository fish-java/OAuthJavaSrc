package com.github.fish56.oauth.controller.oauth;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oauth/github")
public class GitHub {
    @GetMapping
    public String handler(@RequestParam String code){

        // send a request to github to get token
        // send a request to github to get info
        // set cookie

        return code;
    }
}
