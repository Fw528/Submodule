package GUI;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.WindowEvent;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {
    Button Bstart;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage stage = primaryStage;
        primaryStage.setTitle("Huluwa-hahahahaha");
        AnchorPane root = new AnchorPane();
        Scene scene = new Scene(root, 980, 600);
        MainCanvas mainCanvas = new MainCanvas(980, 600);
        Bstart = new Button("开始");
        root.getChildren().add(mainCanvas);
        scene.getStylesheets().add(getClass().getClassLoader().getResource("sample.fxml").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {//关闭窗口结束所有线程
            public void handle(WindowEvent event) {
                System.exit(0);
            }
        });
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}