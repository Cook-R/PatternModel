package Builder;

public class ConcreteBuilder extends Builder {
    Product product= new Product();
    @Override
    public void BuilderPartA() {
            product.Add("部件A");
    }

    @Override
    public void BuilderPartB() {
        product.Add("部件B");
    }

    @Override
    public Product GetResult() {
        return product;
    }
}
