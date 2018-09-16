

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INTELISENSE
 */
public class Browser extends Application{
    
    private double x, y;

    @Override
    public void start(Stage primaryStage) throws IOException{
        
        Parent root = (Parent)FXMLLoader.load(getClass().getResource("BrowserUI.fxml"));
        
        //set windows icon
        Image icon = new Image(getClass().getResourceAsStream("/image/images.png"));
        primaryStage.getIcons().add(icon);
        
        

        //set a scene for the root node
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        
        //set stage to borderless
        primaryStage.initStyle(StageStyle.UNDECORATED);
        
        //drag it here
        root.setOnMousePressed(event ->{
            x = event.getSceneX();
            y = event.getSceneY();
        });
        
        root.setOnMouseDragged(event ->{
            
            primaryStage.setX(event.getScreenX() - x);
            primaryStage.setY(event.getScreenY() - y);
        });
        
        primaryStage.show();
        
    }
    
    // Application start loading in main method
    public static void main(String[] args){
        launch(args);
    }
    
}
