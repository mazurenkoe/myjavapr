package ExamStudent;

import java.util.*;

public class StudentRunner {
    public static void main(String[] args) {

        Student student1 = new Student("Pupr", "Bbb", "rtthtrh", "18.11.2003", "3", "15", 3, 1, 5, 5, 3);
        Student student2 = new Student("An", "An", "rrrr", "13.11.2003", "3", "15", 3, 1, 5, 5, 3);
        Student student3 = new Student("Vasia", "GGG", "bbbbbb", "10.11.2003", "3", "15", 3, 1, 5, 5, 3);


        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);

        //Упорядочите студентов по курсу
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.course.compareTo(s2.course);
            }
        });

        System.out.println(Arrays.deepToString(list.toArray()));
    }
}
