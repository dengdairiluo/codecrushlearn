package com.yuren.codecrushlearn.Q0;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2024-12-11 23:53
 */
public class Q2106 {

    public String formatTime(long timestamp) {
        long currentTime = 1707838655485L;
        long diff = currentTime - timestamp;

        final long ONE_MINUTE_MS = 60000;
        final long ONE_HOUR_MS = 60 * ONE_MINUTE_MS;
        final long ONE_DAY_MS = 24 * ONE_HOUR_MS;
        final long ONE_MONTH_MS = 30 * ONE_DAY_MS;
        final long ONE_YEAR_MS = 365 * ONE_DAY_MS;

        if (diff < ONE_MINUTE_MS) {
            return "刚刚发布";
        } else if (diff < ONE_HOUR_MS) {
            long minutes = diff / ONE_MINUTE_MS;
            return minutes + "分钟前发布";
        } else if (diff < ONE_DAY_MS) {
            long hours = diff / ONE_HOUR_MS;
            return hours + "小时前发布";
        } else if (diff < ONE_MONTH_MS) {
            long days = diff / ONE_DAY_MS;
            return days + "天前发布";
        } else if (diff < ONE_YEAR_MS) {
            long months = diff / ONE_MONTH_MS;
            return months + "个月前发布";
        } else {
            long years = diff / ONE_YEAR_MS;
            return years + "年前发布";
        }
    }
}
