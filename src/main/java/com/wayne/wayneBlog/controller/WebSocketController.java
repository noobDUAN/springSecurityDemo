package com.wayne.wayneBlog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/websocket")
public class WebSocketController {

    @RequestMapping("/")
    public String websocketView(){
        return "/websocket/index";
    }
}
