
package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MenuController {

    @FXML
    private Button btnListado;

    @FXML
    private Button btnSalir;

    @FXML
    private Button btnDocente;

    @FXML
    private Button btnIngreso;

    @FXML
    private Button btnMatricula;

    @FXML
    void f20b0b(ActionEvent event) {

    }

    @FXML
    void ingreso(ActionEvent event) {
    	
    	try {	
			 Parent alumnos_parent = FXMLLoader.load(getClass().getResource("/view/ingreso.fxml"));
	          Scene alumnos_scene = new Scene(alumnos_parent,800,600);
	          Stage app_stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
	          app_stage.hide();
	          app_stage.setScene(alumnos_scene);
	          app_stage.setTitle("Ingreso");
	          app_stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

    }

   

    @FXML
    void matricula(ActionEvent event) {
    	
    	try {	
			 Parent alumnos_parent = FXMLLoader.load(getClass().getResource("/view/matricula.fxml"));
	          Scene alumnos_scene = new Scene(alumnos_parent,650,450);
	          Stage app_stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
	          app_stage.hide();
	          app_stage.setScene(alumnos_scene);
	          app_stage.setTitle("Matricula");
	          app_stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

    }

  

    @FXML
    void docente(ActionEvent event) {
    	

    	try {	
			 Parent alumnos_parent = FXMLLoader.load(getClass().getResource("/view/docente.fxml"));
	          Scene alumnos_scene = new Scene(alumnos_parent,700,550);
	          Stage app_stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
	          app_stage.hide();
	          app_stage.setScene(alumnos_scene);
	          app_stage.setTitle("Docente");
	          app_stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

    }

    

    @FXML
    void listado(ActionEvent event) {
    	

    	try {	
			 Parent alumnos_parent = FXMLLoader.load(getClass().getResource("/view/listado.fxml"));
	          Scene alumnos_scene = new Scene(alumnos_parent,650,450);
	          Stage app_stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
	          app_stage.hide();
	          app_stage.setScene(alumnos_scene);
	          app_stage.setTitle("Listado");
	          app_stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

    }

    

    @FXML
    void salir(ActionEvent event) {
    	
    	System.exit(1);

    }

    

}



   
 


