package tech.cycjimmy.collectionDemo;

/**
 * 课程类
 */
public class Course {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Course() {
    }
}
