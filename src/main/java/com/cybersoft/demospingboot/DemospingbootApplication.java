package com.cybersoft.demospingboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Nếu muốn tạo ra class gắn sẵn giá trị và sử dụng lại class này cho các class khác
 * thì phải đưa class này lưu trữ trên Container(IOC)
 *
 * @Bean , @Properties, @Component , @Repository
 */
@SpringBootApplication
public class DemospingbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemospingbootApplication.class, args);
	}

}
