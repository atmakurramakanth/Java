package AllAssignmnets.Assignment7;


public class CycleInheritance {
    public static void main(String[] args) {
        CycleInheritance[] cycle = new CycleInheritance[3];
        cycle[0] = new Unicycle();
        cycle[1] = new Bicycle();
        cycle[2] = new Tricycle();

        ((Unicycle)cycle[0]).balance();
        ((Bicycle)cycle[1]).balance();
//        ((Tricycle)cycle[2]).balance(); //Has error in this line
    }
}

class Unicycle extends CycleInheritance {
    public void balance() {
        System.out.println("Unicycle balance");
    }
}

class Bicycle extends CycleInheritance {
    public void balance() {
        System.out.println("Bicycle balance");
    }
}

class Tricycle extends CycleInheritance {

}
