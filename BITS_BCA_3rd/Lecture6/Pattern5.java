package Lecture6;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int space = n-1;
		int star = 1;
		while(row <= n) {
			// space print
			int i = 1;
		    while(i <= space) {
		    	System.out.print(" ");
		    	i++;
		    }
		    
		    // star print
		    int j = 1;
		    int val = row;
		    while(j <= star) {
		    	System.out.print(val);
		    	if(j <= star/2) {
		    		val++;
		    	} else {
		    		val--;
		    	}
		    	j++;
		    }
		    
		    System.out.println();
		    row++;
		    star += 2;
		    space--;
		}
	}

}
