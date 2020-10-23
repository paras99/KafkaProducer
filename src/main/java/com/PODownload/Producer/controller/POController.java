package com.PODownload.Producer.controller;

import com.PODownload.Producer.model.POModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/po")
public class POController {

    @Autowired
    private MessageChannel output;
    @PostMapping
    public void registerUser(@RequestBody POModel poModel){
        System.out.println("POModel :: "+poModel);
        Message<POModel> message = MessageBuilder.withPayload(poModel).build();
        boolean data = output.send(message);
        System.out.println(" Data : "+data);
    }

}
