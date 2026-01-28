package net.github.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"n.g.s", "net.github.controller"})
public class SpringbootGithubApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGithubApplication.class, args);
	}

}
//echo "# Github-Actions-First" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/fayaz1420/Github-Actions-First.git
//git push -u origin main