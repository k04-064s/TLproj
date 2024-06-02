package billGuru.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BillsController {

	@RequestMapping (method = RequestMethod.GET, value = "/bills") 
	public String showBills() {
		return "bills";
	}
}
