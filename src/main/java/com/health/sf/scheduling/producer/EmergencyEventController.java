package com.health.sf.scheduling.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/kafka")
public class EmergencyEventController {

    private final EmergencyEventProducer emergencyEventProducer;
    @GetMapping(value = "/send")
    public void send(){
        emergencyEventProducer.send("Mensagem de teste enviada ao tópico");
    }
}
