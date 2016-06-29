/**
 * Created by Qube on 6/28/16.
 */
public class Main {

    public static void main(String[] args) {
        Mammal sloth = new Mammal("sloth", false, 4, 1, true, true);
        sloth.mammalTraits();
        System.out.println();

        Reptile lizard = new Reptile("lizard", false, 4, 2, true, true);
        lizard.reptileTraits();
        System.out.println();
    }

}


