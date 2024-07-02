package com.conceptandcoding.springbootplayground.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/*
* @Controller: Indicates that a particular class serves the role of a controller in the Spring MVC framework.
* It is used to mark a class as a Spring MVC controller so Spring can discover it through classpath scanning.
*
* */

@Controller
public class SampleController { // Spring MVC controller

    @RequestMapping(path = "/fetchUser", method = RequestMethod.GET)
    @ResponseBody // Indicates that returns a response body. otherwise, returns a view/html page
    public String getUserDetails() {
        return "fetching and returning user details";
    }

    @RequestMapping(path = "/saveUser", method = RequestMethod.POST)
    @ResponseBody
    public String saveUserDetails() {
        return "successfully saved user details";
    }
}
