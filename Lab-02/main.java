public class main {
    public static void main(String[] args) {
        System.out.println("Hello Fazal!");

//        Object without argument
        JavaClass javaClass = new JavaClass();

//        Object with arguments
        javaClass = new JavaClass(1, 3, 4);

        System.out.println("Without swapping of values.");
        javaClass.display();

        System.out.println("With swapping of values");
        javaClass.swapping();
        javaClass.display();


        System.out.println("\n!!!!!!!!!!!!!!!--Circle Class--!!!!!!!!!!!!!!!");
        Circle circle;
         circle = new Circle();
         circle = new Circle(2);
         circle.circumference();

        System.out.println("\n!!!!!!!!!!!!!!!--Account Class--!!!!!!!!!!!!!!!");
        Account account = new Account();

        account.getBalance();
        account.withdrawAmount(1000);
        account.depositAmount(100000);
        account.getBalance();
        account.withdrawAmount(1000);

        System.out.println("\n!!!!!!!!!!!!!!!--Distance Class--!!!!!!!!!!!!!!!");
        Distance distance = new Distance(5,4);
        distance.display();

        System.out.println("\n!!!!!!!!!!!!!!!--Marks Class--!!!!!!!!!!!!!!!");
        Marks marks;
        marks = new Marks();
        marks = new Marks(20,40,30);
        System.out.println("Sum of marks is: "+marks.sum());

        System.out.println("\n!!!!!!!!!!!!!!!--Time Class--!!!!!!!!!!!!!!!");

        Time time ;
        time = new Time();
        time = new Time(13,66,40);
        time.displayTime();





    }
}
