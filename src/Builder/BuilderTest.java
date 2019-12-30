package Builder;

public class BuilderTest {
    public static void main(String[] args) {
        Director director = new Director();
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();
        director.Constrrct(concreteBuilder);
        Product product = concreteBuilder.GetResult();
        product.Show();

    }
}
