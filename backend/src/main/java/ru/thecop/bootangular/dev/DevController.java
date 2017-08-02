package ru.thecop.bootangular.dev;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/springController")
public class DevController {
    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        return "springController Hello world!";
    }
}
