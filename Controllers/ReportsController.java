package billGuru.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReportsController {

	@RequestMapping (method = RequestMethod.GET, value = "/reports") 
	public String reports() {
		return "reports";
	}
}
