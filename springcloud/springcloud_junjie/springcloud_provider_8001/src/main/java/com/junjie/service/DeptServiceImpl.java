package com.junjie.service;

import com.junjie.dao.DeptMapper;
import com.junjie.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public boolean add(Dept dept) {
        return deptMapper.add(dept);
    }

    @Override
    public List<Dept> list() {
        return deptMapper.list();
    }

    @Override
    public Dept get(Long deptNo) {
        return deptMapper.get(deptNo);
    }

}
