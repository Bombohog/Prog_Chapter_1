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

public class List_3 extends Application {

    @Override
    public void start(Stage primaryStage) {

        StackPane pane = new StackPane();
        pane.getChildren().add(new Button("OK"));
        Scene scene = new Scene(pane, 200, 50);
        primaryStage.setTitle("Button in a pane");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) { Application.launch(args); }

}

