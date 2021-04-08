package rpc;

/**
 * 命令接口
 */
@FunctionalInterface
public interface Task {

    void execute(String[] cmd);
}
