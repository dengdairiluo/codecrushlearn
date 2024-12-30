package com.yuren.codecrushlearn.Q2200;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2024-12-29 23:37
 */
public class Q2201 {

    public int drink(int n) {
        int bottles = n;
        int caps = n;
        int totalDrinks = n;

        // 判断能不能喝酒
        while (bottles >= 3 || caps >= 5) {
            // 计算新喝的酒
            int newDrinks = bottles / 3 + caps / 5;
            totalDrinks += newDrinks;

            // 更新剩余的酒瓶和瓶盖
            bottles = bottles % 3 + newDrinks;
            caps = caps % 5 + newDrinks;
        }

        return totalDrinks;
    }
}
