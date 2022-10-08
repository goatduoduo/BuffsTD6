package org.duoduo.entrance;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

/**
 * @Author: goatduoduo
 * @Description:
 * @Date: Created in 2022/10/8 23:33
 */
public class Entrance extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../mainstage/MainStage.fxml")));

        primaryStage.setTitle("Buffs TD 6: A Complex Buffs' Calculator for BTD6");
        primaryStage.setScene(new Scene(root));
        //primaryStage.getIcons().add(ImageUtil.getImage("bufftd6"));
        primaryStage.show();
    }
}
