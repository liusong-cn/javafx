package htmlsample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * 使用html来作为页面呈现
 */
public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //以“/”开始表示从class根路径开始取值
        //未引入maven之前fxml放在class同级目录下，通过相对路径getClass().getResource("sample.fxml")
        Parent root = FXMLLoader.load(getClass().getResource("/sample.fxml"));
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.setTitle("使用内嵌html呈现页面");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
