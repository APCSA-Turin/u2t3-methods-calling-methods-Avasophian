package U2T3_ModifyObjectState;

public class NewRunner {
    public static void main(String[] args) {
        Game g1 = new Game("mario party", 4);
        System.out.println("Playing " + g1.getName() + "...");
        System.out.println("You have: " + g1.getScore() + "  stars.");
        System.out.println("Adding 1 since you got a star...");
        System.out.println("But wait! Looks like you got another! Lucky you!");
        g1.increaseScore(2);
        System.out.println("Now you have: " + g1.getScore() + "  stars.");
        System.out.println("So, currently you're playing with " + g1.getPlayers() + " people.");
        System.out.println("But that's boring! I'm gonna add more.");
        g1.addPlayer();
        g1.addPlayer();
        g1.addPlayer();
        System.out.println("Now you have: " + g1.getPlayers() + "  people.");
        System.out.println("Wait...");
        System.out.println("You have won: " + g1.isGameOver());
        System.out.println("Looks like you haven't! Let's fix that!");
        g1.increaseScore(8);
        System.out.println("Now you have: " + g1.getScore() + "  stars!");
        System.out.println("You have won: " + g1.isGameOver());
        System.out.println("Congrats!");

    }
}
