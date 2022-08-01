package com.rjs.mybatisplus;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rjs.mybatisplus.mapper.ProductMapper;
import com.rjs.mybatisplus.mapper.UserMapper;
import com.rjs.mybatisplus.pojo.Product;
import com.rjs.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Date:2022/2/14
 * Author:ybc
 * Description:
 */
@SpringBootTest
public class MyBatisPlusPluginsTest {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ProductMapper productMapper;
    // 分页插件
    @Test
    public void testPage(){
        Page<User> page = new Page<>(2, 3);
        userMapper.selectPage(page, null);
        System.out.println("page = " + page);
        System.out.println(page.getRecords());
        System.out.println(page.getPages());
        System.out.println(page.getTotal());
        System.out.println(page.hasNext());
        System.out.println(page.hasPrevious());
    }

    @Test
    public void testPageVo(){
        Page<User> page = new Page<>(1, 3);
        userMapper.selectPageVo(page, 20);
        System.out.println(page.getRecords());
        System.out.println(page.getPages());
        System.out.println(page.getTotal());
        System.out.println(page.hasNext());
        System.out.println(page.hasPrevious());
    }

    // 乐观锁
    @Test
    public void testProduct01(){
        //小李查询商品价格
        Product productLi = productMapper.selectById(1);
        System.out.println("小李查询的商品价格："+productLi.getPrice());
        //小王查询商品价格
        Product productWang = productMapper.selectById(1);
        System.out.println("小王查询的商品价格："+productWang.getPrice());
        //小李将商品价格+50
        productLi.setPrice(productLi.getPrice()+50);
        productMapper.updateById(productLi);
        //小王将商品价格-30
        productWang.setPrice(productWang.getPrice()-30);
        // 判定受影响行为0，则再执行一次
        int result = productMapper.updateById(productWang);
        if(result == 0){
            //操作失败，重试 再次创建一次新的SQL
            Product productNew = productMapper.selectById(1);
            productNew.setPrice(productNew.getPrice()-30);
            productMapper.updateById(productNew);
        }
        //老板查询商品价格
        Product productLaoban = productMapper.selectById(1);
        System.out.println("老板查询的商品价格："+productLaoban.getPrice());
    }

}
