public class BirdDriver {
    public static void main(String[] args) {
        FlyingBird userBird = getUserBird();
        int monsterSpeed = getMonsterSpeed();

        int birdSpeed = userBird.fly();
        if (birdSpeed > monsterSpeed) {
            System.out.println("Yay! Your bird was fast enough to escape!");
        } else {
            System.out.println("Unfortunately, your bird was not fast enough to escape.");
        }
    }

    /**
     * Prompt the user for the type of bird they wish to play the game with
     * @return FlyingBird - the bird the user selected
     */
    private static FlyingBird getUserBird() {
        // Your code here
    }

    /**
     * Prompt the user for speed of the monster
     * @return int - the speed in miles per hour that the user entered
     */
    private static int getMonsterSpeed() {
        // Your code here
    }
}
