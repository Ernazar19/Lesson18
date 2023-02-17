public abstract class AeroTechnics  implements Flyable{
    private int numOfWheels;
   private String type;
   private String color;

    public AeroTechnics(int numOfWheels,String type, String color) {
        this.numOfWheels = numOfWheels;
        this.type = type;
        this.color = color;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "AeroTechnics " +
                "numOfWheels=" + numOfWheels +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
