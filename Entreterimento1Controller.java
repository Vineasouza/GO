/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author arthu
 */
public class Entreterimento1Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML 
    private Button botVoltar;
    
    @FXML 
    private Button botSair;
    
    @FXML 
    private AnchorPane entr1;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    public void handleBotVoltar(ActionEvent event) throws IOException{
        AnchorPane a = (AnchorPane)FXMLLoader.load(getClass().getResource("TelaEstabelecimento4.fxml"));
        entr1.getChildren().setAll(a);
    }
    
    public void handleBotSair(ActionEvent event){
        System.exit(0);
    }
    
}
