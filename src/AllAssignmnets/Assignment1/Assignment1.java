package AllAssignmnets.Assignment1;
import java.io.File;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter Regular Expression: ");
            String regularExp = sc.nextLine();
            FileSearch filesearch = new FileSearch();
            filesearch.checkFileExistOrNot("/home/ramaa/IdeaProjects", regularExp);
        }
    }

}

