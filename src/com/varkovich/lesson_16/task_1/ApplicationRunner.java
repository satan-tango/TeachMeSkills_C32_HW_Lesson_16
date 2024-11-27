package com.varkovich.lesson_16.task_1;

import com.varkovich.lesson_16.task_1.model.Student;

import java.util.*;

public class ApplicationRunner {

    public static void main(String[] args) {
        Set<String> passportNumbers = new HashSet<>();
        Set<Student> students = new HashSet<>();

        for (; ; ) {
            passportNumbers.add("KH" + generateRandomDigits(7));
            if (passportNumbers.size() == 15) {
                break;
            }
        }
        students.add(new Student("Dmitriy"));
        students.add(new Student("Ilya"));
        students.add(new Student("Bogdan"));
        students.add(new Student("Igor"));
        students.add(new Student("Marina"));
        students.add(new Student("Daniil"));
        students.add(new Student("Sultan"));
        students.add(new Student("Georgi"));
        students.add(new Student("Kirill"));
        students.add(new Student("Kate"));
        students.add(new Student("Dmitry"));
        students.add(new Student("Rita"));
        students.add(new Student("Vlad"));
        students.add(new Student("Sergio"));
        students.add(new Student("Oleg"));

        Iterator<String> passportNumberIterator = passportNumbers.iterator();
        Iterator<Student> studentIterator = students.iterator();
        Map<String, Student> studentsData = new HashMap<>();

        while (passportNumberIterator.hasNext()) {
            studentsData.put(passportNumberIterator.next(), studentIterator.next());
        }

        studentsData.forEach((k, v) -> System.out.println(k + " -> " + v.getName()));

    }

    public static int generateRandomDigits(int n) {
        int m = (int) Math.pow(10, n - 1);
        return m + new Random().nextInt(9 * m);
    }
}
