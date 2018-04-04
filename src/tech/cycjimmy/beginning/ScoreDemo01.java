package tech.cycjimmy.beginning;

import java.util.Scanner;

/**
 * 功能：为指定的成绩加分，直到分数大于等于60为止
 * <p>
 * <p>
 * 使用Scanner工具类来获取用户输入的成绩信息
 * Scanner类位于java.util包中，使用时需要导入此包
 * 步骤：
 * 1.导入java.util.Scanner
 * 2.创建Scanner对象
 * 3.接受并保存用户输入的值
 */
public class ScoreDemo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // 创建Scanner对象
        System.out.print("请输入成绩：");

        int score = input.nextInt();  // 获取用户输入的成绩并保存在变量中
        int count = 0;

        System.out.println("加分前的成绩：" + score);

        while (score < 60) {
            score++;
            count++;
        }

        System.out.println("加分后的成绩：" + score);
        System.out.println("共加分了" + count + "次");
    }
}
