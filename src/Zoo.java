public abstract class Zoo implements Flyable{
    private int numOfLegs;
    private int numOfTail;
    private String color;

    public Zoo(int numOfLegs, int numOfTail, String color) {
        this.numOfLegs = numOfLegs;
        this.numOfTail = numOfTail;
        this.color = color;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    public int getNumOfTail() {
        return numOfTail;
    }

    public void setNumOfTail(int numOfTail) {
        this.numOfTail = numOfTail;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "numOfLegs=" + numOfLegs +
                ", numOfTail=" + numOfTail +
                ", color='" + color + '\'' +
                '}';
    }
}
