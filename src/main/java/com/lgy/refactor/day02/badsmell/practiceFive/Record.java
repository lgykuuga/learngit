package com.lgy.refactor.day02.badsmell.practiceFive;

import java.util.HashMap;
import java.util.Map;

public class Record {

    private Map<String, Long> records = new HashMap<>();

    public long getTimes(String behavior) {
        return records.get(behavior);
    }

    public void increase(String behavior) {

        Long crawlTimes = records.get(behavior);
        if (crawlTimes != null) {
            records.put(behavior, crawlTimes + 1);
            return;
        }
        records.put(behavior, 1L);
    }
}
