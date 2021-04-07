package com.yangbingdong.behavioral.strategy.negetive;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
class SorterTest {

    @Test
    void testSorter() {
        File file = Mockito.mock(File.class);
        Mockito.doReturn(8 * Sorter.GB).when(file).length();

        Sorter sorter = Mockito.spy(Sorter.class);
        sorter.sortFile(file);

        Mockito.verify(sorter, Mockito.times(1)).externalSort(file);
    }

}
