package com.hakanulufer.javagram.javagram;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

@Controller
public class JavagramController {

    @GetMapping("/")
    public String getForm(Model model) {
      model.addAttribute("user", new User());
      return "sign-up";
    }

    @GetMapping("/result")
    public String getResult() {
        return "result";
    }

    @PostMapping("/submitItem")
    public String handleSubmit(@Valid User user, BindingResult results){
      if(user.getFirstName().equals(user.getLastName())) results.rejectValue("lastName", "", "Please enter valid.");
      if (results.hasErrors()) return "sign-up";
      return "redirect:result";
    }


}
