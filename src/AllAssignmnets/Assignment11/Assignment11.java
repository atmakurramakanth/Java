package AllAssignmnets.Assignment11;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.HashSet;

public class Assignment11 {
    public static void main(String[] args) throws Exception {
        FileReader file = new FileReader("src/AllAssignmnets/Assignment11/input.txt");
        BufferedReader bufferedReader = new BufferedReader(file);
        String input = bufferedReader.readLine();
        bufferedReader.close();
        file.close();

        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int i=0; i<input.length();i++){
            hashMap.put(input.charAt(i), hashMap.getOrDefault(input.charAt(i),0)+1);
        }

        FileWriter outputFile = new FileWriter("src/AllAssignmnets/Assignment11/output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(outputFile);
        bufferedWriter.append(hashMap.toString());
        bufferedWriter.close();
        outputFile.close();
    }
}
