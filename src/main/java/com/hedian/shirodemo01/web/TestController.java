package com.hedian.shirodemo01.web;


import com.hedian.shirodemo01.entity.ResultMap;
import com.hedian.shirodemo01.service.impl.WebSocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Yanghu
 * @since 2018-11-24
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getMessage() {
        return "test";
    }

    @RequestMapping(value = "/websocket")
    public @ResponseBody
    String getWebSocketMessage() throws IOException {
        WebSocketService.sendMessageAll("wocoa");
        return "success";
    }
}
