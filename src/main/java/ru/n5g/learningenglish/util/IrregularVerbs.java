package ru.n5g.learningenglish.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author Belyaev
 *
 * Неправельные глаголы
 */
public class IrregularVerbs {
    private Map<String, String[]> map = getMap();
    private Random random = new Random(System.nanoTime());

    protected Map<String, String[]> getMap() {
        Map<String, String[]> words = new HashMap<String, String[]>();
        words.put("быть", new String[]{"be", "was were", "been"});
        words.put("бить", new String[]{"beat", "beat", "beaten"});
        return words;
    }


    public String getRandom() {
        int month = random.nextInt(map.size());
        return String.valueOf(map.keySet().toArray()[month]);
    }

    public String[] translate(String timesYear) {
        return map.get(timesYear);
    }
}
