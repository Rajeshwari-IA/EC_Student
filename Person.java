package Assignment;

public class Person {
	String name;
    int age;
    String gender;

    
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println();
    }

    
    public static void main(String[] args) {
        
        Person person1 = new Person("Rajeshwari", 21, "Female");

        
        Person person2 = new Person("Raju", 23, "Male");

        
        person1.displayInfo();
        person2.displayInfo();


}
}
