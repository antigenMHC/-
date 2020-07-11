package 命令模式.宏命令模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/11 21:50
 * @Version: 1.0
 **/

/**
 * 宏命令接口
 */
public interface MacroCommond {

    //添加命令
    void addCommond(Commond commond);

    //删除命令
    void deleCommond(Commond commond);

    //宏命令执行
    void execute();
}
