package ex1;

public class myListTest {
    public static void main(String[] args) {
        myList<String> arr=new myList<String>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        System.out.println("elment 2: "+arr.get(1));
        System.out.println("elment 3: "+arr.get(2));
        System.out.println("elment 1: "+arr.get(0));

        System.out.println("elment 5"+arr.get(4));

    }
}
