

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
public class ConsultaController implements Initializable {
    
    //LABELS estabelecimento 1
    @FXML 
    private Label nomeEst1; //estes labels vão receber do banco de dados os nomes,endereço e contato dos estabelecimentos
    @FXML 
    private Label endEst1;
    @FXML 
    private Label contEst1;
    //-----------------------
    
    //LABELS estabelecimento 2
    @FXML 
    private Label nomeEst2; //estes labels vão receber do banco de dados os nomes,endereço e contato dos estabelecimentos
    @FXML 
    private Label endEst2;
    @FXML 
    private Label contEst2;
    
    //LABELS estabelecimento 3
    @FXML 
    private Label nomeEst3; //estes labels vão receber do banco de dados os nomes,endereço e contato dos estabelecimentos
    @FXML 
    private Label endEst3;
    @FXML 
    private Label contEst3;
    
    //LABELS estabelecimento 4
    @FXML 
    private Label nomeEst4; //estes labels vão receber do banco de dados os nomes,endereço e contato dos estabelecimentos
    @FXML 
    private Label endEst4;
    @FXML 
    private Label contEst4;
    
    //BOTÕES
    @FXML
    private Button botSair;
    
    @FXML
    private Button botVoltar;
    
    @FXML
    private Button botFrame1;
    
    @FXML
    private Button botFrame2;
    
    @FXML
    private Button botFrame3;
    @FXML
    private Button botFrame4;
    
    @FXML
    private AnchorPane anchor;
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nomeEst1.setText("CASA AMARELA");
        endEst1.setText("Rua Santos Dummont");
        contEst1.setText("990414214");
        
        nomeEst2.setText("HARD ROCK");
        endEst2.setText("Rua Santos Dummont");
        contEst2.setText("990414214");
        
        nomeEst3.setText("HABIBS");
        endEst3.setText("Rua Santos Dummont");
        contEst3.setText("990414214");
        
        nomeEst4.setText("CERVEJARIA");
        endEst4.setText("Rua Santos Dummont");
        contEst4.setText("990414214");
        
    }
    
    //BOTÃO SAIR
    @FXML
    public void handleBotSair(ActionEvent e){
        System.exit(0);
    }
    
    //BOTÃO VOLTAR
    @FXML
     public void handleBotVoltar(ActionEvent e) throws IOException{
         AnchorPane a = (AnchorPane)FXMLLoader.load(getClass().getResource("Main.fxml"));
         anchor.getChildren().setAll(a);
    }
     
    @FXML
     public void handleBotFrame1(ActionEvent e) throws IOException{
         AnchorPane a = (AnchorPane)FXMLLoader.load(getClass().getResource("TelaEstabelecimento1.fxml"));
         anchor.getChildren().setAll(a);
    }
     
    @FXML
     public void handleBotFrame2(ActionEvent e) throws IOException{
         AnchorPane a = (AnchorPane)FXMLLoader.load(getClass().getResource("TelaEstabelecimento2.fxml"));
         anchor.getChildren().setAll(a);
    }
     
    @FXML
     public void handleBotFrame3(ActionEvent e) throws IOException{
         AnchorPane a = (AnchorPane)FXMLLoader.load(getClass().getResource("TelaEstabelecimento3.fxml"));
         anchor.getChildren().setAll(a);
    }
     
    @FXML
     public void handleBotFrame4(ActionEvent e) throws IOException{
         AnchorPane a = (AnchorPane)FXMLLoader.load(getClass().getResource("TelaEstabelecimento4.fxml"));
         anchor.getChildren().setAll(a);
    } 
}
