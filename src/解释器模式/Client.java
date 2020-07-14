package 解释器模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/14 20:48
 * @Version: 1.0
 **/
public class Client  {
    public static void main(String[] args) {
        Context context = new Context();

        VarExp x = new VarExp("X");
        VarExp y = new VarExp("Y");
        VarExp z = new VarExp("Z");

        context.assign("X", true);
        context.assign("Y", false);
        context.assign("Z", true);

        //测试表达式 ：(z and x) and (y and (not x))
        BoolExp expression = new AndExp(new AndExp(z, x),new AndExp(y, new NotExp(x)));
        boolean result = expression.evaluate(context);
        System.out.println("(z and x) and (y and (not x))表达式结果：" + result);

        //测试表达式 ：(z and x) or (y and (not x))
        BoolExp expression1 = new OrExp(new AndExp(z, x),new AndExp(y, new NotExp(x)));
        boolean result1 = expression1.evaluate(context);
        System.out.println("(z and x) or (y and (not x))表达式结果：" + result1);
    }
}
