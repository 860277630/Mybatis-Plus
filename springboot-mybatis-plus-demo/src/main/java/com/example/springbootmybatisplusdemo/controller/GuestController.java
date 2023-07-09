package com.example.springbootmybatisplusdemo.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.springbootmybatisplusdemo.entity.Guest;
import com.example.springbootmybatisplusdemo.service.GuestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class GuestController {

    @Autowired
    private GuestService  guestService;

    //增
    @RequestMapping("add")
    public String add(){
        Guest guest = new Guest();
        guest.setName("张三");
        guest.setPwd("123");
        guest.setSex("男");
        guestService.save(guest);
        return "finish";
    }

    //删
    @RequestMapping("delete")
    public String delete(String id){
        guestService.removeById(id);
        return "finish";
    }

    //改
    @RequestMapping("update")
    public String update(){
        UpdateWrapper<Guest> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("guest_name","张三");
        Guest guest = new Guest();
        guest.setPwd("123456789");
        boolean update = guestService.update(guest, updateWrapper);
        return "finish";
    }

    //查
    @RequestMapping("query")
    public List<Guest> add(@RequestParam("name") String  name){
        UpdateWrapper<Guest> updateWrapper = new UpdateWrapper<>();
        updateWrapper.like("guest_name",name);
        List<Guest> list = guestService.list(updateWrapper);
        return list;
    }


}
