package com.yangbingdong.principle.ocp.positive;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
@ExtendWith(MockitoExtension.class)
class MessageHandlerManagerTest {

    private MessageHandlerManager messageHandlerManager;

    @Mock
    private MessageHandlerA messageHandlerA;

    @BeforeEach
    void init() {
        messageHandlerManager = new MessageHandlerManager();
        messageHandlerManager.addHandler(messageHandlerA);
    }

    @Test
    void testHandleMessageA() {
        when(messageHandlerA.supportMessage()).thenReturn("A");
        messageHandlerManager.handle("A", "666");
        verify(messageHandlerA).handle(anyString());
    }
}
