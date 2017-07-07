package com.blackfat.cloud.base.api.service;

import com.blackfat.cloud.base.api.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangfeiyang
 * @desc
 * @create 2017/7/7-10:48
 */
@RequestMapping(value="/users")
public interface UserService {

    @RequestMapping(value="/" , method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUserList();


    @RequestMapping(value="/", method= RequestMethod.POST)
    @ResponseBody
    public String postUser(@ModelAttribute User user);

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable Long id);

    @RequestMapping(value="/{id}", method= RequestMethod.PUT)
    @ResponseBody
    public String putUser(@PathVariable Long id, @ModelAttribute User user) ;


    @ResponseBody
    @RequestMapping(value="/{id}", method= RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id);



}
