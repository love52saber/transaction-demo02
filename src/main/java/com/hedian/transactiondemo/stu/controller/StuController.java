package com.hedian.transactiondemo.stu.controller;


import com.hedian.transactiondemo.stu.dto.StuDto;
import com.hedian.transactiondemo.stu.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author gjyang
 * @since 2019-08-04
 */
@RestController
@RequestMapping("/stu")
public class StuController {

    @Autowired
    private StuService stuService;

    @PostMapping("")
    public void addStu(@RequestBody StuDto stuDto) {
        stuService.addStu(stuDto);
    }

}
