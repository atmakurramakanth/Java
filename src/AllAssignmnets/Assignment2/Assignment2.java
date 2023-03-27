package AllAssignmnets.Assignment2;


import java.util.*;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(checkString(input.toLowerCase()));
    }

    public static String checkString(String input){
        int count = 0;
        HashSet<Character> hashSet = new HashSet<>();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)<='z' && input.charAt(i)>='a'){
                hashSet.add(input.charAt(i));
            }
        }
        if(hashSet.size()==26){
            return "All alphabets are present";
        }
        else{
            return "Doesn't contain all alphabets";
        }
    }
}