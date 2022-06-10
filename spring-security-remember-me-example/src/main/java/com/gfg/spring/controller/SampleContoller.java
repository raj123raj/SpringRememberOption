package com.gfg.spring.controller;

import java.security.Principal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleContoller {

  @GetMapping("/")
  public String index(Model model, Principal principal) {
    model.addAttribute("message", "Welcome! You are logged by using " + principal.getName() + " username");
    return "index";
  }
}
