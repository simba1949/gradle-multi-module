package top.simba1949;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author anthony
 * @version 2023/9/13 21:52
 */
@MapperScan(basePackages = "top.simba1949.mapper")
@SpringBootApplication
public class GradleControllerApplication {
	public static void main(String[] args) {
		SpringApplication.run(GradleControllerApplication.class, args);
	}
}
