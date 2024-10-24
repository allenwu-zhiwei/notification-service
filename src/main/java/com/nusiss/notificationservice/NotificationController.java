package com.nusiss.notificationservice;

import com.nusiss.notificationservice.config.ApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @RequestMapping(value = "/notify", method = RequestMethod.GET)
    public ApiResponse nofitfy(){

        System.out.println("Notify successfully");
        return ApiResponse.success();
    }
}
