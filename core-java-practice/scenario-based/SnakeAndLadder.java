
import java.util.Random;

public class SnakeAndLadder {
	public static void main(String[] args) {
		 Random random = new Random();
		 int player1 = 0 , player2 = 0 ; // UC1 = players starting with zero
		 int diceRollsCount = 0 ;
		 int currPlayer = 1 ;
		 
		 while(player1 < 100 && player2 < 100){
			 int dice = random.nextInt(6) + 1; // UC2 = rolling die to get random number 
			 int choice = random.nextInt(3); // UC3 = 0 for ladder , 1 for snake , 3 for no play
			 diceRollsCount ++;
			 int position = (currPlayer == 1) ? player1 : player2 ;

			 if(choice == 1 ) {
				 if(position + dice <= 100) {
					 position = position + dice ;
					 System.out.println("Player " + currPlayer + " got ladder with dice value "+dice+ " Position " + position);
					 
				 }
			 }else if(choice == 2) {
				 position = position - dice ;
				 if(position < 0) {
					 position = 0;
				 }
				 System.out.println("Player " + currPlayer + " got snake with  dice value "+dice+ " Position " + position);
				 currPlayer = (currPlayer == 1) ? 2 : 1;
			 }else {
				 System.out.println("Player " + currPlayer + " got no play  with  dice value "+dice+ " Position " + position);
				 currPlayer = (currPlayer == 1)? 2 : 1;
			 }
			 
			 if(currPlayer == 1) {
				 player1 = position;
			 }else {
				 player2 = position;
			 }
			 System.out.println(" Total dice rolls is : " + diceRollsCount);
			 if(player1 == 100) {
				 System.out.println("Player1 wins game ");
			 }else {
				 System.out.println("Player2 wins game");
			 }
	
			 
		 }
		 
	}

}
