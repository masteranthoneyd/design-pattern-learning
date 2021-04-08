package com.yangbingdong.behavioral.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class FilterChain {

    private final Service service;
    private final List<Filter> filters = new ArrayList<>();
    private int cursor = 0;

    public FilterChain(Service service) {
        this.service = service;
    }

    public void filter(String s) {
        if (cursor < filters.size()) {
            Filter filter = filters.get(cursor++);
            filter.filter(s, this);
        } else {
            service.doService(s);
        }
    }

    public void addFilter(Filter filter) {
        filters.add(filter);
    }
}
