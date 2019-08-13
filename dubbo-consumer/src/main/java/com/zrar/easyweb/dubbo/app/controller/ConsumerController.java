package com.zrar.easyweb.dubbo.app.controller;

import com.zrar.easyweb.dubbo.api.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ConsumerController {

    @Reference
    private DemoService demoService;

    @GetMapping("/dubbo/{name}")
    public Map<String, Object> dubbo(@PathVariable("name") String name) {
        Map<String, Object> result = new HashMap<>();
        result.put("name", name);
        result.put("status", demoService.sayHello(name));
        result.put("type", "dubbo");
        return result;
    }


}
