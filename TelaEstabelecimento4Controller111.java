

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
public class TelaEstabelecimento4Controller111 implements Initializable {
    
    @FXML
    private AnchorPane anchorEst1;
    @FXML
    private Button botVoltar;
    @FXML
    private Button botSair;
    
    @FXML
    private Button botFram1;
    
    @FXML 
    private Button botFram2;
    
    @FXML
    private Button botFram3;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    //>>>>           AÇÕES DOS BOTÕES  <<<<<
    @FXML
    //BOTÃO VOLTAR
    private void handleBotVoltar(ActionEvent event) throws IOException {
        AnchorPane a = (AnchorPane)FXMLLoader.load(getClass().getResource("Consulta.fxml"));
        anchorEst1.getChildren().setAll(a);
    }

    @FXML
    //BOTÃO DE SAIR
    private void handleBotSair(ActionEvent event) {
        System.exit(0);
    }
    
    @FXML
    private void handleBotFrame1(ActionEvent event) throws IOException{
        AnchorPane a = (AnchorPane)FXMLLoader.load(getClass().getResource("ProdutosEstabelecimento_1_1_1.fxml"));
        anchorEst1.getChildren().setAll(a);
    }
    
    @FXML 
    private void handleBotFrame2(ActionEvent event) throws IOException{
        AnchorPane a = (AnchorPane)FXMLLoader.load(getClass().getResource("Entrerimento_1_1_1.fxml"));
        anchorEst1.getChildren().setAll(a);
    }
    
    @FXML
    private void handleBotFrame3(ActionEvent event) throws IOException{
        AnchorPane a = (AnchorPane)FXMLLoader.load(getClass().getResource("Promoções_1_1_1.fxml"));
        anchorEst1.getChildren().setAll(a);
    }
    //-------------------------------------------------------
}
