package com.springapp.mvc;

import com.springapp.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/")
public class UserController {
    Map<String,User> users = new HashMap<String, User>();

    public UserController()
    {
        users.put("段亦逍",new User("段亦逍","123","Duanyixiao","aaa"));
        users.put("白鹏飞",new User("白鹏飞","123","Baipengfei","aaa"));
        users.put("岳贵阳",new User("岳贵阳","123","Yueguiyang","aaa"));
        users.put("王嘉瑶",new User("王嘉瑶","123","Wangjiayao","aaa"));
        users.put("童慧鑫",new User("童慧鑫","123","Tonghuixin","aaa"));
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("users",users);
        return "list";
    }

    @RequestMapping(value="/add",method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("user",new User());
        return "add";
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(User user){
        users.put(user.getUsername(),user);
        return "redirect:/user";
    }
    @RequestMapping(value = "/{username}/update",method = RequestMethod.GET)
    public String update(@PathVariable String username,Model model){
        model.addAttribute("user",users.get(username));
        return "update";
    }
    @RequestMapping(value = "/{username}/update",method = RequestMethod.POST)
    public String udpate(@PathVariable String username,User user){
        users.put(username,user);
        return "redirect:/user";
    }


}