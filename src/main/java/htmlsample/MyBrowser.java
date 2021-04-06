package htmlsample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class MyBrowser implements Initializable {
    @FXML
    private WebView webView;

    public void initialize(URL location, ResourceBundle resources) {
        WebEngine engine = webView.getEngine();
        //使用本地视图
        String url = getClass().getResource("/static/html-demo1.html").toExternalForm();
//        engine.load(url);
        //加载远程url
        engine.load("http://www.baidu.com");
    }
}
