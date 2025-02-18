package dto;



public class Dto {
	
	long idCliente;
	String dni;
	String nombre;
	String apellido1;
	String apellido2;
	String nombreCompleto;
	String email;
	String contraseña;
	boolean esValido;
	

	
	
	public long getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(long id) {
		this.idCliente = id;
	}

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public boolean isEsValido() {
		return esValido;
	}
	public void setEsValido(boolean esValido) {
		this.esValido = esValido;
	}

	@Override
	public String toString() {
		return "DNI: ".concat(dni).concat("\n").concat("NOMBRE: ").concat(apellido1).concat(" ").concat(apellido2).concat(", ").concat(nombre).concat("\n").concat("ESTADO VALIDACION: ")+esValido+"\n".concat("%%%%%%%%%%%%%");
	}
	

}
