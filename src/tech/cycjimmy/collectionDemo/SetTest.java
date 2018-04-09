package tech.cycjimmy.collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
    private List<Course> coursesToSelect;

    public SetTest() {
        coursesToSelect = new ArrayList<Course>();
    }

    /**
     * 用于往coursesToSelect中添加被选课程
     */
    private void testAdd() {
        Course cr1 = new Course("1", "数据结构");
        coursesToSelect.add(cr1);

        Course cr2 = new Course("2", "C语言");
        coursesToSelect.add(0, cr2);

        Course[] course = {
                new Course("3", "离散数学"),
                new Course("4", "汇编语言")
        };
        coursesToSelect.addAll(Arrays.asList(course));

        Course[] course2 = {
                new Course("5", "高等数学"),
                new Course("6", "大学英语")
        };
        coursesToSelect.addAll(2, Arrays.asList(course2));
    }

    private void testForEach() {
        for (Course cr : coursesToSelect) {
            System.out.println("课程：" + cr.getId() + ":" + cr.getName());
        }
    }

    private void testForEachForSet(Student student) {
        for (Course cr : student.getCourses()) {
            System.out.println("课程：" + cr.getId() + ":" + cr.getName());
        }
    }

    public static void main(String[] args) {
        SetTest st = new SetTest();
        st.testAdd();
        st.testForEach();

        // 创建学生对象
        Student student = new Student("1", "小明");
        System.out.println("欢迎学生：" + student.getName() + "选课！");

        // 创建一个Scanner对象，用来接收从键盘输入的课程ID
        Scanner console = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入课程ID");
            String courseId = console.next();

            for (Course cr : st.coursesToSelect) {
                if (cr.getId().equals(courseId)) {
                    student.getCourses().add(cr);
                }
            }
        }

        // 打印输出学生所选的课程
        st.testForEachForSet(student);
    }
}
