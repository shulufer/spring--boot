package com.ltp.workbook;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkbookController {

    @GetMapping(value="/dealership")
    public String getMethodName(Model model) {

      model.addAttribute("budget", 5000);
      // model.addAttribute("make", "Toyota");
      // model.addAttribute("make", "Volkswagen");
      // model.addAttribute("make", "Ford");
      model.addAttribute("make", "Honda");




      return "dealership";
    }

}
