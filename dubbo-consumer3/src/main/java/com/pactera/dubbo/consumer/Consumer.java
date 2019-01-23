package com.pactera.dubbo.consumer;

import com.alibaba.dubbo.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: zhoulonghui
 * @Date: 2019/1/23 14:12
 */
public class Consumer {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        int sum = 0;
        for (int i = 1;i <= 10 ;i++){
            sum += i;
        }
        System.out.println("从1到10的和是"+sum);
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer");
        System.out.println(demoService.getPermissions(1L));
    }
}
