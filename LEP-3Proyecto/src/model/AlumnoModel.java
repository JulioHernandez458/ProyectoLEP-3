package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.AlumnosGS;
import model.ConexionBDD;

public class AlumnoModel {
	
	public ArrayList<AlumnosGS> getAll(){
		Connection conn = null;
		ArrayList<AlumnosGS> alumnos = new ArrayList<AlumnosGS>();
		try {
			conn = new ConexionBDD().getConnection();
			 String sql = "Select * from Alumno";
 			 System.out.println(sql);

			  ResultSet rs = conn.createStatement().executeQuery(sql);
	            while (rs.next()) {       
	                AlumnosGS a = new AlumnosGS();
	                a.setNombre(rs.getString("nombre"));
	                a.setApellidos(rs.getString("apellidos"));
	                a.setEdad(rs.getInt("edad"));
	                a.setDireccion(rs.getString("direccion"));
	                a.setTelefono(rs.getInt("telefono"));
	                a.setNombre_padre(rs.getString("nom_padre"));
	                a.setNombre_madre(rs.getString("nom_madre"));
	                a.setNom_encargado(rs.getString("nom_encargado"));
	                a.setParentesco(rs.getString("parentesco"));
	                a.setCarnet(rs.getString("carnet"));
	                

	                alumnos.add(a);
	            }

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return alumnos;
		
	}
	
	public void insert(AlumnosGS alumno) {
		Connection conn = null;
		try {
			conn = new ConexionBDD().getConnection();
			String insert = "INSERT INTO Alumno (carnet,nombre,apellidos,edad,direccion,telefono,nom_padre,nom_madre,nom_encargado,parentesco) "
					+ " values (?,?,?,?,?,?,?,?,?,?)";
		    
			PreparedStatement ps = conn.prepareStatement(insert);
			ps.setString(1, alumno.getCarnet());
			ps.setString(2, alumno.getNombre());
			ps.setString(3, alumno.getApellidos());
			ps.setInt(4, alumno.getEdad());
			ps.setString(5, alumno.getDireccion());
			ps.setInt(6, alumno.getTelefono());
			ps.setString(7, alumno.getNombre_padre());
			ps.setString(8, alumno.getNombre_madre());
			ps.setString(9, alumno.getNom_encargado());
			ps.setString(10, alumno.getParentesco());
			
			System.out.println(insert);
		
			
			//Ejecutamos el query en la base de datos
			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			// Codigo que siempre se ejecutara
			// Se debe cerrar siempre la conexion a BDD
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	
	public void update(AlumnosGS alumno) {
		Connection conn = null;
		try {
			conn = new ConexionBDD().getConnection();
			String update = "UPDATE Alumno set  nombre = ? , apellidos = ? , edad = ? ,"
					+ " direccion = ? , telefono = ? ,  nom_padre = ? , "
					+ " nom_madre = ? , nom_encargado = ?, parentesco = ? Where carnet = ?";
			PreparedStatement ps = conn.prepareStatement(update);
	
			ps.setString(1, alumno.getNombre());
			ps.setString(2, alumno.getApellidos());
			ps.setInt(3, alumno.getEdad());
			ps.setString(4, alumno.getDireccion());
			ps.setInt(5, alumno.getTelefono());
			ps.setString(6, alumno.getNombre_padre());
			ps.setString(7, alumno.getNombre_madre());
			ps.setString(8, alumno.getNom_encargado());
			ps.setString(9, alumno.getParentesco());
			ps.setString(10, alumno.getCarnet());
			
		

			//Ejecutamos el query en la base de datos
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	

	
	public void delete(AlumnosGS alumno) {
		
		Connection conn = null;
		try {
			
			conn = new ConexionBDD().getConnection();
			String delete = "DELETE from alumno where carnet= ?";
			PreparedStatement ps = conn.prepareStatement(delete);
			ps.setString(1, alumno.getCarnet());
			System.out.println(delete);
			ps.executeUpdate();
			

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			// Codigo que siempre se ejecutara
			// Se debe cerrar siempre la conexion a BDD
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
