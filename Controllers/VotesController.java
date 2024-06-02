package billGuru.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VotesController {

	@RequestMapping (method = RequestMethod.GET, value = "/votes") 
	public String votes() {
		return "votes";
	}
}
