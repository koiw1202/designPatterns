//package prototypePattern;
//
//import java.util.List;
//
///**
// * description    :
// * ===========================================================
// * DATE              AUTHOR             NOTE
// * -----------------------------------------------------------
// * 2024-02-22        koiw1       최초 생성
// */
//public class Main {
//    public static void main(String args[]) throws CloneNotSupportedException {
//        Employees emps = new Employees();
//        emps.loadData(); // Ann, John, Methew...
//
//        Employees emps1 = (Employees) emps.clone();
//        Employees emps2 = (Employees) emps.clone();
//
//        List< String > list1 = emps1.getEmpList();
//        list1.add("Peter");
//
//        List < String > list2 = emps2.getEmpList();
//        list2.remove("John");
//
//        System.out.println("emps: " + emps.getEmpList());
//        System.out.println("emps1: " + list1);
//        System.out.println("emps2: " + list2);
//    }
//}
