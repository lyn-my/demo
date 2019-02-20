package com.lyn.demo.rest;

import com.lyn.demo.domain.Demo;
import com.lyn.demo.domain.TestConfigParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Demo")
public class DemoController {
    @Autowired
    private TestConfigParams testConfigParams;

    @RequestMapping("/Hello")
    public Demo test(){
        Demo demo = new Demo();
        demo.setId("A");
        demo.setTitle(testConfigParams.getTitle());
        demo.setName(testConfigParams.getName());
        System.out.println(">>>>>>>>>>>>"+testConfigParams.getTitle());
        return demo;
    }

}
