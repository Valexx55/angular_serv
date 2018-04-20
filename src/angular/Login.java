package angular;

public class Login {
	
	 private String nombre;	
	 private String pwd	;
	 private String pwd2;
	 
	 
	 public Login() {
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getPwd2() {
		return pwd2;
	}


	public void setPwd2(String pwd2) {
		this.pwd2 = pwd2;
	}


	public Login(String nombre, String pwd, String pwd2) {
		super();
		this.nombre = nombre;
		this.pwd = pwd;
		this.pwd2 = pwd2;
	}
	 
	 

}
