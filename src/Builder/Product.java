package Builder;

import java.util.ArrayList;
import java.util.List;

public class Product {

    List<String> parts = new ArrayList<String>();

    public void Add(String part) {
        parts.add(part);
    }

    public void Show() {
        System.out.println("产品 创建```");
        for (String part : parts) {
            System.out.printf(part);
        }
    }


}
