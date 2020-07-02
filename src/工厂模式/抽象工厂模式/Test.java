package 工厂模式.抽象工厂模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/2 9:16
 * @Version: 1.0
 **/
public class Test {
    public static void main(String[] args) {
        ChessFactory chessFactory = new ChessFactory();
        PeiLiao peiLiao = chessFactory.getPeiLiao();
        Pizza pizza = chessFactory.getPizza();

        peiLiao.prepare();
        pizza.prepare();
    }
}
