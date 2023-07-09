package com.example.springbootmybatisplusdemo.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springbootmybatisplusdemo.dao.GuestMapper;
import com.example.springbootmybatisplusdemo.entity.Guest;
import org.springframework.stereotype.Service;


@Service
public class GuestServiceImpl extends ServiceImpl<GuestMapper, Guest> implements GuestService{
}
