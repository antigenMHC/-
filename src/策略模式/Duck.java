package 策略模式;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/16 9:05
 * @Version: 1.0
 **/
abstract public class Duck {

    private BeiJingKaoYa beiJingKaoYa;
    private LaoYaTang laoYaTang;

    private String name;

    public String getName() {
        return name;
    }

    public Duck(String name){
        this.name = name;
    }

    abstract public void whatDuck();

    public void canBeiJinKaoYa(){
        if (beiJingKaoYa != null){
            beiJingKaoYa.doDuck();
        }
    }

    public void canLaoYaTang(){
        if(laoYaTang != null){
            laoYaTang.doDuck();
        }
    }

    public void setBeiJingKaoYa(BeiJingKaoYa beiJingKaoYa) {
        this.beiJingKaoYa = beiJingKaoYa;
    }

    public void setLaoYaTang(LaoYaTang laoYaTang) {
        this.laoYaTang = laoYaTang;
    }
}
