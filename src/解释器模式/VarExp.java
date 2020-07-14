package 解释器模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/14 20:35
 * @Version: 1.0
 **/

/**
 * 终结符表达式
 */
public class VarExp implements BoolExp{

    //变量名
    private String name;

    public VarExp(String name){
        this.name = name;
    }

    @Override
    public boolean evaluate(Context context) {
        return context.lookUp(name);
    }

    @Override
    public BoolExp replace(String var, BoolExp exp) {
        if(var.equals(name)) {
            return exp.copy();
        } else {
            return new VarExp(name);
        }
    }

    @Override
    public BoolExp copy() {
        return new VarExp(name);
    }
}
