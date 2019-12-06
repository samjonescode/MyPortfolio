package com.samportfolio.MyPortfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class MyPortfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyPortfolioApplication.class, args);
	}

	@GetMapping("")
	public String mainResume() {
		return "Sam_Jones_Resume_2019";
	}
	@GetMapping("/revatureResume")
	public String resumeRevature() {
		return "Samuel_Jones_54678";
	}
}
