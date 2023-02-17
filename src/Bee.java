public class Bee extends Zoo implements Flyable{
    public Bee(int numOfLegs, int numOfTail, String color) {
        super(numOfLegs, numOfTail, color);
    }

    @Override
    public void fly() {
        System.out.println("The bee flies and collects nectar");
    }

    @Override
    public String toString() {
        return "Bee "+
                "\nnumOfLegs "+getNumOfLegs()+
                "\nnumOfTail "+getNumOfTail()+
                "\nColor "+getColor();
    }
}
