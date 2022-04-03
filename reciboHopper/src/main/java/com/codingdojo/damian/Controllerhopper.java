package com.codingdojo.damian;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controllerhopper {
	
	@RequestMapping("/")
	public String index(Model model) {
		
		String name = "Grace Hopper";
		String itemName = "Alambre de cobre";
		double price = 5.25;
		String description = "Tiras de metal, otra ilustración de nanosegundos.";
		String vendor = "Tienda de la esquina Pequeñas Cosas";
		
		model.addAttribute("nombre",name);
		model.addAttribute("item",itemName);
		model.addAttribute("price",price);
		model.addAttribute("description",description);
		model.addAttribute("vendor",vendor);
		
		return "index.jsp";
		
	}

}
