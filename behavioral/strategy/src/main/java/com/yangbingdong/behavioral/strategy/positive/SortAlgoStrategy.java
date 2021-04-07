package com.yangbingdong.behavioral.strategy.positive;

import java.util.ArrayList;
import java.util.List;

import static com.yangbingdong.behavioral.strategy.positive.Sorter.GB;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class SortAlgoStrategy {

    private final List<AlgoRange> repo = new ArrayList<>();

    public SortAlgoStrategy() {
        registry(0, 6 * GB, new QuickSortAlgo());
        registry(6 * GB, 10 * GB, new ExternalSortAlgo());
        registry(10 * GB, 100 * GB, new ConcurrentExternalSortAlgo());
        registry(100 * GB, Long.MAX_VALUE, new MapreduceSortAlgo());
    }

    public SortAlgo getSortAlgo(long fileLength) {
        for (AlgoRange algoRange : repo) {
            if (algoRange.match(fileLength)) {
                return algoRange.getSortAlgo();
            }
        }
        return null;
    }

    public void registry(long start, long end, SortAlgo sortAlgo) {
        repo.add(new AlgoRange(start, end, sortAlgo));
    }


    private static class AlgoRange {
        private final long start;
        private final long end;
        private final SortAlgo sortAlgo;

        public AlgoRange(long start, long end, SortAlgo sortAlgo) {
            this.start = start;
            this.end = end;
            this.sortAlgo = sortAlgo;
        }

        public SortAlgo getSortAlgo() {
            return sortAlgo;
        }

        public boolean match(long length) {
            return length >= start && length < end;
        }
    }

}
