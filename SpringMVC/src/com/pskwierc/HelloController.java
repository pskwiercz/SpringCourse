package com.pskwierc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String homePage() {
        return "home-menu";
    }

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormV2")
    public String processForm2(HttpServletRequest request, Model model) {

        String name = request.getParameter("studentName");

        name = name.toUpperCase();

        String result = "Hello " + name + "!!!!";

        model.addAttribute("message", result);

        return "helloworld";
    }

    @RequestMapping("/processFormV3")
    public String processForm2(@RequestParam("studentName") String theName, Model model) {

        theName = theName.toUpperCase();

        String result = "Hello " + theName + "****";

        model.addAttribute("message", result);

        return "helloworld";
    }
}
