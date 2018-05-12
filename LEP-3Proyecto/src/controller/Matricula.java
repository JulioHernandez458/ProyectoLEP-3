package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.MatriculaModel;
import model.MatriculasGS;

public class Matricula implements Initializable {

    @FXML
    private Button btnSalir;

    @FXML
    private TextField txtCarnet;

    @FXML
    private ComboBox<String> cmbGrado;
    
    @FXML
    void eventCombo (ActionEvent event) {
    	String elemento_seleccionado = cmbGrado.getSelectionModel().getSelectedItem();
    	System.out.println(elemento_seleccionado);

    }
    
    ObservableList<String> listaDeGrados =
    		FXCollections.observableArrayList("1°","2°","3°","4°","5°","6°","7°","8°","9°");
    

    @FXML
    private Button btnAceptarMatricula;

    @FXML
    void f20b0b(ActionEvent event) {

    }

    @FXML
    void salirMatricula(ActionEvent event) {
    	
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
    void aceptarmatricula(ActionEvent event) {
    	
    	String carnet = txtCarnet.getText();
    	String id_grado = cmbGrado.getSelectionModel().getSelectedItem();
    	
    	MatriculasGS alumno_a_m = new MatriculasGS(0,carnet,id_grado);
		
		 
		 MatriculaModel alumn = new MatriculaModel();
		 alumn.insertD(alumno_a_m);
		
		 this.dialog(Alert.AlertType.INFORMATION, "Alumno Matriculado Exitosamente!");

    }

    

    @FXML
    void comboGrado(ActionEvent event) {

    }
    
    
    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		cmbGrado.setItems(listaDeGrados);
	}

    
    public void dialog(Alert.AlertType alertType,String s){
        Alert alert = new Alert(alertType,s);
        alert.initStyle(StageStyle.UTILITY);
        alert.setTitle("Info");
        alert.showAndWait();
    }
}


