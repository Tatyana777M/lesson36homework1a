public class Main {
            public static void main(String[] args) {
                MyList myList = new MyList() {
                    @Override
                    public void add(String element) {
                    }
                    @Override
                    public int size() {
                        return 0;
                    }
                    @Override
                    public void print() {
                    }
                };
                myList.add("str1");
                myList.add("str2");
                myList.add("str3");
                myList.add("str4");

                System.out.println(myList.size());
                System.out.println(myList);
                System.out.println("-------------------------");

                for (int i = 0; i < myList.size() ; i++) {
                    System.out.println(myList.get(i));
                }


    }
}