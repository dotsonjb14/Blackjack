package com.tht.blackjack.controllers;

import com.tht.blackjack.models.Card;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @RequestMapping("/")
    public String Get() {
        return "We're good";
    }

    @RequestMapping("/card")
    public Card GetCard() {
        var c = new Card();
        c.setFace("A");
        return c;
    }
}
