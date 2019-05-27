package com.junjie.dao;


import com.junjie.entities.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DeptMapper {

    boolean add(Dept dept);
    List<Dept> list();
    Dept get(@Param("deptNo") Long deptNo);
}
