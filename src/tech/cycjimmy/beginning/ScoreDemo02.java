package tech.cycjimmy.beginning;

import java.util.Scanner;

/**
 * 功能：实现接受三个班级的各四名学员的成绩信息，然后计算每个班级学员的平均分
 */
public class ScoreDemo02 {
    public static void main(String[] args) {
        int classNum = 3;
        int stuNum = 4;
        double sum = 0;
        double avg = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= classNum; i++) {
            sum = 0;
            System.out.println("***请输入第" + i + "个班级的成绩***");
            for (int j = 1; j <= stuNum; j++) {
                System.out.println("请输入第" + j + "个学员的成绩");
                int score = input.nextInt();

                sum += score;
            }
            avg = sum / stuNum;
            System.out.println("第" + i + "个班级学生的平均分为：" + avg);
        }
    }
}
