package yonyou.esn.openapi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AvailController {

    @Value("${current.profile.active}")
    private String profile;
    @GetMapping("/avail")
    public String avail(){
        return "200 ok: " + profile;
    }
}
