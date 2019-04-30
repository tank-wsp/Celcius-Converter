import java.util.Scanner;

public class CelsiusConverter {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please input a degree to convert:");
	double celDegree = input.nextDouble();
	double farForm= (9.0/5.0)*celDegree +32;
	
	System.out.println("In Fahenheit"+" "+celDegree+" "+"is"+" "+ farForm+".");
	}

} 


