import java.util.Scanner;


public class Spelare {
	private String mNamn;
	private char mMarkerare;
	private int mSpelareNr;
	

	public Spelare(String namn, char markerare, int spelarenr){
		mNamn = namn;
		mMarkerare = markerare;
		mSpelareNr = spelarenr;
	}

	public String toString(){
		return "Namn: " + mNamn + " Markerare: " + mMarkerare + " Spelare nummer: " + mSpelareNr;
	}

	public void setMarkerare(){


		boolean validerare = false;
		while(validerare){
			Scanner scanPlacering = new Scanner(System.in);
			int placeringRuta = scanPlacering.nextInt();
			
		}
			
	}
}