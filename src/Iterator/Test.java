package Iterator;

import Mediator.Colleague;

public class Test {
    public static void Process(MyCollection collection) {
        Iterator iterator = collection.createIterator();
        while (!iterator.IsDone()) {
            System.out.println(iterator.CurrentItem().toString());
            iterator.Next();
        }
    }
    public static void main(String[] args) {
        NewCollection newCollection = new NewCollection();
        Process(newCollection);
    }
}
