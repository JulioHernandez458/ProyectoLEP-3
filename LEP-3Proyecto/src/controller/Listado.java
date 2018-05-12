package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

public class Listado {

    @FXML
    private Button btnSalir;

    @FXML
    private CheckBox check1;

    @FXML
    private CheckBox check2;

    @FXML
    private CheckBox check3;

    @FXML
    private CheckBox check4;

    @FXML
    private CheckBox check5;

    @FXML
    private CheckBox check6;

    @FXML
    private CheckBox check7;

    @FXML
    private CheckBox check8;

    @FXML
    private CheckBox check9;

    @FXML
    private Button btnAceptarL;

    @FXML
    void f20b0b(ActionEvent event) {

    }

    @FXML
    void salir(ActionEvent event) {
    	
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
    void aceptarlistado(ActionEvent event) {

    }

    

}
