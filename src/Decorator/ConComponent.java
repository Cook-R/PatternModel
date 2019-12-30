package Decorator;

public class ConComponent extends Component {
    @Override
    void Operation() {
        System.out.println("具体要装饰的对象");
    }
}
