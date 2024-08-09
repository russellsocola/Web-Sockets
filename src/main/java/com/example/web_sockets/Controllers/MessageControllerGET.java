package com.example.web_sockets.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageControllerGET {


    @GetMapping("/")
    public String showChatPage(){
        return "chat";
    }
    

}
