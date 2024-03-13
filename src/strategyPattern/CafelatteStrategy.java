package strategyPattern;

public class CafelatteStrategy implements CoffeeStrategy {

    @Override
    public String brew() {
        return "카페라떼";
    }
}
