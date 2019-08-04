package com.hedian.transactiondemo.stu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hedian.transactiondemo.stu.dto.StuDto;
import com.hedian.transactiondemo.stu.persistence.mapper.StuMapper;
import com.hedian.transactiondemo.stu.persistence.pojo.Stu;
import com.hedian.transactiondemo.stu.service.StuService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author gjyang
 * @since 2019-08-04
 */
@Service
public class StuServiceImpl extends ServiceImpl<StuMapper, Stu> implements StuService {

    @Override
    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void addStu(StuDto stuDto) {
        Stu stu = new Stu();
        stu.setName("tom1");
        stu.setAge(12);
        if (!this.save(stu)) {
            throw new RuntimeException("test1");
        }
        this.addStu2();
    }

    @Override
    public void addStu2() {
        Stu stu = new Stu();
        stu.setName("tom1");
        stu.setAge(12);
        if (!this.save(stu)) {
            throw new RuntimeException("test1");
        }
        int i = 1 / 0;
    }
}
