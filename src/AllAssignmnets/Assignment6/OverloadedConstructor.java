package AllAssignmnets.Assignment6;


public class OverloadedConstructor {
    OverloadedConstructor(){
        this(2);
        System.out.println("First constructor");
    }

    OverloadedConstructor(int i){
        System.out.println("Second Constructor is called");
    }
}