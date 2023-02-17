public class Airplane extends AeroTechnics implements Flyable{
    public Airplane(int numOfWheels, String type, String color) {
        super(numOfWheels, type, color);
    }

    @Override
    public void fly() {
        System.out.println("The plane is preparing for takeoff...");
    }

    @Override
    public String toString() {
        return "Airplane "+
                "\n numOfWheels "+getNumOfWheels()+
                "\ntype "+getType()+
                "\nColor "+getColor();
    }
}
