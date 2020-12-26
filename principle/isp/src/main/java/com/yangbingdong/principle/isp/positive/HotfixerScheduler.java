package com.yangbingdong.principle.isp.positive;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class HotfixerScheduler {

    public ScheduledExecutorService scheduledExecutorService;
    public Hotfixer hotfixer;
    public long initDelay;
    public long period;
    public volatile boolean destroyed = false;

    public HotfixerScheduler(Hotfixer hotfixer, long initDelay, long period) {
        this.hotfixer = hotfixer;
        this.initDelay = initDelay;
        this.period = period;
        init();
    }

    private void init() {
        scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
    }

    public void runHotfix() {
        scheduledExecutorService.scheduleAtFixedRate(() -> hotfixer.update(), initDelay, period, TimeUnit.MILLISECONDS);
    }

    public void shutdown() {
        if (destroyed) {
            return;
        }
        scheduledExecutorService.shutdown();
        destroyed = true;
    }

}
