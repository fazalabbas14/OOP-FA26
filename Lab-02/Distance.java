public class Distance {
    int feet;
    int inches;

    public Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public void display(){
        System.out.printf("Total distance is %d feet %d inches.\n",feet,inches);
    }
}
