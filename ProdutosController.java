

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author arthu
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
public class ProdutosController implements Initializable {
    
    @FXML
    private AnchorPane anchorProd;
    @FXML
    private Button botVoltar;
    @FXML
    private Button botSair;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    //>>>>           AÇÕES DOS BOTÕES  <<<<<
    
    @FXML
    //BOTÃO VOLTAR
    private void handleBotVoltar(ActionEvent event) throws IOException {
        AnchorPane a = (AnchorPane)FXMLLoader.load(getClass().getResource("TelaEstabelecimento1.fxml"));
        anchorProd.getChildren().setAll(a);
    }

    @FXML
    //BOTÃO DE SAIR
    private void handleBotSair(ActionEvent event) {
        System.exit(0);
    }
    
    //---------------------------------------------------------
}

