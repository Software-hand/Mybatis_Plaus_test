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
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class User {


    @TableId("uid")
    private Long id;

    private String name;

    private Integer age;

    private String email;



}
