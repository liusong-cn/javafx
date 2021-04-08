package rpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: Administrator
 * @date: 2021/4/7 23:52
 * java调用cmd的通用示例
 */
public class CmdDemo {

    public static void main(String[] args) throws IOException {
        //cmd为win提供的32位程序，向下兼容dos命令，用于用户在命令行界面进行系统相关操作
        //cmd /c 为打开cmd窗口执行后续的命令后关闭窗口
        //cmd /k 为打开cmd窗口执行后续的命令后不关闭窗口
        String[] cmd = {"cmd", "/c", "ping www.baidu.com"};
        Process p = Runtime.getRuntime().exec(cmd);
        //由于cmd的输出默认为gbk编码，而ide中一般设置为utf-8编码，因此需要将cmd的输出结果用正确的编码解析为流
        InputStreamReader reader = new InputStreamReader(p.getInputStream(),"gbk");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String s = "";
        StringBuilder builder = new StringBuilder();
        while((s = bufferedReader.readLine()) != null){
            builder.append(s + "\n");
        }
        System.out.println("程序输出为:" + builder.toString());
        bufferedReader.close();
        reader.close();
        p.getInputStream().close();
    }
}
