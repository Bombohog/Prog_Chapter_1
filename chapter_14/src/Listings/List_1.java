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
import javafx.stage.Stage;

public class List_1 extends Application {

    @Override
    public void start(Stage primaryStage) {

        Button btOK = new Button("OK");
        Scene scene = new Scene(btOK, 200, 250);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) { Application.launch(args); }

}
