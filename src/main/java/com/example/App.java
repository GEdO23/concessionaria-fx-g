package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

//* JavaFX App
/*
* 04 - CONTATOS

* - Crie duas tabelas: uma para contatos e outra para grupos;
    
TODO: - Estabeleça um relacionamento onde cada contato pode pertencer a vários grupos;
    
TODO: - Implemente operações CRUD para contatos e grupos;
    
TODO: - Permita que os usuários adicionem contatos aos grupos;
    
TODO: - Permita que os usuários vejam os contatos pertencentes a um grupo específico.
*/

public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setTitle("Concessionaria");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("images/icone_concessionaria.png")));
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}