package billGuru.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OffersController {

	@RequestMapping (method = RequestMethod.GET, value = "/offers") 
	public String offers() {
		return "offers";
	}
}
