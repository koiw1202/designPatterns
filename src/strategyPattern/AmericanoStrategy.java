package strategyPattern;

public class AmericanoStrategy implements CoffeeStrategy {

    @Override
    public String brew() {
        return "아메키라노" ;
    }
}

