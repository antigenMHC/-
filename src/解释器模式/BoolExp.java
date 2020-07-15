package 解释器模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/14 20:25
 * @Version: 1.0
 **/
public interface BoolExp {

    /**
     * 解释上下文表达式，计算出结果
     * @param context：表达式
     * @return：结果
     */
    boolean evaluate(Context context);
    BoolExp replace(String var, BoolExp exp);
    BoolExp copy();
}
