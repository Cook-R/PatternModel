package Iterator;

public class NewCollection extends MyCollection {
    private Object[] obj = {"dog", "pig", "cat", "monkey", "pig"};

    @Override
    public Iterator createIterator() {
        return new NewIterator();
    }

    private class NewIterator extends Iterator {

        private int currentIndex = 0;
        @Override
        public void first() {
            currentIndex = 0;
        }

        @Override
        public void Next() {
            if (currentIndex < obj.length) {
                currentIndex++;
            }
        }

        @Override
        public boolean IsDone() {
            return currentIndex == obj.length;
        }

        @Override
        public Object CurrentItem() {
            return obj[currentIndex];
        }
    }

}
