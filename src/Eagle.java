public class Eagle extends Zoo implements Flyable{
    public Eagle(int numOfLegs, int numOfTail, String color) {
        super(numOfLegs, numOfTail, color);
    }

    @Override
    public void fly() {
        System.out.println("The golden eagle files high...");

    }

    @Override
    public String toString() {
        return "Eagle "+
                "\nnumOfLegs "+getNumOfLegs()+
                "\nnumOfTail "+getNumOfTail()+
                "\nColor "+getColor();
    }
}
