package tech.cycjimmy.collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
    private List<Course> coursesToSelect;

    private Scanner console;

    private Student student;

    public SetTest() {
        coursesToSelect = new ArrayList<Course>();
        console = new Scanner(System.in);
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

    /**
     * 测试List的contains方法
     */
    private void testListContains() {
        // 取得备选课程序列的第0个元素
        Course course = coursesToSelect.get(0);

        // 打印输入coursesToSelect是否包含courses对象
        System.out.println("取得课程：" + course.getName());
        System.out.println("备选课程中是否包含课程：" + course.getName() + "," +
                coursesToSelect.contains(course));

        // 创建一个新的课程对象，ID和名称与course对象完全一样
        Course course2 = new Course(course.getId(), course.getName());
        System.out.println("新创建课程：" + course2.getName());
        System.out.println("备选课程中是否包含课程：" + course2.getName() + "," +
                coursesToSelect.contains(course2));

        // 提示输入课程名称
        System.out.println("请输入课程名称：");
        String name = console.next();

        Course course3 = new Course();
        course3.setName(name);
        System.out.println("新创建课程：" + course3.getName());
        System.out.println("备选课程中是否包含课程：" + course3.getName() + "," +
                coursesToSelect.contains(course3));

        // 通过indexOf方法来取得某元素的索引位置
        if (coursesToSelect.contains(course3)) {
            System.out.println("课程" + course3.getName() + "的索引位置为：" +
                    coursesToSelect.indexOf(course3));
        }
    }

    /**
     * 创建学生对象并选课
     */
    public void createStudentAndSelectCourses() {
        // 创建学生对象
        student = new Student("1", "小明");
        System.out.println("欢迎学生：" + student.getName() + "选课！");

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入课程ID");
            String courseId = console.next();

            for (Course cr : coursesToSelect) {
                if (cr.getId().equals(courseId)) {
                    student.getCourses().add(cr);
                }
            }
        }

        // 打印输出学生所选的课程
        testForEachForSet(student);
    }

    /**
     * 测试Set的contains方法
     */
    public void testSetContains() {
        // 提示输入课程名称
        System.out.println("请输入学生已选的课程名称");
        String name = console.next();

        // 创建新课程对象
        Course course = new Course();
        course.setName(name);
        System.out.println("新创建课程：" + course.getName());
        System.out.println("备选课程中是否包含课程：" + course.getName() + "," +
                student.getCourses().contains(course));
    }

    public static void main(String[] args) {
        SetTest st = new SetTest();
        st.testAdd();
        //st.testListContains();
        st.testForEach();

        st.createStudentAndSelectCourses();
        st.testSetContains();
    }
}
