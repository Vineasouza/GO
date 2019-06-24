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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author arthu
 */
public class CadastrandoController1 implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    private int contadorAddProdutos;
    
    private int contadorAddPromo;
    
    @FXML 
    private Button botVoltar;
    
    @FXML
    private Button botSair;
    
    @FXML
    private Button confirma;
    
    // CAIXA DE TEXTO QUE RECEBE OS DADOS DOS PRODUTOS DOS ESTABELECIMENTOS
    @FXML
    private TextField produto;
    
    @FXML
    private TextField descriProd;
    
    @FXML
    private TextField precoProd;
    
    @FXML 
    private Label numProdAdd;
    
    @FXML
    private Button addProd;
    
    //------------------------------------------------------------
    
     // CAIXA DE TEXTO QUE RECEBE OS DADOS DAS PROMOÇÕES DOS ESTABELECIMENTOS
    @FXML
    private TextField promo;
    
    @FXML
    private TextField descriPromo;
    
    @FXML
    private TextField precoPromo;
    
    @FXML 
    private Label numPromodAdd;
    
    @FXML
    private Button addPromo;
    
    //-----------------------------------------------------------------------
    @FXML 
    private AnchorPane cadastrando;
    
    
    
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        contadorAddProdutos = 0;
        contadorAddPromo = 0;
    }    
    
    @FXML
    private void handleBotVoltar(ActionEvent event) throws IOException{
        AnchorPane a = (AnchorPane)FXMLLoader.load(getClass().getResource("Cadastrar.fxml"));
        cadastrando.getChildren().setAll(a);
    }
    
    @FXML
    private void handleBotSair(ActionEvent event){
        System.exit(0);
    }
    
   //----------------  BOTÃO CONFIRMA ---------------------
    @FXML 
    private void handleBotConfirma(ActionEvent event) throws IOException{
      
            
    }
    
    //-------- BOTÃO QUE ADICIONA OS PRODUTOS ----------
    @FXML
    private void handleBotAddProdutos(ActionEvent event){
        String recebeProduto;
        String recebeDesProduto;
        String recebePrecoProduto;
        
        recebeProduto = produto.getText();
        recebeDesProduto = descriProd.getText();
        recebePrecoProduto = precoProd.getText();
        
        //TESTE
        System.out.println(recebeProduto);
        System.out.println(recebeDesProduto);
        System.out.println(recebePrecoProduto);
        
        contadorAddProdutos++;
        
        numProdAdd.setText(Integer.toString(contadorAddProdutos));
        
        //Armazer no banco os produtos 
    }
    
    //--------------------------------------------------------
    
    @FXML
    private void handleBotAddPromo(ActionEvent event){
        
        String recebePromo;
        String recebeDesPromo;
        String recebePrecoPromo;
        
        recebePromo = promo.getText();
        recebeDesPromo = descriPromo.getText();
        recebePrecoPromo = precoPromo.getText();
        
        //TESTE
        System.out.println(recebePromo);
        System.out.println(recebeDesPromo);
        System.out.println(recebePrecoPromo);
        
        contadorAddPromo++;
        numPromodAdd.setText(Integer.toString(contadorAddPromo));
        
        //Armazer as promoções no banco
    }
        
    }
  
