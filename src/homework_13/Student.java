package homework_13;

public class Student {
    private String name;
    private int grade;
    private static int totalStudents = 0;
    
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }
    
    public String getStatus() {
        if (grade >= 90) {
            return "Отлично";
        } else if (grade >= 70) {
            return "Хорошо";
        } else if (grade >= 50) {
            return "Удовл.";
        } else {
            return "Неуд.";
        }
    }
    
    public static int getTotalStudents() {
        return totalStudents;
    }
    
    @Override
    public String toString() {
        return "Student{name='" + name + "', grade=" + grade + ", status='" + getStatus() + "'}";
    }
}