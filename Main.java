package assignment_2;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		menu();
	}
	
	public static void menu() {
		print("1. Accuracy Option");
		print("2. Simple Equation");
		print("3. Bubble Sort Algorithm");
		print("4. Exit");
		
		while(true) {
			try {
				int userInputMenu = Integer.parseInt(JOptionPane.showInputDialog("Which option would you like to select?"));
				switch(userInputMenu) {
					case 1:
						accuracyOption();
						break;
					case 2:
						simpleEquation();
						break;
					case 3:
						bubbleSort();
						break;
					case 4:
						print("Have a nice day! :)");
						System.exit(0);
					default:
						print("There seems to be a problem with your input, please try again.");
						break;
				}
				break;
			} catch (NumberFormatException ex) {
			    print("There seems to be a problem with your input, please try again."); 
			}
		}
		System.exit(0);
	}
	
	public static void accuracyOption() {
		print("\n | Accuracy Option | ");
		int userInputAccuracy = Integer.parseInt(JOptionPane.showInputDialog("How many decimal places would you like numerical results to be displayed in?"));
		menu();
	}
	
	public static void simpleEquation() {
		print("\n | Simple Equation | ");
		print("Function not implemented choose from other options");
		print("This is the function that will be used ax+b=c");
		int a = Integer.parseInt(JOptionPane.showInputDialog("What is the value of a"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("What is the value of b"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("What is the value of c"));
		
		float answer = (c - b) / a;
		
		print("The answer to the equation 'ax+b=c' is " + answer);
		menu();
	}
	
	public static void bubbleSort() {
		print("\n | Bubble Sort Algorithm | ");
		String userInputAlgorithm = JOptionPane.showInputDialog("Please enter what you would like to be sorted?");
		
		int[] arr = new int[userInputAlgorithm.length()];
		for (int i = 0; i < userInputAlgorithm.length(); i++) {
		    arr[i] = userInputAlgorithm.charAt(i) - '0';
		}
		
		System.out.println("Array before bubble sort");  
        for(int i=0; i < arr.length; i++) {  
                System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
          
        bubbleSort(arr);
         
        System.out.println("Array after bubble sort");  
        for(int i=0; i < arr.length; i++) {  
                System.out.print(arr[i] + " ");  
        }  
        menu();
	}
	
    public static void bubbleSort(int[] arr) {  
    	int n = arr.length;  
    	int temp = 0;  
    	for(int i=0; i < n; i++) {  
    		for(int x=1; x < (n-i); x++) {  
    			if(arr[x-1] > arr[x]) {    
    				temp = arr[x-1];  
    				arr[x-1] = arr[x];  
    				arr[x] = temp;  
    			}  
    		}  
    	} 
    }
	
	public static void print(Object x) {
		System.out.println(x);
	}
}
