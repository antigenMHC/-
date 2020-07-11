package 命令模式.宏命令模式;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/11 21:52
 * @Version: 1.0
 **/
public class FridgeMacroCommond implements MacroCommond {

    List<Commond> commonds;

    public FridgeMacroCommond(){
        commonds = new ArrayList<>();
    }

    @Override
    public void addCommond(Commond commond) {
        commonds.add(commond);
    }

    @Override
    public void deleCommond(Commond commond) {
        commonds.remove(commond);
    }

    public void execute(){
        for (Commond commond : commonds) {
            commond.execute();
        }
    }
}
