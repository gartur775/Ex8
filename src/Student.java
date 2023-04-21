public class Student extends People{
    Student(String nameP, String lastnameP, int ageP){
        super(nameP,lastnameP,ageP);
    }

    @Override
    void walk(){
        System.out.println("Student " + name + " is not allowed to walk during class.");
    }
    void learn(){
        System.out.println("Your " + name + " is attending a class!");
    }
}