public class Circle {
    double radius;

    public Circle() {
        System.out.println("Running Circle Class Constructor with no argument");
    }

    public Circle(double radius){
        this.radius = radius;
        System.out.println("Running Circle Class Constructor with an argument");
    }

    public void circumference(){
        System.out.printf("Circumference of the circle with the radius %.2f is %.2f.\n",radius,(2*3.14*radius));
    }
}
