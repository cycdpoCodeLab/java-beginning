package tech.cycjimmy.beginning;

public class calculate01 {
    /**
     * 计算 (sqrt(20) + sqrt(10)) / (sqrt(20) - sqrt(10))
     * 小数点后保留一位
     *
     * @param args
     */
    public static void main(String[] args) {
        String printStr = "(sqrt(20) + sqrt(10)) / (sqrt(20) - sqrt(10)) = ";
        double sqrt10 = Math.sqrt(10);
        double sqrt20 = Math.sqrt(20);
        double result = (sqrt20 + sqrt10) / (sqrt20 - sqrt10);
        result = Math.round(result * 10) / 10.0;

        printStr += result;
        System.out.println(printStr);
    }
}
