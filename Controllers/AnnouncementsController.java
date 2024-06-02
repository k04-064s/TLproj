package billGuru.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NewScheduleController {

	@RequestMapping (method = RequestMethod.GET, value = "/announcements") 
	public String announcements() {
		return "announcements";
	}
}
