package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/led")
public class LedController {

    @GetMapping("/ligar")
    public String Ligar(){
        return "ligado";
    }
    @GetMapping("/desligar")
    public String Desligar(){
        return "desligado";
    }
}
