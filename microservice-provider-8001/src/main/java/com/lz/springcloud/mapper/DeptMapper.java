package com.lz.springcloud.mapper;

import com.lz.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {
    Dept findById(Long id);

    boolean addDept(Dept dept);

    List<Dept> findAll();
}
