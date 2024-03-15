package strategyPattern;

public class AmericanoStrategy implements CoffeeStrategy {

    @Override
    public String brew() {
        return "아메리카노" ;
    }
}

