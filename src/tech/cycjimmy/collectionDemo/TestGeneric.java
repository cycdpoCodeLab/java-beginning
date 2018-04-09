package tech.cycjimmy.collectionDemo;

import java.util.List;
import java.util.ArrayList;

public class TestGeneric {
    /**
     * 带有泛型 Course 的List类型属性
     */
    public List<Course> courses;

    public TestGeneric() {
        this.courses = new ArrayList<Course>();
    }

    public void testAdd() {
        Course cr1 = new Course("1", "大学语文");
        courses.add(cr1);

        // 泛型集合中，不能添加泛型规定的类型及其子类型以外的对象，否则会报错
        // courses.add("能否添加一些奇怪的东西呢？");

        Course cr2 = new Course("2", "Java基础");
        courses.add(cr2);
    }

    public void testForEach() {
        for (Course cr : courses) {
            System.out.println("课程：" + cr.getId() + ":" + cr.getName());
        }
    }

    /**
     * 泛型结合可以添加泛型的子类型的对象实例
     */
    public void testChild() {
        ChildCourse ccr = new ChildCourse();
        ccr.setId("3");
        ccr.setName("子类型的课程对象实例");
        courses.add(ccr);
    }

    public static void main(String[] args) {
        TestGeneric tg = new TestGeneric();
        tg.testAdd();
        tg.testForEach();
        tg.testChild();
        tg.testForEach();
    }
}
