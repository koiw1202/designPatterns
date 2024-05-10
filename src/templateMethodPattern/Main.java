package templateMethodPattern;

import strategyPattern.AmericanoStrategy;
import strategyPattern.CafelatteStrategy;
import strategyPattern.CaffeeMachine;
import strategyPattern.CoffeeStrategy;

public class Main {
    public static void main(String args[]) {

        AbstractTemplate abstractTemplate1 = new ImplementationA() ;
        AbstractTemplate abstractTemplate2 = new ImplementationB() ;

        abstractTemplate1.templateMethod() ;
        abstractTemplate1.step1();
        abstractTemplate1.step2();
        abstractTemplate1.step3();

        abstractTemplate2.templateMethod() ;
        abstractTemplate2.step1();
        abstractTemplate2.step2();
        abstractTemplate2.step3();


    }
}