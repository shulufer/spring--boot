package com.hakanulufer.ww21;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowsController {

    @GetMapping("/shows")
    public String getShows(){
      return "shows";
    }
}
