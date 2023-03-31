package AllAssignmnets.Assignment5.Main;
import AllAssignmnets.Assignment5.Data.Data;
import AllAssignmnets.Assignment5.Singleton.Singleton;
public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        data.globalPrint();
        data.localPrint();

        Singleton singleton = Singleton.initializingString("ram");
        singleton.printString();

    }
}
