package com.paul.controller;

import com.paul.entity.WiselyMessage;
import com.paul.entity.WiselyResponse;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/9/2018
 * Time: 4:57 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
@Controller
public class WebSocketController {
    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public WiselyResponse say(WiselyMessage message) throws  Exception{

        //等待3秒返回消息内容
        Thread.sleep(3000);
        return  new WiselyResponse("欢迎使用webSocket:"+message.getName());



    }

}
