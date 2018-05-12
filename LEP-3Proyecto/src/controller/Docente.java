package controller;

import java.io.IOException;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.DocenteModel;
import model.DocentesGS;

public class Docente {

    @FXML
    private Button btnAceptarDocente;

    @FXML
    private TextField txtTelefonoD;

    @FXML
    private Button btnSalirDocente;

    @FXML
    private Button btnEliminar;

    @FXML
    private TextField txtApellidoD;

    @FXML
    private TextField txtNombreD;

    @FXML
    private TextField txtNit;

    @FXML
    private TextField txtDui;

    @FXML
    private TextField txtidD;

    @FXML
    private TextField txtDireccionD;

    @FXML
    private Button btnmodificar;

    @FXML
    void f20b0b(ActionEvent event) {

    }

    
    DocenteModel docenteModel = new DocenteModel();
    
    @FXML
    void salirDocente(ActionEvent event) {
    	
    	try {	
	  		   Parent regresar_parent = FXMLLoader.load(getClass().getResource("/view/menu.fxml"));
	            Scene regresar_scene = new Scene(regresar_parent);
	            Stage app_stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
	            app_stage.hide();
	            app_stage.setScene(regresar_scene);
	            app_stage.setTitle("Menu");
	            app_stage.show();
	            
	  		} catch (IOException e) {
	  			e.printStackTrace();
	  		}

    }

  

    @FXML
    void aceptardocente(ActionEvent event) {
    	
    	try {
			
    		String nombre = txtNombreD.getText();
    		String apellidos = txtApellidoD.getText();
    		String dui = txtDui.getText();
    	    String nit = txtNit.getText();
    	    String direccion = txtDireccionD.getText();
    	    Integer telefono = Integer.valueOf(txtTelefonoD.getText());
    		
    		Random clave1 = new Random();
        	String clave = apellidos.substring(0,2).toUpperCase();
        	String id_profesor = clave + "-" + clave1.nextInt(1000); 
        	txtidD.setText(txtidD.getText()+id_profesor);
        	
        	DocentesGS docente_a_insertar = new DocentesGS(id_profesor,nombre,apellidos,dui,nit,direccion,telefono);
    		
        	DocenteModel docente = new DocenteModel();
        	docente.insert(docente_a_insertar);
        	
        	this.dialog(Alert.AlertType.INFORMATION, "Docente Ingresado Exitosamente!");
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    	

    }

   

    @FXML
    void eliminardocente(ActionEvent event) {
    	
    	String id_profesor = txtidD.getText();
    	try {
			
            DocentesGS docente_a_eliminar = new DocentesGS(id_profesor,"","","","","",0);
    		
        	DocenteModel docente_a = new DocenteModel();
        	docente_a.delete(docente_a_eliminar);
        	this.dialog(Alert.AlertType.INFORMATION, "Docente Eliminado");
    		
		} catch (Exception e) {
			// TODO: handle exception
		}

    }

   

    @FXML
    void modificardocente(ActionEvent event) {
    	
    	String id_profesor = txtidD.getText();
    	
    	try {
			
    		String nombre = txtNombreD.getText();
    		String apellidos = txtApellidoD.getText();
    		String dui = txtDui.getText();
    	    String nit = txtNit.getText();
    	    String direccion = txtDireccionD.getText();
    	    Integer telefono = Integer.valueOf(txtTelefonoD.getText());
    	    
    	    
            DocentesGS docente_a_modificar = new DocentesGS(id_profesor,nombre,apellidos,dui,nit,direccion,telefono);
    		
        	DocenteModel docente = new DocenteModel();
        	docente.update(docente_a_modificar);
        	
    		this.dialog(Alert.AlertType.INFORMATION, " Datos del Docente Modificado Exitosamente! ");
    		
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    	

    }
    
    
    public void dialog(Alert.AlertType alertType,String s){
        Alert alert = new Alert(alertType,s);
        alert.initStyle(StageStyle.UTILITY);
        alert.setTitle("Info");
        alert.showAndWait();
    }

  
}

