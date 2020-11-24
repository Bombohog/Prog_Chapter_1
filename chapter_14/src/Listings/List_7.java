/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 23-11-2020
 *
 * Description of program
 ********************************************/

package Listings;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class List_7 extends Application {

    @Override
    public void start(Stage primaryStage) {

        StackPane pane = new StackPane();
        Button btOK = new Button("OK");
        btOK.setStyle("-fx-border-color: blue");
        pane.getChildren().add(btOK);

        pane.setRotate(45);
        pane.setStyle("-fx-border-color: red; -fx-background-color: lightgray");

        Scene scene = new Scene(pane, 200, 250);
        primaryStage.setTitle("NodeStyleRotateDemo");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) { Application.launch(args); }

}
