package com.funtl.spring.hello.moudule.strategy.demo1;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.strategy
 * @ClassName: WechatPay
 * @Author: Administrator
 * Date: 2020/1/1 0001 18:09
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description:
 */
public class WechatPay implements Payment {
    @Override
    public PayState pay(String uid, double amount) {
        System.out.println("欢迎来到微信支付");
        System.out.println("开始查询余额，开始扣款");
        return new PayState(200,"支付成功",uid,amount);
    }
}
