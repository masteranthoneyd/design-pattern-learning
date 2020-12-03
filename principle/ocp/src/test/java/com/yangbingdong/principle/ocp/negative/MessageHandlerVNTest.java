package com.yangbingdong.principle.ocp.negative;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentCaptor.forClass;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
@ExtendWith(MockitoExtension.class)
class MessageHandlerVNTest {

    @Spy
    private MessageHandlerV1 messageHandlerV1;
    @Spy
    private MessageHandlerV2 messageHandlerV2;


    @Test
    void testHandleMessageA() {
        String message = "A";
        messageHandlerV1.handle(message);

        ArgumentCaptor<String> argumentCaptor = forClass(String.class);
        verify(messageHandlerV1, times(1)).handleSceneA(argumentCaptor.capture());
        verify(messageHandlerV1, never()).handleSceneB(anyString());

        String value = argumentCaptor.getValue();
        assertEquals(value, "A");
    }

    @Test
    void testHandlerV1HandleMessageC() {
        String message = "C";
        messageHandlerV1.handle(message);
        verify(messageHandlerV1, times(1)).handle(anyString());
        verifyNoMoreInteractions(messageHandlerV1);
    }

    @Test
    void testHandlerV2HandleMessageC() {
        String message = "C";
        messageHandlerV2.handle(message);
        verify(messageHandlerV2, times(1)).handle(anyString());
        verify(messageHandlerV2, times(1)).handleSceneC(anyString());
        verifyNoMoreInteractions(messageHandlerV1);
    }
}
