public class JavaClass {
    int id;
    int dataMembers;
    int functions;

    public JavaClass(){
        System.out.println("Running constructor without any argument...");
    }
    public JavaClass(int id, int dataMembers,int functions){
        this.id = id;
        this.dataMembers = dataMembers;
        this.functions = functions;
    }

    public void swapping(){
        dataMembers = dataMembers + functions;
        functions = dataMembers - functions;
        dataMembers = dataMembers - functions;
    }

    public void display(){
        System.out.printf("This constructor has id: %d, %d data members, and %d functions.\n",id, dataMembers, functions);
    }
}
