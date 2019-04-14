package com.lz.springcloud.controller;

import com.lz.springcloud.entity.Dept;
import com.lz.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list() {
        return deptService.list();
    }

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept findOne(@PathVariable("id") Long id) {
        return deptService.findOne(id);
    }
}
