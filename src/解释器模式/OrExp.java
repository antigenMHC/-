package 解释器模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/14 20:34
 * @Version: 1.0
 **/
public class OrExp implements BoolExp {
    private BoolExp operand1;
    private BoolExp operand2;

    public OrExp(BoolExp oper1, BoolExp oper2) {
        operand1 = oper1;
        operand2 = oper2;
    }

    @Override
    public boolean evaluate(Context c) {
        return operand1.evaluate(c) || operand2.evaluate(c);
    }

    @Override
    public BoolExp copy() {
        return new OrExp(operand1.copy(), operand2.copy());
    }

    @Override
    public BoolExp replace(String var, BoolExp exp) {
        return new OrExp(operand1.replace(var, exp),operand2.replace(var, exp));
    }
}
