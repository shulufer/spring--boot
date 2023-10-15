package com.ltp.globalsuperstore;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StoreController {

  private ArrayList<Item> items = new ArrayList<>();

  @GetMapping("/")
  public String getForm(Model model, @RequestParam(required = false) String id) {
      Item item;
      if(getIndexFromId(id) == Constants.NOT_FOUND) {
        item = new Item();
      } else {
        item = items.get(getIndexFromId(id));
      }
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
    if (getIndexFromId(item.getId()) == Constants.NOT_FOUND) {
      items.add(item);
    } else {
      items.set(getIndexFromId(item.getId()), item);
    }
    return "redirect:inventory";
  }

  public int getIndexFromId(String id) {

    for (int i = 0; i < items.size(); i++) {
      if(items.get(i).getId().equals(id)) return i;
    }
    return Constants.NOT_FOUND;
  }










}
