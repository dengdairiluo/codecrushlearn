package com.yuren.codecrushlearn.Q2200;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-01-13 00:00
 */
public class Q2208 {

    public int quack(String str) {
        //最大一个字母是u，因此需要'v'作为数组长度
        char[] PREVIOUS = new char['v'];
        char[] arr = "quackq".toCharArray();//末尾多设置一个q，代表q的前面是k
        for (int i = 1; i < arr.length; i++){
            PREVIOUS[arr[i]] = arr[i - 1];
        }

        int[] cnt = new int['v'];
        for (char ch : str.toCharArray()) {
            char pre = PREVIOUS[ch]; // pre 为 ch 在 "quack" 中的上一个字母
            if (cnt[pre] > 0) // 如果有大雁发出了 pre 的声音
                cnt[pre]--; // 是同一只，上一个计数器减一
            else if (ch != 'q') // 没有上一个，第一个必须是q
                return -1; // 不符合要求
            cnt[ch]++; // 发出了 ch 的声音
        }
        // 发出完整的quack声音，除了最后一个字母k，其他的对应的计数都应该为0
        String quack = "quack";
        for (int i = 0; i < quack.length() - 1; i++) {
            if (cnt[quack.charAt(i)] > 0){
                return -1;
            }
        }
        return cnt['k'];
    }
}
