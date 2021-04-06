package fxmlsample3;

import javafx.event.ActionEvent;
import sqlite.SqliteDemo;

public class OtherController {


    public void click(ActionEvent actionEvent) {
        System.out.println("another is called");
        //测试调用sqlite进行数据持久化
        SqliteDemo.createTable();
        SqliteDemo.insert();
        SqliteDemo.searchDemo();
    }
}
