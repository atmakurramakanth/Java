package AllAssignmnets.Assignment5;


public class Data {
    int a;
    char ch;

    public void globalPrint(){
        System.out.println(a+" "+ch);
    }

    public void localPrint(){
        int a;
        char ch;
//        Printing local variables without initialising causes errors
//        System.out.println(a+" "+ch);
        System.out.println("Error printing local variables");
    }
}
