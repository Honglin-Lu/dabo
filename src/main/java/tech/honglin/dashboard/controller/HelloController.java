package tech.honglin.dashboard.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "Hello Controller")
public class HelloController {

    @ApiOperation("Show welcome")
    @RequestMapping("/echo")
    public String echo(@ApiParam("Username") String name) {

        return "hello world";
    }
}
