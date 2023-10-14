package GameProject;
import java.util.Scanner;
class guesser{

    int guessNum;

   public int guessingNum()
    {
        Scanner Scan=new Scanner(System.in);
        System.out.println("Guesser please guess the number:");
       
        guessNum=Scan.nextInt();
        return guessNum;

    }
}
class player{
    int guessNum;

    public int guessingNum(){
        Scanner Scan=new Scanner(System.in);
        System.out.println("Player! Guess the no.:");
        guessNum=Scan.nextInt();
        return guessNum;

    }
}
class  umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

     void collectNumFromGuesser()
    {
        guesser obj=new guesser();
        numFromGuesser=obj.guessingNum();

    }

void collectNumFromPlayer()
{
    player P1=new player();
    player P2=new player();
    player P3=new player();
    
    numFromPlayer1=P1.guessingNum();
    numFromPlayer2=P2.guessingNum();
    numFromPlayer3=P3.guessingNum();





}



void compare()
{if(numFromGuesser==numFromPlayer1)
    {
        if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3){
            System.out.println("All Guesses the no. correct");

        }
        else if(numFromGuesser==numFromPlayer2){
            System.out.println("Player 1&2 are WINNER ");
        }
        else if(numFromGuesser==numFromPlayer3){
            System.out.println("Player 1&3 are WINNER ");
        }else{
        System.out.println("Player1 has one the game");
    }
}
else if(numFromGuesser==numFromPlayer2)
{ 
    if(numFromPlayer2==numFromPlayer3)
    {
        System.out.println("Player 2 and player 3 has one game");
    }
    else {
    System.out.println("Player2 has one the game");
}
}
else if(numFromGuesser==numFromPlayer3)
{
    System.out.println("Player3 has one the game");
}
else{
    System.out.println("Sorry! No One Is WINNER");
}
}
}
    class guessgame{
        public static void main(String[] args)  {
            System.out.println("Game Started");
            umpire u=new umpire();
            u.collectNumFromGuesser();
            u.collectNumFromPlayer();
            u.compare();
        }
    }


