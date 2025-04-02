package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class MessageController {
	@GetMapping("/welcome")
	@ResponseBody
	public String getWelCome() {
		String msg="Wellcome to Web MVC exception.";
		int i=10/0;
		return msg;
	}
	
	@GetMapping("/greet")
	@ResponseBody

	public String getGreetMsg() {
		String msg="Good Evening exception.";
		
		String s=null;
		s.length();
		return msg;
	}
	
	@ExceptionHandler(value=Exception.class )
	public ModelAndView handleAE(ArithmeticException e) {
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("error");
		return mav;
	}
}
