package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/catalogue")
@SessionAttributes("cart")
public class ProductController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String catalogue(Model model) {
		
		model.addAttribute("products", null);
		return "productlist";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String productSearch(Model model) {
		return null;
	}
}
