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

    /**
     * 执行一次命令
     *
     * @param beforeDistance 执行前距离
     * @param commandType    命令类型
     * @param oneDistance    执行距离
     * @return 执行后距离
     */
    private static int executeOneCommand(int beforeDistance, String commandType, int oneDistance) {
        int afterDistance = beforeDistance;
        // 前进
        if ("BK".equals(commandType)) {
            afterDistance += oneDistance;
            // 后退
        } else if ("FD".equals(commandType)) {
            afterDistance -= oneDistance;
        }
        return afterDistance;

    }

    public int calculateDistance(String commands) {
        return Math.abs(parseAndExecute(commands));// 使用 int[] index 是为了在递归调用中保持 index 的引用，从而更新其值
    }

    /**
     * 解析然后处理命令
     *
     * @param commands
     * @return
     */
    private int parseAndExecute(String commands) {
        int distance = 0;
        while (index < commands.length()) {
            char c = commands.charAt(index);
            // 当前子命令的最后一个字符，跳出循环
            if (c == ']') {
                index++;
                break;
            }
            // 空格，继续解析一下个命令
            if (c == ' ') {
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
                // 跳过 '['
                index++;
                // REPEAT, 乘以后面的部分
                distance += k * parseAndExecute(commands);
            } else {
                distance = executeOneCommand(distance, commandType.toString(), k);
            }
        }
        return distance;
    }
}
