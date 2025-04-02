package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoControoler {
	@GetMapping("/demo")
	@ResponseBody
	public String getDemoMsg() {
		String msg="Good Evenning..";
		String s=null;
		s.length();
		
		return msg;
	}
}
