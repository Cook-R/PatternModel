package Observe;

public class Test {
    public static void main(String[] args) {


        ConSubject conSubject = new ConSubject();
        conSubject.Add(new ConObser("X", conSubject));
        conSubject.Add(new ConObser("Y", conSubject));
        conSubject.setState("!!!");
        conSubject.Notify();
    }
}
