/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package scandalouslyinterestingoop_project;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Abdullah
 */
public class mainFXMLController implements Initializable {
    
    @FXML
    private Button Incrementbutton;
    @FXML
    private Label TF_num;
    
    int count = 0;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        TF_num.setText(Integer.toString(count));
    }    

    @FXML
    private void click_Increment(ActionEvent event) 
    {
        count++;
        TF_num.setText(Integer.toString(count));
    }
    
}
