package com.junjie.service;

import com.junjie.entities.Dept;

import java.util.List;

public interface DeptService {
    //增加
    boolean add(Dept dept);
    //查询
    List<Dept>  list();
    //单个查询
    Dept get(Long id);
}
