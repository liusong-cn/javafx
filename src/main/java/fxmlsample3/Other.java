package fxmlsample3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * 另一个视图的相关逻辑
 */
public class Other extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/static/fxmlsample3/sample-another.fxml"));

        Scene scene = new Scene(root, 500, 325);

        stage.setTitle("FXML Welcome Another");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    /**
     * 供外部调用初始化画布
     */
    public void showAnother(){
        Stage stage = new Stage();
        try {
            start(stage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
