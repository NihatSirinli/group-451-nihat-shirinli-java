package classswork_11;

public class Person {
    private String name;
    private int age;
	
    public Person(String name, int age) {
        this.name = name;
        setAge(age);
    }
    
    private void setAge(int age2) {
		// TODO Auto-generated method stub
		
	}

	public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge1(int age) {
        if (age < 0) return;
        this.age = age;
    }
}
