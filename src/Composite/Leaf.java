package Composite;


public class Leaf extends Component {


    public Leaf(String name) {
        super(name);
    }

    @Override
    public void Add(Component component) {
        System.out.println("叶子不能新增");
    }

    @Override
    public void remove(Component component) {

        System.out.println("叶子不能移除");
    }


    @Override
    public void disPlay(int mum) {
        System.out.println("++第" + mum + "层++名字为：" + name);

    }
}
