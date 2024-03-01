package singletonPattern;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-22        koiw1       최초 생성
 */
public class Main {
    public static void main(String args[]) throws CloneNotSupportedException {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Singleton instance3 = Singleton.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance3);

        System.out.println(instance1 == instance2);
        System.out.println(instance1 == instance3);

    }
}
