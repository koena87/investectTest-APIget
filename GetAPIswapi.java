package investecGetAPI;
import java.util.Scanner;

import swapiAPI.swapiAPI;

public class GetAPIswapi {

	public static void main(String[] args) {
		
		String AssertColor;
		
		Scanner inputdata = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		
		
		AssertColor = swapiAPI.SkinColor(inputdata.nextLine());
		
		assert(AssertColor.contains("whte") && AssertColor.contains("blue")): "Colors are not matching";
				
		
		

	}

}
