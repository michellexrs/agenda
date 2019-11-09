package ar.javanoche.agenda.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.javanoche.agenda.PersonaRepository;
import ar.javanoche.agenda.persona;
import ar.javanoche.agenda.Models.Persona;


@RestController
@RequestMapping("personas") 
public class PersonaController {

	@Autowired
	private PersonaRepository personaRepository;
	
	public Persona guardar() {
		
		Persona unaPersona = new Persona();
		
		unaPersona.setNombre("Juan");
		unaPersona.setApellido("Guzman");
		unaPersona.setEdad(23);
		
		this.personaRepository.save(unaPersona);
		
		return unaPersona;
		
	}
	
	@GetMapping("/{id}") 
	public Persona traerUno(@PathVariable Integer id) {
		
		persona unaPersona = new Persona();
		
		unaPersona = this.personaRepository.findById(id).orElse(null);
		
		if(unaPersona == null) {
			return null;
		}
		
		return unaPersona;
	}
}

	
	
	
}
