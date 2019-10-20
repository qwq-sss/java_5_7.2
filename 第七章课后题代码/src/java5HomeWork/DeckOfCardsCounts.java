package java5HomeWork;

public class DeckOfCardsCounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] deck = new int[52];
		String[] suits = {"Spades","Hearts","Diamonds","Clubs"};
		String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		
		//Initialize the cards
		for(int i =0; i < deck.length; i++ )
			deck[i] = i;
		
		//Shuffle the cards
		for(int i = 0; i < deck.length; i++){
			//Generate an index randomly
			int index = (int)(Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		int count = 0;
		//select cards
		int s=0,h=0,d=0,c=0; //define four picture
			for(int i = 0; i < deck.length; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			if (suit == "Spades")
				s++;
			else if(suit == "Hearts")
				h++;
			else if(suit == "Diamonds")
				d++;
			else if(suit == "Clubs")
				c++;
			count++;
			if(s>=1 && h>=1 && d>=1 && c>=1)
				break;
			}
			System.out.println("The count is " + count);
		


	}

}
