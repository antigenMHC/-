package 解释器模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/14 20:34
 * @Version: 1.0
 **/
public class NotExp implements BoolExp {
    private BoolExp operand1;

    public NotExp(BoolExp oper1) {
        operand1 = oper1;
    }

    @Override
    public boolean evaluate(Context c) {
        return !(operand1.evaluate(c));
    }

    @Override
    public BoolExp copy() {
        return new NotExp(operand1.copy());
    }

    @Override
    public BoolExp replace(String var, BoolExp exp) {
        return new NotExp(operand1.replace(var, exp));
    }
}
