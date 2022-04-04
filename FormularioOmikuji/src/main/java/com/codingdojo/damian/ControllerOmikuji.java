package com.codingdojo.damian;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



@Controller
public class ControllerOmikuji {
	

	@RequestMapping("/omikuji")
	public String index() {
			
		return"omikuji.jsp";
	}
	

	
	@RequestMapping(value="/formularioOmikuji", method=RequestMethod.POST)
	public String registraUsuario(@RequestParam (value="city")String city,
		@RequestParam (value="name")String name,
		@RequestParam (value="hobbie")String hobbie,
		@RequestParam (value="number")int number,
		@RequestParam (value="say")String say,
		@RequestParam (value="ser")String ser, HttpSession session,RedirectAttributes flash) {
		
		
		
//		System.out.println(number);
		
		if(number < 5 || number >25) {
			flash.addFlashAttribute("error_numero","por favor elije un numero entre 5 y 25");
			return "redirect:/omikuji";
		}
		
		session.setAttribute("number",number);
		session.setAttribute("city", city);
		session.setAttribute("name",name );
		session.setAttribute("hobbie",hobbie );
		session.setAttribute("ser", ser);
		session.setAttribute("say", say);
		
		return"redirect:/omikuji/show";
	}
		
	
	
	@RequestMapping(value="omikuji/show", method=RequestMethod.GET)
	public String omikuji() {
			
		return"show.jsp";
	}
	
	
		
}
