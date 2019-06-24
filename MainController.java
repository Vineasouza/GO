

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
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author arthu
 */
public class MainController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button botConsultar;
    @FXML
    private Button botCadastrar;
    @FXML
    private AnchorPane anchorpane;
    @FXML
    private Button botSair;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    //INDO PARA TELA CONSULTAR
    public void handleButConsultar(ActionEvent e) throws IOException{
            AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("Consulta.fxml"));
            anchorpane.getChildren().setAll(a);
    }
    public void handleButSair(ActionEvent e){
        System.exit(0);
    }
    
    //INDO PARA TELA CADASTRAR
    public void handleBotCadastrar(ActionEvent e) throws IOException{
           AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("Cadastrar.fxml"));
           anchorpane.getChildren().setAll(a);
    }
}
