package com.junjie.controller;


import com.junjie.config.RestTemplateConfig;
import com.junjie.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class DeptTemplateController {
    //private static String  HOST_URL="http://localhost:8001";
    private static String  HOST_URL="http://SPRINGCLOUD8001";  //根据名称找到服务
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 增加
     * @param dept
     * @return
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Boolean add(@RequestBody Dept dept){
       return restTemplate.patchForObject(HOST_URL+"/dept/add",dept,boolean.class );
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Dept> list(){
        return restTemplate.getForObject(HOST_URL+"/dept/list", List.class);
    }

    @RequestMapping(value = "/get/{deptNo}",method = RequestMethod.GET)
    public Dept get(@PathVariable Long deptNo){
        return restTemplate.getForObject(HOST_URL+"/dept/get/"+deptNo, Dept.class);
    }


    /**
     * 服务发现
     * @return
     */
    @RequestMapping(value = "/discovery",method = RequestMethod.GET)
    public Object discovery(){
        return restTemplate.getForObject(HOST_URL+"/dept/discovery", Object.class);
    }

}
