package com.yangbingdong.structure.flyweight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
class ChessmanFactoryTest {

    @Test
    void testGeyChessmanFlyweight() {
        Chessman chessman1 = ChessmanFactory.getChessman(1);
        Chessman chessman2 = ChessmanFactory.getChessman(1);

        Assertions.assertEquals(chessman1, chessman2);
    }

}
