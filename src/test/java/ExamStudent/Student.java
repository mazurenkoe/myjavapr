package ExamStudent;

public class Student {
    private static long Id = 0;

    public String surname;
    public String name;
    public String secondName;
    public String birth;
    public String course;
    public String groupNumber;
    public int subject_1, subject_2, subject_3, subject_4, subject_5;


    public Student(String surname, String name, String secondName, String birth, String course, String groupNumber, int subject_1, int subject_2, int subject_3, int subject_4, int subject_5) {
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.birth = birth;
        this.course = course;
        this.groupNumber = groupNumber;
        this.subject_1 = subject_1;
        this.subject_2 = subject_2;
        this.subject_3 = subject_3;
        this.subject_4 = subject_4;
        this.subject_5 = subject_5;
    }

}