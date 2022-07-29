package com.rjs.mybatisplus.pojo;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.*;

/**
 * Date:2022/2/12
 * Author:ybc
 * Description:
 */
// 不生成有参，无参需要自己添加
@Data
public class User {



    private Long id;

    private String name;

    private Integer age;

    private String email;



}
