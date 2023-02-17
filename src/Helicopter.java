public class Helicopter extends AeroTechnics implements Flyable {

    public Helicopter(int numOfWheels, String type, String color) {
        super(numOfWheels, type, color);
    }

    @Override
    public void fly() {
        System.out.println("The helicopter is flying...");
    }

    @Override
    public String toString() {
        return "Helicopter "+
                "\n numOfWheels "+getNumOfWheels()+
                "\ntype "+getType()+
                "\nColor "+getColor();
    }
}
