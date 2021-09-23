package patterns.template;

public class HouseClient {
    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();

        //using patterns.template method
        houseType.buildHouse();
        System.out.println("************");

        houseType = new GlassHouse();

        houseType.buildHouse();
    }
}
