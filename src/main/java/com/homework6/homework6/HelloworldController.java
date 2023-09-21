package com.homework6.homework6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Map;

@RestController
public class HelloworldController {
    @GetMapping("/local")
    public Map<String,String> local(){
        return Map.of("timestamp",LocalDateTime.now().getMonthValue()+"月"
                +LocalDateTime.now().getDayOfMonth()+"日");
    }

    @GetMapping("/zone")
    public Map<String,String> zone(){
        return Map.of("timestamp",ZonedDateTime.now().getHour()+"時"
                +ZonedDateTime.now().getMinute()+"分"
                +"　タイムゾーン"+ZonedDateTime.now().getZone());
    }
}
