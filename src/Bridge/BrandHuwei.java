package Bridge;

public class BrandHuwei extends HardsetBrand {
    public BrandHuwei(Soft soft) {
        super(soft);
    }

    @Override
    void run() {
        System.out.println("使用华为手机");
        soft.run();
    }
}
