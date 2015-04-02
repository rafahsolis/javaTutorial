package tutorial1;

class Person {
    String name;
    int age;
    
    void speak() {
            System.out.println("My name is " + name + " and i am " + age + " years old."); 
    }
}

public class Classes {
    public static void main(String[] args){
            Person person1 = new Person();
            
            person1.name = "Jhon Doe";
            person1.age = 37;

            person1.speak();
    }
}