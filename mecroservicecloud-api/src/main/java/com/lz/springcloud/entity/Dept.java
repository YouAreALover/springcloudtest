package com.lz.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.swing.plaf.DesktopPaneUI;
import java.io.Serializable;

@Data // get/set等
@NoArgsConstructor  // 无参构造函数
@AllArgsConstructor // 全参构造函数
@Accessors(chain = true) // 链式访问
public class Dept implements Serializable {
    private Long deptno; // 主键
    private String dname; // 部门名称
    private String db_source; // 来自哪个数据库，以为微服务架构可以一个服务对应一个数据库，同一个信息被储存到不同数据库
}
