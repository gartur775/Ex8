public class Ex8 {
    public static void main(String[] args) {
        People people =  new People("Artur","Gabyshev",20);
        people.walk();
        people.run();
        people.voice();
        Student student = new Student("Artur2","Gabyshev2",21);
        student.walk();
        student.learn();
        Teacher teacher = new Teacher("Artur3","Gabyshev3",40);
        teacher.voice();
        teacher.teach();
    }
}