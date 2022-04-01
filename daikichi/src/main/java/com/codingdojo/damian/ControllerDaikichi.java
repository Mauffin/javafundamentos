package com.codingdojo.damian;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/daikichi")
public class ControllerDaikichi {
	
	@RequestMapping("daikichi")
		public String index() {
			return "Welcome";
	}

	@RequestMapping("/today")
	public String today() {
		return "hoy Encontraras suerte en todos tus esfuerzos!";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "tomorrow, an opportunity will arise, so be sure to be open to new ideas ";
	}
	
//	@RequestMapping("/daikichi/{travel}/{honolulu}") 
//	public String travel(@PathVariable("travel")String travel,@PathVariable("honolulu")String honolulu){
//		return"Congratulations ! You Will soon "+travel+" to "+honolulu;
//	}
	
	@RequestMapping("/daikichi/{iphone}") 
	public String iphone(@PathVariable("iphone")String iphone){
		return"felicidades ganaste un "+iphone;
	}
	
	@RequestMapping("/daikichi/{travel}/{shibuya}") 
	public String tokyo(@PathVariable("travel")String travel,@PathVariable("shibuya")String ciudad){
		return"¡Felicitaciones! ¡Pronto viajarás !"+travel+" a "+ciudad;
	}
	
	@RequestMapping("/daikichi/lotto/{numero}")
	public String lotto(@PathVariable("numero")int numero) {
		if(numero%2==0) {
		return "Harás un gran viaje en un futuro cercano, pero ten cuidado con las ofertas tentadoras";
		}else{
			return"Has disfrutado de los frutos de tu trabajo, pero ahora es un buen momento para pasar tiempo con familiares y amigos";
		}
	}
}

//	@RestController
//	public class HomeController {
//		@RequestMapping("/daikichi")
//		public String index() {
//			return "Welcome!";
//		}
//	}

