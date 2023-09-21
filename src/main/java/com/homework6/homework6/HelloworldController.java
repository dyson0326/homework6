package com.homework6.homework6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@RestController
public class HelloworldController {
    @GetMapping("/local")

    public String local(){
        return LocalDateTime.now().getMonthValue()+"月"
                +LocalDateTime.now().getDayOfMonth()+"日";
    }

    @GetMapping("/zone")

    public String zone(){
        return ZonedDateTime.now().getHour()+"時"
                +ZonedDateTime.now().getMinute()+"分"
                +"　タイムゾーン"+ZonedDateTime.now().getZone();
    }
}
