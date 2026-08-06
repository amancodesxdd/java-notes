



public class enum1 {
    public static void main(String[] args) {
        season current = season.WINTER;
        System.out.println("Weather: " + current.getweather());



        planet earth = planet.EARTH;
        System.out.printf("Earth's gravity: %.2f m/s%n",earth.calcgravity());
    }
    
}

enum planet{
    EARTH(5.97e24, 6371),
    MARS(6.42e23, 3389),
    JUPITER(1.90e27, 69911);

    private final double mass;
    private final double radius;
    private static final double G = 6.67e-11;

    planet(double mass, double radius){
        this.mass = mass;
        this.radius = radius;
    }

    public double getmass() {
        return mass;
    }
    public double getradius(){
        return radius;
    }

    public double calcgravity(){
        double radiusinmeters = radius * 1000;
        return G * mass / (radiusinmeters * radiusinmeters);
    }

}




















enum season {
    SPRING, SUMMER, FALL, WINTER;

    public String getweather(){
        switch (this) {
            case SPRING:
                return "Mild and rainy!";
            case SUMMER: 
                return "Hot and Sunny!";
            case FALL:
                return "Cool and Windy!";
            case WINTER:
                return "Cold and Snowy!";
            default:
                return "Unknown weather.";
        }
    }
}
