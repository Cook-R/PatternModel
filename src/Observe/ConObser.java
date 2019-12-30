package Observe;

public class ConObser extends Observe {

    private String name;

    private ConSubject conSubject;

    public ConObser(String name, ConSubject conSubject) {
        this.name = name;

        this.conSubject = conSubject;
    }

    @Override
    void Update() {
        conSubject = getConSubject();
        System.out.println("观察者" + conSubject + " 状态" + conSubject.getState());
    }

    public ConSubject getConSubject() {
        return conSubject;
    }

    public void setConSubject(ConSubject conSubject) {
        this.conSubject = conSubject;
    }
}
