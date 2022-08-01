package com.rjs.mybatisplus.pojo;


import com.baomidou.mybatisplus.annotation.*;
import lombok.*;

// 不生成有参，无参需要自己添加
@Data
// 设置实体类所对应表名
// @TableName("t_user")
public class User {

    // 将这个属性所对应的字段为主键， Spring 默认将id作为主键
    // @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    @TableField("name")
    private String name;


    private Integer age;

    private String email;

    @TableLogic
    private Integer isDeleted;



}
