package Visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private List<Element> elements = new ArrayList<Element>();

    public void add(Element element) {
        elements.add(element);
    }

    public void datch(Element element) {
        if (elements == null) {

            elements.remove(element);
        }
    }

    public void Access(Visitor visitor) {
        for (Element element : elements) {
            element.Accept(visitor);
        }
    }


}
