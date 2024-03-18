package strategyPattern;

public class Main {
    public static void main(String args[]) {
        CoffeeStrategy cs1 = new AmericanoStrategy() ;
        cs1.brew() ;

        CoffeeStrategy cs2 = new CafelatteStrategy() ;
        cs2.brew() ;

        CaffeeMachine cm = new CaffeeMachine() ;

        System.out.println(cm.brew(cs1)) ;

        System.out.println(cm.brew(cs2)) ;


    }
}