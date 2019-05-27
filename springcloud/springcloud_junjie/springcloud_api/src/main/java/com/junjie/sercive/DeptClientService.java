package com.junjie.sercive;


import com.junjie.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value ="SPRINGCLOUD8001" ,fallbackFactory = DeptClientServiceFallBackFactory.class)
public interface DeptClientService {
    @RequestMapping(value = "/dept/add",method = RequestMethod.GET)
    public boolean add( Dept dept);

    @RequestMapping(value = "/dept/get/{deptNo}",method = RequestMethod.GET)
    public Dept get(@PathVariable("deptNo") Long deptNo);

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list();


}
