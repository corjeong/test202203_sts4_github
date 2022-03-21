package edu.multi.kdigital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Myboot1Application {

	public static void main(String[] args) {
		SpringApplication.run(Myboot1Application.class, args);
		System.out.println("깃헙 push 용도");
		System.out.println("원격저장소 추가 라인");
		System.out.println("소스주인 수정");
	}

}
