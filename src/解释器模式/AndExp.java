package 解释器模式;

import 观察者模式.访问者方式.WeatherObsever;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/14 20:32
 * @Version: 1.0
 **/
public class AndExp implements BoolExp {
    private BoolExp operand1;
    private BoolExp operand2;

    public AndExp(BoolExp oper1, BoolExp oper2) {
        operand1 = oper1;
        operand2 = oper2;
    }

    /**
     * 当运算的 operand1 时，会调用到 context.lookUp(name);
     * 返回的是这个变量名所代表的 bool 值
     * @param c
     * @return
     */
    @Override
    public boolean evaluate(Context c) {
        return operand1.evaluate(c) && operand2.evaluate(c);
    }

    @Override
    public BoolExp copy() {
        return new AndExp(operand1.copy(), operand2.copy());
    }

    @Override
    public BoolExp replace(String var, BoolExp exp) {
        return new AndExp(operand1.replace(var, exp),operand2.replace(var, exp));
    }
}
