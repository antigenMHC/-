package 工厂模式.抽象工厂模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/2 9:58
 * @Version: 1.0
 **/
public class ChessFactory implements Factory {
    @Override
    public PeiLiao getPeiLiao() {
        ChessPeiLiao chessPeiLiao = new ChessPeiLiao();
        chessPeiLiao.setName("起司");
        return chessPeiLiao;
    }

    @Override
    public Pizza getPizza() {
        ChessPizza chessPizza = new ChessPizza();
        chessPizza.setName("起司");
        return chessPizza;
    }
}
