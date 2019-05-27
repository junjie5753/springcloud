package com.junjie.sercive;


import com.junjie.entities.Dept;
import feign.hystrix.FallbackFactory;

import java.util.List;

public class DeptClientServiceFallBackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long deptNo) {
                return new Dept().setDeptNo(deptNo)
                        .setDeptName("该deptNo没有对应的信息，Consumer客户端提供的降级信息，此刻服务provider已经关闭")
                        .setDbSource("没有这个数据库");
            }

            @Override
            public List<Dept> list() {
                return null;
            }

        };
    }
}