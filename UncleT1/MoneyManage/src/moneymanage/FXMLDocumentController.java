/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneymanage;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author josh
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private ComboBox comboBx;
    @FXML
    private TextField addressField;
    @FXML
    private TextField lengthInFld;
    @FXML
    private TextField widthFtFld;
    @FXML
    private TextField widthInFld    ;
    @FXML
    private TextField quantityFld;
    @FXML
    private TextField rateFld;
    @FXML
    private Button addBtn;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public void exitApplication(ActionEvent event) {
        Platform.exit();
        
    }//Maybe
    
    @FXML
    private void handleComboBox(ActionEvent event) {
        System.out.println("You clicked the comboboxs!");
        //Need to check the api for the life cycle on Combo box events!!
        //Is not executing the code from this function
        
    }//End of the 'handleComboBox' function
    
    @FXML
    private void handleAddBtn(ActionEvent event) {
        System.out.println("You clicked the add button!");
        
    }//End of the 'handleAddBtn' function
    
}//End of the 'Controller' class
