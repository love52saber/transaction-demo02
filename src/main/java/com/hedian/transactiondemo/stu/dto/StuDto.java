package com.hedian.transactiondemo.stu.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class StuDto {

    @TableId(value = "id", type = IdType.UUID)
    private String id;

    @TableField("name")
    private String name;

    @TableField("age")
    private Integer age;

}
