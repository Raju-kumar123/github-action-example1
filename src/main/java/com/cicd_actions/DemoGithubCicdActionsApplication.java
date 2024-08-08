package com.cicd_actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoGithubCicdActionsApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "welcome to Raju Tech !! ";
	}

//	echo "# github-action-example1" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/Raju-kumar123/github-action-example1.git
//	git push -u origin main

	public static void main(String[] args) {
		SpringApplication.run(DemoGithubCicdActionsApplication.class, args);
	}

}
