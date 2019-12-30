package State;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

public class Test {
    public static void main(String[] args) {


        ConSateB conSateB = new ConSateB();
        Context context = new Context(conSateB);
        context.request();
        context.request();
        context.request();

    }
}
