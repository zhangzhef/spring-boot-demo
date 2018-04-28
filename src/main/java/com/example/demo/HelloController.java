package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzf
 * @date 18/4/27 14:25.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "hello, kitty!";
    }
}
