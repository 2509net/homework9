package ru.geekbrains.lesson9.hw;

import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private List<Course> courses;

    public Student(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
    }

    public String getName() {
        return this.name;
    }
    public List<Course> getAllCourses() {
        return this.courses;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, courses);
    }

    @Override
    public String toString() {
        return this.name;
    }
}

        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(courses, student.courses);
    }


