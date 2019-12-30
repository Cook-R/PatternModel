package Bridge;

public class BrandMi extends HardsetBrand {
    public BrandMi(Soft soft) {
        super(soft);
    }

    @Override
    void run() {
        System.out.println("使用小米手机");
        soft.run();
    }
}
