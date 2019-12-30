package Facade;

public class Facade {
    private SubOne subOne ;

    private SubTwo subTwo ;

    private subThree subThree;

    public Facade() {
        subOne =  new SubOne();
        subTwo = new SubTwo();;
        subThree = new subThree();
    }

    public void MethodA() {
        System.out.println("方法组A");
        subThree.MehtodTHree();
        subTwo.MehtodTwo();
        subOne.MehtodOne();
    }
}
