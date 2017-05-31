package numberConverter;

import java.util.Scanner;

public class BinaryToDecimalException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "";
		long convertedNum=0;
		long placeholder = 0;
		double powerCount = 0;
		int charCount = 0;
		Scanner strScan = new Scanner(System.in);
		boolean again = false;
		String yesOrNo = "";
		boolean letsCheck = false;
		do{
			convertedNum = 0;
			placeholder = 0;
			powerCount = 0;
			do{
				num="";
				System.out.println("Enter a number in binary(ex. 0110):");
				num = strScan.nextLine();
				if((num.isEmpty())){
					System.out.println("Type something");
					continue;
				}
				else if(num.charAt(charCount)==48||num.charAt(charCount)==49){
					for(int count = num.length(); count>0; count--){
							
						placeholder = (Long.parseLong(num.substring((count-1), count))*(long)Math.pow(2,powerCount));
						//System.out.println(placeholder);
						convertedNum+= placeholder;
						powerCount++;
					}
					
					System.out.println(convertedNum);
				}
				else{
					System.out.println("That wasn't a binary number");
					continue;
				}
				
				
			}while((num.isEmpty())||(!(num.charAt(charCount)==48||num.charAt(charCount)==49)));
			try{
				letsCheck = letsGoAgain(yesOrNo, again, strScan);
			}
			catch(NoSuchMethodException e){
				System.out.println("Error this method doesn't exist!");
			}
			catch(Exception e2){
				System.out.println("Error!");
			}
			finally{
				System.out.println("You passed the exception handler!");
			}
		}while(letsCheck);
		strScan.close();
	}
	
	/*public static boolean letsGoAgain(String yesOrNo, boolean again, Scanner strScan){
		do{
			System.out.println("Do you want to continue? Y or N");
			yesOrNo = strScan.nextLine();
			//in case the user types "y" or "n" it will still go through
			yesOrNo = yesOrNo.toUpperCase();
			if(yesOrNo.equals("Y")){
				again = true;
			}
			else if(yesOrNo.equals("N")){
				again = false;
			}
			else{
				System.out.println("You didn't type \"Y\" or \"N\". please try again");
			}
			
		}while((!(yesOrNo.equals("Y"))) && (!(yesOrNo.equals("N"))));
		
		return again;
	}*/

}
