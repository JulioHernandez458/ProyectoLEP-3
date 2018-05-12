package model;

public class DocentesGS {
	
	  private String id_profesor;
	  private String nombre;
	  private String apellidos;
	  private String dui;
	  private String nit;
	  private String direccion;
	  private Integer telefono;
	  
	  
	  public DocentesGS() {
		super();
		// TODO Auto-generated constructor stub
	}

	  
	  
	  public DocentesGS(String id_profesor, String nombre, String apellidos, String dui, String nit, String direccion,
			Integer telefono) {
		super();
		this.id_profesor = id_profesor;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dui = dui;
		this.nit = nit;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	  
	  
	  public String getId_profesor() {
		return id_profesor;
	}
	public void setId_profesor(String id_profesor) {
		this.id_profesor = id_profesor;
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
	public String getDui() {
		return dui;
	}
	public void setDui(String dui) {
		this.dui = dui;
	}
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
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
	
	  
	  

}
