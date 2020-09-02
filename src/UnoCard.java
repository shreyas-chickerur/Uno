import java.util.Random;

public class UnoCard {
	private int number;
	private String color;
	
	public UnoCard() {
		int colorNum;
		String[] colorArray = new String[] {"R", "G", "Y", "B"};
		var r = new Random();
		number = r.nextInt(9) + 1;
		colorNum = r.nextInt(4);
		color = colorArray[colorNum];
	}
	
	public String toString() {
		return color + number;
	}
	
	public static void main(String[] args) {
		UnoCard card = new UnoCard();
		System.out.println(card);
	}

}
