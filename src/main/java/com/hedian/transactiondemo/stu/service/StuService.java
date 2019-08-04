package com.hedian.transactiondemo.stu.service;

import com.hedian.transactiondemo.stu.dto.StuDto;
import com.hedian.transactiondemo.stu.persistence.pojo.Stu;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author gjyang
 * @since 2019-08-04
 */
public interface StuService extends IService<Stu> {

    void addStu(StuDto stuDto);

    void addStu2();
}
