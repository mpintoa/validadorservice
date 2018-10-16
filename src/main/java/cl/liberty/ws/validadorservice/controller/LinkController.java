package cl.liberty.ws.validadorservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cl.liberty.ws.validadorservice.entity.Interfaz;
import cl.liberty.ws.validadorservice.service.IInterfazService;

@RestController
@RequestMapping(value = "interfaz")
public class LinkController {
	 @Autowired
	 private IInterfazService interfazService;

	@RequestMapping(value = "/obtener", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<List<Interfaz>> getAllArticles() {
		System.out.println("prueba");
		List<Interfaz> lista = interfazService.getAllArticles();
		
		return new ResponseEntity<List<Interfaz>>(lista, HttpStatus.OK);
	}
}
