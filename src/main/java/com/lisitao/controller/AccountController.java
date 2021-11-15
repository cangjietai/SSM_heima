package com.lisitao.controller;

import com.lisitao.domain.Account;
import com.lisitao.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author: Solitude
 * @Data: 2021/11/15 10:22
 * @Description:
 */
@Controller
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping("/account/findAll")
    public String findAll(Model model){
        System.out.println("Controller表现层：查询全部账户。。。");
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }


    @RequestMapping("/account/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
    }
}
