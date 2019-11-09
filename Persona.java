package ar.javanoche.agenda.Models;

import javax.persistence.Entity;

@Entity
public class Persona {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private Integer id; 
	private String nombre;
	private String apellido;
	private Integer edad;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	} 
	
	
	
	
	
}
