package patterns.builder;

public class Application {
    public static void main(String[] args) {
        //Using patterns.builder to get the object in a single line of code and
        //without any inconsistent patterns.state or arguments management issues
        Computer comp = new Computer.ComputerBuilder(
                "500 GB", "2 GB").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();
    }
}
