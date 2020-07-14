package 解释器模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/14 20:25
 * @Version: 1.0
 **/
public interface BoolExp {

    boolean evaluate(Context context);
    BoolExp replace(String var, BoolExp exp);
    BoolExp copy();
}
