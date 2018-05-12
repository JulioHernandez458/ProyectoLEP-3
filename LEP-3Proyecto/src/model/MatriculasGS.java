package model;

public class MatriculasGS {
	
	private Integer id_matricula;
	private String carnet;
	private String id_grado;
	
	
	
	public MatriculasGS() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public MatriculasGS(Integer id_matricula, String carnet, String id_grado) {
		super();
		this.id_matricula = id_matricula;
		this.carnet = carnet;
		this.id_grado = id_grado;
	}
	
	
	
	public Integer getId_matricula() {
		return id_matricula;
	}
	public void setId_matricula(Integer id_matricula) {
		this.id_matricula = id_matricula;
	}
	public String getCarnet() {
		return carnet;
	}
	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}
	public String getId_grado() {
		return id_grado;
	}
	public void setId_grado(String id_grado) {
		this.id_grado = id_grado;
	}
	
	
	

}
