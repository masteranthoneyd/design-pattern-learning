package com.yangbingdong.principle.isp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.concurrent.TimeUnit;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
@ExtendWith(MockitoExtension.class)
class HotfixerSchedulerTest {

    @Test
    public void testRunHotfix() throws InterruptedException {
        Hotfixer hotfixer = Mockito.spy(new RabbitConfig("127.0.0.1", "6379"));
        HotfixerScheduler hotfixerScheduler = new HotfixerScheduler(hotfixer, 100L, 100L);
        hotfixerScheduler.runHotfix();
        TimeUnit.SECONDS.sleep(1);
        hotfixerScheduler.shutdown();
        verify(hotfixer, atLeastOnce()).update();
    }

}
