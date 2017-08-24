package org.truesight.openvote2018.REST;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class TestEndpoint {

    @GetMapping("/test")
    public String test(){
        return "Test";
    }
}
