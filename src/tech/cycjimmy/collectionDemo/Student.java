package tech.cycjimmy.collectionDemo;

import java.util.Objects;
import java.util.Set;
import java.util.HashSet;

/**
 * 学生类
 */
public class Student implements Comparable<Student> {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Set<Course> courses;

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new HashSet<Course>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.getId());
    }
}
