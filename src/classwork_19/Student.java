package classwork_19;

public class Student {
    String name;
    String group;
    int[] grades;
    int count;
    
    public Student(String name, String group) {
        this.name = name;
        this.group = group;
        this.grades = new int[100];
        this.count = 0;
        
        }
    void addGrade(int grade) {
    	if (count < grades.length) {
    		grades[count] = grade;
    		count++;
    	}
    	
    }
    double averageGrade() {
    	if (count == 0) {
    		return 0;
    	}
    	
    	double sum = 0;
    	for (int i = 0; i < count; i++) {
    		sum = sum + grades[i];
    	}
    	
    	return sum / count;
    }
}
