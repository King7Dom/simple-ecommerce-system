package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/catalogue")
public class ProductController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String catalogue(Model model) {
		//TODO: Do catalogue setup here, for example load a generic list of item into the catalogue
		System.out.println("Getting catalogue");
		return "catalogue";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String productSearch(Model model) {
		return null;
	}
}
