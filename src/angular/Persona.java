package angular;

public class Persona {
	
	 private String nombre;	
	 private float altura	;
	 private float peso;
	 
	 
	 public Persona() {
		// TODO Auto-generated constructor stub
		 
		 this.nombre = "Quino";
		 this.altura = 1.88f;
		 this.peso = 75f;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}


	public float getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		this.peso = peso;
	}
	 
	 

}
