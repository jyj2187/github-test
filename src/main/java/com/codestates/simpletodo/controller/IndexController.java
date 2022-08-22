package com.codestates.simpletodo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    /**
     * 이건 그런거다
     * @return 이걸 보내준다.
     */
    @GetMapping("/")
    public String helloWorld() {
        return "Todo-Application!";
    }
}
