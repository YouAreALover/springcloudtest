package com.lz.springcloud.service;

import com.lz.springcloud.entity.Dept;

import java.util.List;

public interface DeptService {

    List<Dept> list();

    boolean add(Dept dept);

    Dept findOne(Long id);
}
