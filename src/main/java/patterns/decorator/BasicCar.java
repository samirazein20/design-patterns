package patterns.decorator;

public class BasicCar implements Car{
    @Override
    public void assemble() {
        System.out.printf("Basic Car.");
    }
}
