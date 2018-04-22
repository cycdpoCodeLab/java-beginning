package tech.cycjimmy.beginning;

public class calculate02 {
    /**
     * 保留小数点后任意位
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("3.874保留小数点后2位" + pround(3.874, 2));
    }

    private static double pround(double value, double index) {
        double pow10 = Math.pow(10, index);
        double result = value * pow10;
        result = Math.round(result);
        result /= pow10;

        return result;
    }
}
