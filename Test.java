public class Test {
    public static void main(String[] args){
        Game game = new Game();
        game.round(100);
        System.out.println("The game is over.");
        if(game.playerAScore > game.playerBScore){
            System.out.println("The winner is player A");
        }
        else{
            System.out.println("The winner is B ");
        }
        System.out.println("How many rounds of game played ?");
        System.out.println("Rounds played : " + game.round);

        System.out.println("Total Score per player :");
        System.out.println("Player A score : " + game.playerAScore);
        System.out.println("Player B score : "+ game.playerBScore);
    }
}
