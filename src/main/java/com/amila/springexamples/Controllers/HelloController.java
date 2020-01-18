package com.amila.springexamples.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Asus on 21/06/2018.
 */
@RestController
@RequestMapping(value = "/rest")
public class HelloController {

    @RequestMapping(value = "/welcome")
    public String welcomePage(){
        return "Hello Spring World";
    }
}
