public class Parrot extends Zoo implements Flyable{
    public Parrot(int numOfLegs, int numOfTail, String color) {
        super(numOfLegs, numOfTail, color);
    }
    @Override
    public void fly() {
        System.out.println("The parrot flies from one tree to another");
    }

    @Override
    public String toString() {
        return "Parrot "+
                "\nnumOfLegs "+getNumOfLegs()+
                "\nnumOfTail "+getNumOfTail()+
                "\nColor "+getColor();
    }
}
