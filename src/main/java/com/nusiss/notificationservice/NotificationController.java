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

    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public ApiResponse order(){

        try {
            //check identify
            Thread.sleep(1000);
            //check inventory
            Thread.sleep(1000);
            //check balance
            Thread.sleep(1000);
            //make an order
            Thread.sleep(1000);
            //make a payment
            Thread.sleep(1000);
            //notify result
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //
        System.out.println("Make a order successfully");
        return ApiResponse.success();
    }
}
