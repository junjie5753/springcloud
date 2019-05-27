package com.junjie.controller;


import com.junjie.entities.Dept;
import com.junjie.sercive.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author GongXings
 * @createTime 30 15:48
 * @description
 */
@RestController
public class DeptConsumerController {
    @Autowired
    private DeptClientService deptClientService;
    @RequestMapping(value = "/consumer/add")
    public boolean add( Dept dept){
        //三个参数：url,requestMap ResponseBean.class
        return deptClientService.add(dept);
    }
    @RequestMapping("/consumer/get/{deptNo}")
    public Dept get(@PathVariable("deptNo") Long deptNo){
        //三个参数：url,requestMap ResponseBean.class
        return deptClientService.get(deptNo);
    }
    @RequestMapping("/consumer/list")
    public List<Dept> list(){
        //三个参数：url,requestMap ResponseBean.class
        return  deptClientService.list();
    }
}