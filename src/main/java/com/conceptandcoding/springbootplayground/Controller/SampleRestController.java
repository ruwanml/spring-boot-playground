package com.conceptandcoding.springbootplayground.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* @RestController: A convenience annotation that combines @Controller and @ResponseBody.
* It eliminates the need to annotate every request handling method of the controller class with @ResponseBody.
* */

@RestController
@RequestMapping(path = "/api/")        /* @RequestMapping(value = "/api/") - we can use path or value */
public class SampleRestController {

    @GetMapping(path = "/fetchUser")
    public String getUserDetails() {
        return "fetching and returning user details";
    }

    @PostMapping(path = "/saveUser")
    public String saveUserDetails() {
        return "successfully saved user details";
    }
}
