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
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author arthu
 */
public class CadastrarController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    
    @FXML 
    private Button botVoltar;
    
    @FXML
    private Button botSair;
    
    @FXML
    private Button confirma;
    
    // CAIXA DE TEXTO QUE RECEBE OS DADOS DO ESTABELECIMENTO
    @FXML
    private TextField nomEsb;
    
    @FXML
    private TextField end;
    
    @FXML
    private TextField cont;
    
    @FXML
    private TextField cnpj;
    
    @FXML
    private CheckBox acordo;
    
    
    //------------------------------------------------------------
    
    @FXML 
    private AnchorPane cadastrar;
    
    private boolean check;
    
    
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
    @FXML
    private void handleBotVoltar(ActionEvent event) throws IOException{
        AnchorPane a = (AnchorPane)FXMLLoader.load(getClass().getResource("Main.fxml"));
        cadastrar.getChildren().setAll(a);
    }
    
    @FXML
    private void handleBotSair(ActionEvent event){
        System.exit(0);
    }
    
   //----------------  BOTÃO CONFIRMA ---------------------
    @FXML 
    private void handleBotConfirma(ActionEvent event) throws IOException{
        
        //TESTE
        String recebe;
        
        recebe = nomEsb.getText();
        
        System.out.println(recebe);
        
        recebe = end.getText();
        
        System.out.println(recebe);
        
        recebe = cont.getText();
        
        System.out.println(recebe);
        
        recebe = cnpj.getText();
        
        System.out.println(recebe);
        //-----------------------
        if(check ==true){
             AnchorPane a = (AnchorPane)FXMLLoader.load(getClass().getResource("Cadastrando.fxml"));
             cadastrar.getChildren().setAll(a);
        }else{
             JOptionPane.showMessageDialog(null, "Tem que estar de acordo com termos de usado do aplicativo Go para continuar");
        }

    }
    //----------------------------------------------------------
    
    //AÇÃO QUE VE SE CHECK FOI ACIONADO
    @FXML
    private void checkBox(ActionEvent event){
        check = acordo.isSelected();
        
    }
}
