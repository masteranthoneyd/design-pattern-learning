package com.yangbingdong.principle.lsp;

import com.yangbingdong.principle.lsp.negative.NegativeEcho;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
@ExtendWith(MockitoExtension.class)
class EchoTest {

    @Test
    void testEcho() {
        Echo echo = new NegativeEcho();
        Assertions.assertThrows(IllegalArgumentException.class, () -> echo.echo(null));
    }
}
