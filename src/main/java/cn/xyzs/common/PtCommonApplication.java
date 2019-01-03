package cn.xyzs.common;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class PtCommonApplication {

	public static void main(String[] args) {
		SpringApplication.run(PtCommonApplication.class, args);
	}
}
