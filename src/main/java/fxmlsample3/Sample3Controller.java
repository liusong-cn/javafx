package fxmlsample3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Sample3Controller {

    /**
     * 在窗口的某处理函数中加入对其他窗口的调用
     * @param actionEvent
     */
    @FXML
    public void handleSubmitButtonAction(ActionEvent actionEvent) {
        Other other = new Other();
        other.showAnother();
    }
}
