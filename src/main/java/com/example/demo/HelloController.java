package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//@RequestMapping(value="/",method=RequestMethod.GET)
//public ModelAndView sayHello(Model model){
//    model.addAttribute("message", "Welcome from spring - mvc");
//    return new ModelAndView("welcome");
//}

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	

}
}
