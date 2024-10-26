import java.util.List;

public class Zoo {

    /**
     * Feeds different bird sections of the zoo.
     *
     * @param list list of birds of particular type.
     */
    public static void feed(List<? extends Bird> list) {
        // fix method declaration
        System.out.println("Feeding birds");
        for (Bird bird : list){
            bird.eat();
        }// feed birds in the cycle
    }

    /**
     * Adds birds to a flying section of the zoo.
     *
     * @param list list of birds of particular type.
     * @param bird a new bird.
     */
    public static void acceptBird(List<? super FlyingBird> list, FlyingBird bird) {
        // fix method declaration
        System.out.println("Accepting a bird to a section");
        bird.checkWings();// check flying bird wings
        list.add(bird);
        System.out.println(bird);// add a bird to the list and print it
    }

    /**
     * Adds bird to the general list.
     *
     * @param list    list of birds.
     * @param newBird bird to add.
     */
    public static void registerBird(List<Bird> list, Bird newBird) {
        // fix method declaration
        System.out.println("Adding a bird to the birds list");
        list.add(newBird);// add a bird to list
        for (Bird bird: list){
            System.out.println(bird);
        }// print birds in the cycle
    }
}