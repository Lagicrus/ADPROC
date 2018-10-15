public class Course {

    private String name;
    private String code;
    private int numStudents = 0;

    Student[] student_list = new Student[10];


    public Course(String nm, String cd) {
        name = nm;
        code = cd;
    }

    public void addStudent(Student st) {    //needs check first whether the student_list is full
        student_list[numStudents] = st;
        numStudents += 1;
    }

    public double averageSc() {
        double sum = 0.0;
        for (int i = 0; i < numStudents; i++)
            sum += student_list[i].avScore();
        return (sum / numStudents);
    }

    public int getNumStud() {
        return numStudents;
    }

    public String getName() {
        return name;
    }
}