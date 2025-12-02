package uz.pdp.online.lesson2.task.one;

public class GenericClass {
    public static <T extends Comparable<T>> int compare(T a, T b) {
        return a.compareTo(b);
    }
}

class genericClassTest {
    public static void main(String[] args) {
        int compareTest1 = GenericClass.compare(10, 5);
        int compareTest2 = GenericClass.compare(10, 10);
        int compareTest3 = GenericClass.compare(10, 15);

        System.out.println("compareTest1 = " + compareTest1);
        System.out.println("compareTest2 = " + compareTest2);
        System.out.println("compareTest3 = " + compareTest3);
    }
}
