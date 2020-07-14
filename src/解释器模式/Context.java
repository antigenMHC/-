package 解释器模式;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: antigenMHC
 * @Date: 2020/7/14 20:37
 * @Version: 1.0
 **/
public class Context  {
    private Map<String, Boolean> context;

    public Context() {
        this.context = new HashMap<>();
    }

    public void assign(String name, boolean val) {
        context.put(name, val);
    }

    public boolean lookUp(String name) {
        return context.get(name);
    }
}
