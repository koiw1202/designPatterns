package prototypePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-22        koiw1       최초 생성
 */
// Employees.java
public class Employees implements Cloneable {
    private List<String> empList;

    public List<String> getEmpList() {
        return empList;
    }

    public Employees() {
        empList = new ArrayList< >();
    }

    public Employees(List < String > list) {
        this.empList = list;
    }

    public void loadData() {
        empList.add("Ann");
        empList.add("David");
        empList.add("John");
        empList.add("Methew");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List < String > temp = new ArrayList < > ();
        for (String str: this.empList) {
            temp.add(str);
        }
        return new Employees(temp);
    }
}
