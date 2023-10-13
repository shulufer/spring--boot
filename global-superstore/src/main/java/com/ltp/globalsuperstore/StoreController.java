package com.ltp.globalsuperstore;

import java.util.ArrayList;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StoreController {

  private ArrayList<Item> items = new ArrayList<>();

  @GetMapping("/")
  public String getForm(Model model) {
      Item item = new Item();
      model.addAttribute("categories", Constants.CATEGORIES);
      model.addAttribute("item", item);
      return "form";
  }

  @GetMapping("/inventory")
  public String getInventory(Model model) {
    model.addAttribute("items", items);
    return "inventory";
  }

  @PostMapping("/submitItem")
  public String handleSubmit(Item item) {
    items.add(item);
    return "redirect:inventory";
  }








}
