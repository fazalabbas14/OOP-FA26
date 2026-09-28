public class Marks {
    int marks1;
    int marks2;
    int marks3;

    public Marks(){
        System.out.println("Running Constructor with no argument.");
    }
    public Marks(int marks1, int marks2, int marks3) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public int sum(){
        return (marks1+marks2+marks3);
    }
}
