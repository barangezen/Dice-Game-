public class Game extends Number{
    public int playerAScore = 0 ;
    public int playerBScore = 0 ;
    public int round ;
    void round(int maximumScore){
        System.out.println("Roll the die for round " + round);
        int playerARoll = (int) ((Math.random()*6) +1);
        playerAScore += playerARoll ;

        int playerBRoll = (int) ((Math.random()*6) +1);
        playerBScore += playerBRoll;
        System.out.println("Player A has " + playerARoll + " and player B has " + playerBRoll );
        if(isTwoDigits(playerARoll)){
            if(isPrimeNumber(playerARoll)){
                playerAScore -= 1;
            }
            else if(isDividableToTen(playerARoll)){
                playerAScore += 2 ;
            }
        }
        if(isTwoDigits(playerBRoll)){
            if(isPrimeNumber(playerBRoll)){
                playerBScore -=  -1 ;
            }
            else if(isDividableToTen(playerBRoll)){
                playerBScore +=  2;
            }
        }
        if(playerAScore >= maximumScore || playerBScore >= maximumScore){
            return;
        }
        round ++ ;
        round(maximumScore);


    }
}
