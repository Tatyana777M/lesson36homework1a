public abstract class MyList {
    public abstract void add(String element);

    public abstract int size();

    public String get(int i) {
        return String.valueOf(false);
    }

    public abstract void print();

    public interface myList {

        void add(String element);
        int size();
        String get(int index);

        void print();
    }
}
