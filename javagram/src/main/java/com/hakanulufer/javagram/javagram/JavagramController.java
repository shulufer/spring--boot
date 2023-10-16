package com.hakanulufer.javagram.javagram;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JavagramController {

    @GetMapping("/")
    public String getForm() {
      return "sign-up";
    }

    @GetMapping("/result")
    public String getResult() {
        return "result";
    }


}
