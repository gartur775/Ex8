public class Teacher extends People{
    Teacher(String nameP, String lastnameP, int ageP){
        super(nameP,lastnameP,ageP);
    }

    @Override
    void voice(){
        System.out.println("Teacher " + name + " is explaining a subject to a class.");
    }
    void teach(){
        System.out.println("Your " + name + " is teaching a class!");
    }
}