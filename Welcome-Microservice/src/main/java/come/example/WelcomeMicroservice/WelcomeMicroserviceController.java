package come.example.WelcomeMicroservice;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeMicroserviceController {
	@RequestMapping("/info")
	public String sayInfo()
	{
		return "This is a welcome Microservice";
	}
	
	@RequestMapping("/welcome")
	public String sayWelcome()
	{
		return "Welcome";
	}
}


