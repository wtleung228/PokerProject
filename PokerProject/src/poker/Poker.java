package poker;
import java.util.ArrayList;

public class Poker {
	
	String[] tempCard = new String[] {};
	
	// Precondition: A hand of n cards have been sorted by card number.
	public boolean isFullHouse(String cards[], int n) {
		return isThreeOfaKind(cards, n) && isTwoPairs(cards, n);
	}
	
	public String[] removeItems(String cards[], int index) {
		String tempCards[] = new String[cards.length-1];
		for (int i = 0; i < cards.length; i++) {
			if (i != index) {
				tempCards[i] = cards[i];
			}
			
		}
	}
	
	// Precondition: A hand of n cards have been sorted by card number.
	public boolean isThreeOfaKind(String cards[], int n) {
		for (int i=0; i<n-2; i++) {
			if (cards[i].charAt(1) == cards[i+1].charAt(1) &&
					cards[i+1].charAt(1) == cards[i+2].charAt(1))
					cards = 
					return true;
		}

		return false;
	}
	
	public boolean isThreeOfaKindFix(String cards[], int n) {
		for (int i=0; i<n-2; i++) {
			if (cards[i].charAt(1) == cards[i+1].charAt(1) &&
					cards[i+1].charAt(1) == cards[i+2].charAt(1)) {
				  	
			}
					
		}

		return false;
	}
	
	// Precondition: A hand of n cards have been sorted by card number.
	public boolean isTwoPairs(String cards[], int n) {
		int count = 0;
		for (int i=0; i<n-1; i++) {
			if (cards[i].charAt(1) == cards[i+1].charAt(1)) {
				count++;
				i++;
			}
		}
		if (count == 2)
			return true;
		else
			return false;
	}

}
// end of Poker.java

