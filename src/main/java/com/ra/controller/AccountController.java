package com.ra.controller;

import com.ra.model.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/account")
public class AccountController {
    @RequestMapping("")
    public String index(){

        return "account";
    }

    @RequestMapping("/create")
    public String add(Model model){
       Account account = new Account();
        model.addAttribute("account",account);
        return "add";
    }
    @RequestMapping("/store")
    public void store(@ModelAttribute("account") Account account){
        System.out.println(account.getUserName());
//        return "add";
    }
}
