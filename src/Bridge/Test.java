package Bridge;

public class Test {
    public static void main(String[] args) {

        BrandHuwei huwei = new BrandHuwei(new SoftGame());
        huwei.run();

        BrandMi mi = new BrandMi(new SoftStudy());
        mi.run();
    }
}
