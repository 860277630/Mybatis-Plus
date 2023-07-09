package com.example.springbootmybatisplusdemo.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @program: springboot-mybatis-plus-demo
 * @description:
 * @author: wjl
 * @create: 2023-07-08 21:43
 **/
// 默认驼峰法表示_
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("guest_info")//当表名与实体类名不一致时，可以在实体类上加入@TableName（）声明
public class Guest {

    @TableId(type = IdType.ASSIGN_UUID) //声明属性为表中的主键（若属性名称不为默认id） 自动生成UUID
    //@TableId(type = IdType.AUTO) //主键自增，数据库字段也务必设置为自增长
    private String id;

    @TableField("guest_name")//当实体类属性与表字段不一致时，可以用来声明
    private String name;

    @TableField("guest_pwd")//当实体类属性与表字段不一致时，可以用来声明
    private String pwd;

    private String sex; //当实体类属性与表字段一致时，可以不声明


    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(value = "gx_time",fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
}
