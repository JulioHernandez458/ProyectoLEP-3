package controller;



import java.io.IOException;
import java.util.Random;
import javafx.event.ActionEvent;

import model.AlumnosGS;
import model.AlumnoModel;


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


public class Ingreso {

    @FXML
    private TextField txtMadre;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtEdad;

    @FXML
    private Button btnSaliri;

    @FXML
    private Button btnAceptarIngreso;

    @FXML
    private Button btnModificar;

    @FXML
    private TextField txtPadre;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtEncargado;

    @FXML
    private TextField txtTelefono;

    @FXML
    private Button btnEliminar;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtCarnet;

    @FXML
    private TextField txtParentesco;

    @FXML
    void f20b0b(ActionEvent event) {

    }
    
    //ObservableList<AlumnosGS> listData;
	AlumnoModel alumnoModel = new AlumnoModel();


    @FXML
    void salirI(ActionEvent event) {
    	
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
    void aceptaringreso(ActionEvent event) {
    	try {
			

        	String nombre = txtNombre.getText();
        	String apellidos = txtApellido.getText();
        	Integer edad = Integer.valueOf(txtEdad.getText());
        	String direccion = txtDireccion.getText();
        	Integer telefono = Integer.valueOf(txtTelefono.getText());
        	String nom_padre = txtPadre.getText();
        	String nom_madre = txtMadre.getText();
        	String encargado = txtEncargado.getText();
        	String parentesco = txtParentesco.getText();
        	
        	Random clave1 = new Random();
        	String clave = apellidos.substring(0,2).toUpperCase();
        	String carnet = clave + "-" + clave1.nextInt(1000); 
        	txtCarnet.setText(txtCarnet.getText()+carnet);
        	
        	AlumnosGS alumno_a_insertar = new AlumnosGS(carnet,nombre,apellidos,edad,direccion,telefono,nom_padre,nom_madre,encargado,parentesco);
    		
    		 //Llamamos el Modelo de Alumno para insertalo en la BDD
    		 AlumnoModel alumn = new AlumnoModel();
    		 alumn.insert(alumno_a_insertar);
    		
    		 this.dialog(Alert.AlertType.INFORMATION, "Alumno Ingresado Exitosamente!");
        	
    		
		} catch (Exception e) {
			// TODO: handle exception
		}

    }
    
    
    
    @FXML
    void modificarDatos(ActionEvent event) {
    	
       try {
			
    		String nombre = txtNombre.getText();
        	String apellidos = txtApellido.getText();
        	Integer edad = Integer.valueOf(txtEdad.getText());
        	String direccion = txtDireccion.getText();
        	Integer telefono = Integer.valueOf(txtTelefono.getText());
        	String nom_padre = txtPadre.getText();
        	String nom_madre = txtMadre.getText();
        	String nom_encargado = txtEncargado.getText();
        	String parentesco = txtParentesco.getText();
        	String carnet = txtCarnet.getText();
        	
        	AlumnosGS alumno_a_actualizar = new AlumnosGS(carnet,nombre,apellidos,edad,direccion,telefono,nom_padre,nom_madre,nom_encargado,parentesco);
    		AlumnoModel alumnModel = new AlumnoModel();
    		alumnModel.update(alumno_a_actualizar);
    		this.dialog(Alert.AlertType.INFORMATION, " Datos de Alumno Modificado Exitosamente! ");
		} catch (Exception e) {
			// TODO: handle exception
		}
     
        

    }

    
    
    @FXML
    void eliminaralumno(ActionEvent event) {
 
    	String carnet = txtCarnet.getText();
    	try {

        	AlumnosGS alumno_a_eliminar = new AlumnosGS(carnet,"","",0,"",0,"","","","");
    		AlumnoModel alumnModel = new AlumnoModel();
    		alumnModel.delete(alumno_a_eliminar);
    		this.dialog(Alert.AlertType.INFORMATION, "Alumno Eliminado");
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

