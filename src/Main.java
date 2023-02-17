public class Main {
    public static void main(String[] args){
       Zoo[] zoos ={new Parrot(2,1,"green"),
                   new Eagle(2,1,"Brown"),
                   new Bee(4,2,"black and yellow")};
        for (Zoo a:zoos) {
            System.out.println(a);
            a.fly();
        }
        AeroTechnics[] air = {new Airplane(32,"Passenger Airplane","White"),
                              new Helicopter(4,"Military helicopter","Hacks"),
                              new Aerostat(0,"Mongolfery","red")};
        for (AeroTechnics a:air) {
            System.out.println(a);
            a.fly();

        }
    }
}