package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.DocentesGS;
import model.ConexionBDD;

public class DocenteModel {
	
	public ArrayList<DocentesGS> getAll(){
		Connection conn = null;
		ArrayList<DocentesGS> docentes = new ArrayList<DocentesGS>();
		try {
			conn = new ConexionBDD().getConnection();
			 String sql = "Select * from Docente";
			 System.out.println(sql);
 	

			  ResultSet rs = conn.createStatement().executeQuery(sql);
	            while (rs.next()) {       
	                DocentesGS a = new DocentesGS();
	                a.setId_profesor(rs.getString("id_profesor"));
	                a.setNombre(rs.getString("nombre"));
	                a.setApellidos(rs.getString("apellidos"));
	                a.setDui(rs.getString("dui"));
	                a.setNit(rs.getString("nit"));
	                a.setDireccion(rs.getString("direccion"));
	                a.setTelefono(rs.getInt("telefono"));
	                
	                

	                docentes.add(a);
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
		
		return docentes;
		
	}
	
	public void insert(DocentesGS docente) {
		Connection conn = null;
		try {
			conn = new ConexionBDD().getConnection();
			String insert = "INSERT INTO Docente (id_profesor,nombre,apellidos,dui,nit,direccion,telefono) "
					+ " values (?,?,?,?,?,?,?)";
		    
			PreparedStatement ps = conn.prepareStatement(insert);
			ps.setString(1, docente.getId_profesor());
			ps.setString(2, docente.getNombre());
			ps.setString(3, docente.getApellidos());
			ps.setString(4, docente.getDui());
			ps.setString(5, docente.getNit());
			ps.setString(6, docente.getDireccion());
			ps.setInt(7, docente.getTelefono());
			
			
		
			
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
	
	public void update(DocentesGS docente) {
		Connection conn = null;
		try {
			conn = new ConexionBDD().getConnection();
			String update = "UPDATE Docente set  nombre = ?,apellidos = ?,dui = ?,nit = ?,direccion = ?,telefono = ? WHERE id_profesor = ?";
			PreparedStatement ps = conn.prepareStatement(update);
			
			
			ps.setString(1, docente.getNombre());
			ps.setString(2, docente.getApellidos());
			ps.setString(3, docente.getDui());
			ps.setString(4, docente.getNit());
			ps.setString(5, docente.getDireccion());
			ps.setInt(6, docente.getTelefono());
			ps.setString(7, docente.getId_profesor());

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
	
	public void delete(DocentesGS docente) {
		
		Connection conn = null;
try {
			
			conn = new ConexionBDD().getConnection();
			String delete = "DELETE from docente where id_profesor= ?";
			PreparedStatement ps = conn.prepareStatement(delete);
			ps.setString(1, docente.getId_profesor());
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
