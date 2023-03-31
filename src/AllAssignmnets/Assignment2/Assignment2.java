package AllAssignmnets.Assignment2;


import java.util.*;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        CheckString checkString =new CheckString();
        System.out.println(checkString.isPanagram(input.toLowerCase()));
    }


}