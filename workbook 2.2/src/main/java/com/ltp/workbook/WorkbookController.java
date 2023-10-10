package com.ltp.workbook;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkbookController {

    @GetMapping("/shows")
    public String getShows(Model model) {

      model.addAttribute("bb", new Show("Breaking Bad", "Ozymandias", 10.0) );
      model.addAttribute("aot", new Show("Attack on Titan", "Hero", 9.9) );
      model.addAttribute("aot2", new Show("Attack on Titan", "Perfect Game", 9.9) );
      model.addAttribute("sw", new Show("Star Wars: The Clone Wars", "Victory and Death", 9.9) );
      model.addAttribute("mr", new Show("Mr. Robot", "407 Proxy Authentication Required", 9.9) );

      return "shows";
    }

}
