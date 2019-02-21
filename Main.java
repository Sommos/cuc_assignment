package assignment_2;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Main {
	// instantiates the global variable for the decimal formatting for the program //
	private static DecimalFormat df;

	public static void main(String[] args) {
		menu();
	}
	
	// menu method //
	public static void menu() {
		// prints the whole menu to the console //
		print("1. Accuracy Option");
		print("2. Simple Equation");
		print("3. Bubble Sort Algorithm");
		print("4. Exit");
		
		while(true) {
			// try-catch block to catch users who input anything other than integers //
			try {
				// gets user input and parses it from the default String to an integer //
				int userInputMenu = Integer.parseInt(JOptionPane.showInputDialog("Which option would you like to select?"));
				// switch statement that checks the user input against cases 1,2,3 and 4 and provides a default break case //
				switch(userInputMenu) {
					case 1:
						accuracyOption();
						break;
					case 2:
						simpleEquation(df);
						break;
					case 3:
						bubbleSort();
						break;
					case 4:
						print("Have a nice day! :)");
						// exits the program //
						System.exit(0);
					default:
						print("There seems to be a problem with your input, please try again.");
						break;
				}
				break;
			// if the user enters an input other than an integer, the error will be caught //
			} catch (NumberFormatException ex) {
			    print("There seems to be a problem with your input, please try again."); 
			}
		}
		// exits the program //
		System.exit(0);
	}
	
	public static void accuracyOption() {
		print("\n | Accuracy Option | ");
		while(true) {
			// try-catch block to catch users who input anything other than integers //
			try {
				// gets user input and parses it from the default String to an integer //
				int userInputAccuracy = Integer.parseInt(JOptionPane.showInputDialog("How many decimal places would you like numerical results to be displayed in?"));
				// switch statement that checks the user input against cases 1,2,3,4 and 5 and provides a default break case //
				switch(userInputAccuracy) {
					case 1:
						df = new DecimalFormat("#.#");
						break;
					case 2:
						df = new DecimalFormat("#.##");
						break;
					case 3:
						df = new DecimalFormat("#.###");
						break;
					case 4:
						df = new DecimalFormat("#.####");
						break;
					case 5:
						df = new DecimalFormat("#.#####");
						break;
					default:
						print("There seems to be a problem with your input, please try again.");
						break;
				}
				break;
			// if the user enters an input other than an integer, the error will be caught //
			} catch (NumberFormatException ex) {
			    print("There seems to be a problem with your input, please try again."); 
			}
		}
		// returns to menu //
		menu();
	}
	
	// method for simple equation //
	public static void simpleEquation(DecimalFormat df) {
		print("\n | Simple Equation | ");
		print("Function not implemented choose from other options");
		print("This is the function that will be used ax+b=c");
		// saves each user input to variable //
		int a = Integer.parseInt(JOptionPane.showInputDialog("What is the value of a"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("What is the value of b"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("What is the value of c"));
		
		// contains answer value as float in case of decimal answers depending on user input //
		float answer = (c - b) / a;
		
		// formats the answer to the accuracy option chosen by the user and outputs it to the console line //
		print("The answer to the equation 'ax+b=c' is " + df.format(answer));
		// returns to menu //
		menu();
	}
	
	public static void bubbleSort() {
		print("\n | Bubble Sort Algorithm | ");
		// saves user input to variable //
		String userInputAlgorithm = JOptionPane.showInputDialog("Please enter what you would like to be sorted?");
		
		// instantiates a new integer array, and assigns it the length of the user input //
		int[] arr = new int[userInputAlgorithm.length()];
		// for loop that goes through each number in the array and returns the char value //
		for (int i = 0; i < userInputAlgorithm.length(); i++) {
		    arr[i] = userInputAlgorithm.charAt(i) - '0';
		}
		
		// outputs the array before the bubble sort is applied //
		System.out.println("Array before bubble sort");
		// for loop that loops through the array and prints out each value at each position, relative to array length //
        for(int i=0; i < arr.length; i++) {  
        	System.out.print(arr[i] + " ");  
        }
        // prints new line for readability //
        System.out.println();  
        
        // applies the bubble sort method to the argument 'arr' array //
        bubbleSort(arr);
         
        // outputs the array after the bubble sort is applied to the array //
        System.out.println("Array after bubble sort");  
        for(int i=0; i < arr.length; i++) {  
        	System.out.print(arr[i] + " ");  
        }  
        // returns to menu //
        menu();
	}
	
	// bubble sort method //
    public static void bubbleSort(int[] arr) { 
    	// saves the length of the array to the variable 'n' //
    	int n = arr.length;  
    	// temporary memory location for comparison of two values from the array //
    	int temp = 0;
  
    	for(int i=0; i < n; i++) {  
    		for(int x=1; x < (n-i); x++) {  
    			// compares values //
    			if(arr[x-1] > arr[x]) { 
    				// re-assigns temporary value //
    				temp = arr[x-1];
    				arr[x-1] = arr[x];
    				arr[x] = temp;
    			}  
    		}  
    	} 
    }
	
    // basic function to print objects to the console line //
	public static void print(Object x) {
		System.out.println(x);
	}
}
