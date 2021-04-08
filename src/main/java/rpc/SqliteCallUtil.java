package rpc;

import java.io.*;

/**
 * java通过cmd调用sqlite相关的命令
 */
public class SqliteCallUtil {

    public static void dump(String cmd){
        //导出数据库
        String cmd1 = "cmd /c  sqlite3 c:/sqlite/test.db .dump > c:/sqlite/export.sql";

        cmdExecute(cmd1);
    }

    public void read(String importCmd){
        //导入数据到指定数据库
        String importCmd1 = "cmd /c sqlite3 c:/sqlite/test.db \".read c:/sqlite/export.sql\"";
        cmdExecute(importCmd1);
    }

    static void cmdExecute(String cmd){
        try {
            Process process = Runtime.getRuntime().exec(cmd);
            System.out.println("input:" + getStreamStr(process.getInputStream()));
            System.out.println("error:" + getStreamStr(process.getErrorStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String getStreamStr(InputStream in){
        String s = null;
        StringBuilder builder = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(in, "gbk"));
            while((s = bufferedReader.readLine()) != null){
                builder.append(s + "\n");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return builder.toString();
    }

    static void cmdArrayExecute(String[] cmd){
        try {
            Process process = Runtime.getRuntime().exec(cmd);
            System.out.println("input:" + getStreamStr(process.getInputStream()));
            System.out.println("error:" + getStreamStr(process.getErrorStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        dump(new String());
    }
}
