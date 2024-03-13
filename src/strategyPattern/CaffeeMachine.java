package strategyPattern;

public class CaffeeMachine {

    public String brew(CoffeeStrategy coffeeStrategy) {
        return coffeeStrategy.brew() ;
    }
}
