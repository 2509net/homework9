package ru.geekbrains.lesson9.hw;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HomeWorkData {

    public static Course getRandomCourse() {
        Random random = new Random();
        List<String> courses = Arrays.asList("Java", "Go", "Python", "Swift", "JavaScript", "C#");
        return new Course(courses.get(random.nextInt(courses.size())));
    }

    public static List<Student> getStudentsList() {
        Course course1 = new Course("Java");
        Course course2 = new Course("Go");
        Course course3 = new Course("Python");
        Course course4 = new Course("Swift");
        Course course5 = new Course("JavaScript");
        Course course6 = new Course("C#");

        Student student1 = new Student("Student1", Arrays.asList(course1, course2, course6));
        Student student2 = new Student("Student2", Arrays.asList(course4, course2));
        Student student3 = new Student("Student3", Arrays.asList(course5, course3, course1, course4));
        Student student4 = new Student("Student4", Arrays.asList(course2));
        Student student5 = new Student("Student5", Arrays.asList(course5, course1));
        Student student6 = new Student("Student6", Arrays.asList(course4, course1, course2));

        return Arrays.asList(student1, student2, student3, student4, student5, student6);
    }
}
