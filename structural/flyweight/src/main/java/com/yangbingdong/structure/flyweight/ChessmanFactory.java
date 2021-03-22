package com.yangbingdong.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class ChessmanFactory {


    private static final Map<Integer, Chessman> map = new HashMap<>();

    static {
        map.put(1, new Chessman(1));
        map.put(2, new Chessman(2));
        map.put(3, new Chessman(3));
    }

    public static Chessman getChessman(Integer id) {
        return map.get(id);
    }
}
