package com.yuren.codecrushlearn.Q0;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2024-11-30 22:47
 */
public class Q1508 {
    int index = 0; // index 代表当前访问的使 字符串的 第 index 个字符
    public int  calculateDistance(String commands) {
        return Math.abs(parseAndExecute(commands));// 使用 int[] index 是为了在递归调用中保持 index 的引用，从而更新其值
    }
    private  int parseAndExecute(String commands) {
        int distance = 0;
        while (index < commands.length()) {
            char c = commands.charAt(index);
            if (c == ']') {
                index++; // 当前子命令的最后一个字符，跳出循环
                break;
            }
            if (c == ' ') {// 空格，继续解析一下个命令
                index++;
                continue;
            }
            StringBuilder commandType = new StringBuilder();
            while (index < commands.length() && commands.charAt(index) != ' ') {
                commandType.append(commands.charAt(index));
                index++;
            }
            index++; // 定位到下一个空格
            StringBuilder number = new StringBuilder();
            while (index < commands.length() && Character.isDigit(commands.charAt(index))) {// 解析数字
                number.append(commands.charAt(index));
                index++;
            }
            int k = Integer.parseInt(number.toString());
            if (commandType.toString().equals("REPEAT")) {
                index++; // 跳过 '['
                distance += k * parseAndExecute(commands);// REPEAT, 乘以后面的部分
            } else if (commandType.toString().equals("BK")) {// 后退
                distance -= k;
            } else if (commandType.toString().equals("FD")) {// 前进
                distance += k;
            }
        }
        return distance;
    }
}
