package com.yuren.codecrushlearn.Q0;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2024-12-07 23:36
 */
public class Q2104 {

    public List<String> split(String s, char t) {
        List<String> result = new ArrayList<>();
        int start = 0;
        int end = s.indexOf(t);
        while (end != -1) {
            if (start != end) {
                result.add(s.substring(start, end));
            }
            start = end + 1;
            end = s.indexOf(t, start);
        }

        if (start < s.length()) {
            result.add(s.substring(start));
        }

        return result;
    }
}
