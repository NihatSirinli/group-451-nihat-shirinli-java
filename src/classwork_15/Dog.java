package classwork_15;

public class Dog {
	String name = "King-Kong";
	int age = 179;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
        void bark() {
        	System.out.println("Woof");
    }
        
    String getName() {
    	return name;
    }
    
    int getAge() {
    	return age;
    }
    
    void setAge(int age) {
    	if(age >= 0) {
    		this.age = age;
    	}
    }
}
