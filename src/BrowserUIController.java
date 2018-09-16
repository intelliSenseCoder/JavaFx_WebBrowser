/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 *
 * @author INTELISENSE
 */
public class BrowserUIController implements Initializable {

    @FXML
    private Button loadBttn;
    @FXML
    private WebView webPage;
    private WebEngine engine;
    @FXML
    private TextField url;
    @FXML
    private Button previousBttn;
    @FXML
    private Button nextBttn;
    @FXML
    private Tab tab1;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        engine = webPage.getEngine();
        engine.load("https://www.facebook.com");
        
    }    

    @FXML
    private void loadPage(ActionEvent event) {
        engine.load("https://"+url.getText());
        tab1.setText(url.getText());
    }

    @FXML
    private void PreviousPage(ActionEvent event) {
    }

    @FXML
    private void NextPage(ActionEvent event) {
    }
    
}
