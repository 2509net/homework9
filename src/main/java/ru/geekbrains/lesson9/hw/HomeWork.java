package ru.geekbrains.lesson9.hw;

import java.util.List;
import java.util.stream.Collectors;

public class HomeWork {

    public static void main(String[] args) {
                List<Student> students = HomeWorkData.getStudentsList();
        Course randomCourse = HomeWorkData.getRandomCourse();
        System.out.println(getUnicsCourses(students));
        System.out.println(getStudentsWithMoreCourses(students));
        System.out.println(getStudentsWithCourse(students, randomCourse));
    }

    public static List<Course> getUnicsCourses(List<Student> students) {
        return students.stream()
                .flatMap(student -> student.getAllCourses().stream())
                .distinct()
                .collect(Collectors.toList());
    }


    public static List<Student> getStudentsWithMoreCourses(List<Student> students) {
        return students.stream() // Создаем стрим
                .sorted((s1, s2) -> (s2.getAllCourses().size()) - (s1.getAllCourses().size())) // Сортируем студентов по размерам списков их курсов
                .limit(3) // Ограничиваем результат в соответствии с заданием
                .collect(Collectors.toList()); // Собираем результат в список
    }

    public static List<Student> getStudentsWithCourse(List<Student> students, Course course) {
        System.out.println(course); // Печать рандомного курса в консоль, для проверки
        return students.stream() // Создаем стрим
                .filter(student -> student.getAllCourses().contains(course)) // Фильтруем стрим по принципу, что список курсов студента должен содержать переданный курс
                .collect(Collectors.toList()); // Собираем результат в список
    }

}
