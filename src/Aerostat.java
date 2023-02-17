public class Aerostat extends AeroTechnics implements Flyable{
    public Aerostat(int numOfWheels, String type, String color) {
        super(numOfWheels, type, color);
    }

    @Override
    public void fly() {
        System.out.println("The Aerostat is flying...");
    }

    @Override
    public String toString() {
        return "Aerostat "+
                "\n numOfWheels "+getNumOfWheels()+
                "\ntype "+getType()+
                "\nColor "+getColor();
    }
}
