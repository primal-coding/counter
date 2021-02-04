package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    private int count = 0;
    @Override
    public void start(Stage primaryStage) throws Exception{
        /*
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    */
        primaryStage.setTitle("Counter Exrecise");
        Label lbl = new Label("Counter");
        TextField tf = new TextField();
        Button btn = new Button();
        btn.setText("Add 1");
        btn.setOnAction(actionEvent -> {
            count++;
            tf.setText("" + count);
            System.out.println("Hello World!!");
        });

        HBox root = new HBox();
        root.setSpacing(15);
        root.setPadding(new Insets(28,28,28,28));
        root.getChildren().addAll(lbl, tf, btn);

        primaryStage.setScene(new Scene(root, 400, 80));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
