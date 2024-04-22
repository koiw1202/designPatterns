package bridgePattern;

public class Main {
    public static void main(String args[]) {

        Brush redBrush = new HBPencil(new Red());
        System.out.println(redBrush.draw()) ;

        Brush blueBrush = new MonoLine(new Blue());
        System.out.println(blueBrush.draw());

    }

}