public class Student {
    String name;
    int age;

    public Student(String name , int age) {
        this.name = name;
        this.age = age;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }
//     public void setName(String name) {
//        this.name = name;
//
//     }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}



// Task:
//Create a class called Student with:
//
//Two instance variables: name and age
//
//A method called displayInfo() that prints out the name and age
//
//Then, in your main() method:
//
//Create two students
//
//Assign them different names and ages
//
//Call the displayInfo() method for each one