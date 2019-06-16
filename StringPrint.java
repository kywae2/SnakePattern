import java.util.Scanner;

public class StringPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any intput string :");
		String str = sc.nextLine();
		System.out.println();
		
		System.out.print("Enter any line count :");
		int lineCount = sc.nextInt();
		System.out.println();
		
		System.out.print("Enter any column count :");
		int columnCount = sc.nextInt();
		System.out.println();
		
		int startPt = 0;
		int i = 0,j=0;
		
		
		StringBuilder result = new StringBuilder( str );
		
		for( i = str.length(); i < lineCount*columnCount; i+=".".length() ) {
		    result.append(".");
		}
		
		String resultStr = result.toString();
		
		for(j=1; j<=lineCount; j++) {	
			
			if( ( j%2 == 0 ) && j>0) {
				StringBuilder toReverse = new StringBuilder(resultStr.substring(startPt, j*columnCount));
				System.out.println(toReverse.reverse());
			}else {
				System.out.println(resultStr.substring(startPt, j*columnCount));
			}
			startPt = startPt+columnCount;
		}

	}

}
