package com.example.webpageparserapi.controller;

import com.example.webpageparserapi.model.MovieCharacter;
import com.example.webpageparserapi.service.DemoHttpClient;
import com.example.webpageparserapi.util.ConstApp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
    private final DemoHttpClient demoHttpClient;

    public DemoController(DemoHttpClient demoHttpClient) {
        this.demoHttpClient = demoHttpClient;
    }

    @GetMapping
    public String getDemoPage() {
        demoHttpClient.get(ConstApp.RICK_AND_MORTY_URL, MovieCharacter.class);
        return "HTTP REQUEST DONE";
    }
}
