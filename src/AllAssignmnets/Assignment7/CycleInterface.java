package AllAssignmnets.Assignment7;

interface CycleI{
    void type();
}

class UniCycle implements CycleI{
    @Override
    public void type() {
        System.out.println("Unicycle");
    }
}
class BiCycle implements CycleI{
    @Override
    public void type() {
        System.out.println("Bicycle");
    }
}
class TriCycle implements CycleI{
    @Override
    public void type() {
        System.out.println("Tricycle");
    }
}
abstract class CycleA {
    public abstract CycleI getCycle(String cycleType);
}

public class CycleInterface extends CycleA {
    @Override
    public CycleI getCycle(String type) {
        if (type.equals("UniCycle")) {
            return new UniCycle();
        }
        if (type.equals("BiCycle")) {
            return new BiCycle();
        }
        if (type.equals("TriCycle")) {
            return new TriCycle();
        }
        return null;
    }

    public static void main(String[] args) {
        CycleA cycle = new CycleInterface();

        CycleI unicycle = cycle.getCycle("UniCycle");
        unicycle.type();

        CycleI bicycle = cycle.getCycle("BiCycle");
        bicycle.type();

        CycleI tricycle = cycle.getCycle("TriCycle");
        tricycle.type();

    }
}
