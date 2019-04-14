package com.lz.springcloud.service.impl;

import com.lz.springcloud.entity.Dept;
import com.lz.springcloud.mapper.DeptMapper;
import com.lz.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> list() {
        return deptMapper.findAll();
    }

    @Override
    public boolean add(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept findOne(Long id) {
        return deptMapper.findById(id);
    }
}
