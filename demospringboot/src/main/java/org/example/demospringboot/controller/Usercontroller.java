package org.example.demospringboot.controller;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import org.example.demospringboot.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * /api/user
 * @controller + responBody: return html file, return string
 * @restcontroller: return String
 * @RequestMapping(): Đăng kí đường dẫn
 */
@RestController
@RequestMapping("/user")
public class Usercontroller {
    @GetMapping("/getAllUser")
    public String getAllUser()
    {
        return "Hello getAllUser";
    }
    @GetMapping("/add")
    public String addUser(@RequestParam("username") String username, @RequestParam int id)
    {
        return "Hello Add User "+ username+"- "+id;

    }
    @GetMapping("GetDeltail/{id}/{username}")
    public String getDeltail(@PathVariable("id") int id,@PathVariable() String username)
    {
        return "Hello"+ id + "- "+username;
    }
    @PostMapping("/update")
    public String updateUser(@RequestBody List<User> user)
    {
         for (User data:user)
         {
             System.out.println("Hello "+ data.getUsername()+" - "+data.getPassword()+" - "+data.getId());
         }
        return "";
    }
}
