package com.yangbingdong.behavioral.strategy.positive;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.File;

import static com.yangbingdong.behavioral.strategy.positive.Sorter.GB;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
class SorterTest {

    @Test
    void testSort() {
        File file = Mockito.mock(File.class);
        Mockito.doReturn(8 * GB).when(file).length();

        SortAlgoStrategy strategy = Mockito.spy(SortAlgoStrategy.class);
        Sorter sorter = new Sorter(strategy);
        sorter.sort(file);

        Mockito.verify(strategy).getSortAlgo(8 * GB);

    }
}
