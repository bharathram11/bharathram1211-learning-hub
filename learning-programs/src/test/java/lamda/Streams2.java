package lamda;

import java.util.Arrays;
import java.util.List;

public class Streams2 {
    String name;
    int marks;

    // Constructor
    Streams2(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getMarks() {
        return this.marks;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Marks: " + marks;
    }

    public static void main(String[] args) {
        List<Streams2> studentList = Arrays.asList(
                new Streams2("David", 85),
                new Streams2("Rad", 84),
                new Streams2("Ravi", 82),
                new Streams2("Dadid", 83),
                new Streams2("Dsdadid", 84),
                new Streams2("Ddadada", 22)
        );

        // Filter students with marks >= 82 and print them
        studentList.stream()
                   .filter(s -> s.getMarks() >= 82).limit(3)
                   .forEach(System.out::println);
    }
}
