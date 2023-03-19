package com.lmy.rsck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackages = {
        "cheers.app",
        "cheers.common",
        "com.cheers.common",
        "cheers.book",
        "cheers.qrcode"
})
@EnableFeignClients({"cheers.common.service",
        "com.cheers.micro.product.api",
        "com.cheers.micro.order.api"} )
@EnableAsync
@EnableEurekaClient
@EnableScheduling
@MapperScan({
        "cheers.app.dao",
        "cheers.book.dao",
        "cheers.qrcode.dao"
})
public class AppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }

}
