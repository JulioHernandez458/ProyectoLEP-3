package model;

public class AlumnosGS {
	
	
	 private String carnet;
	 private String nombre;
	 private String apellidos;
	 private Integer edad;
	 private String direccion;
	 private Integer telefono;
	 private String nombre_padre;
	 private String nombre_madre;
	 private String nom_encargado;
	 private String parentesco;
	 
	 public AlumnosGS() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 
	 
	 public AlumnosGS(String carnet, String nombre, String apellidos, Integer edad, String direccion, Integer telefono,
			String nombre_padre, String nombre_madre, String nom_encargado, String parentesco) {
		super();
		this.carnet = carnet;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.direccion = direccion;
		this.telefono = telefono;
		this.nombre_padre = nombre_padre;
		this.nombre_madre = nombre_madre;
		this.nom_encargado = nom_encargado;
		this.parentesco = parentesco;
	}
	
	 
	 public String getCarnet() {
		return carnet;
	}
	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Integer getTelefono() {
		return telefono;
	}
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	public String getNombre_padre() {
		return nombre_padre;
	}
	public void setNombre_padre(String nombre_padre) {
		this.nombre_padre = nombre_padre;
	}
	public String getNombre_madre() {
		return nombre_madre;
	}
	public void setNombre_madre(String nombre_madre) {
		this.nombre_madre = nombre_madre;
	}
	public String getNom_encargado() {
		return nom_encargado;
	}
	public void setNom_encargado(String nom_encargado) {
		this.nom_encargado = nom_encargado;
	}
	public String getParentesco() {
		return parentesco;
	}
	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}
	
	 
	
	 
	
}
