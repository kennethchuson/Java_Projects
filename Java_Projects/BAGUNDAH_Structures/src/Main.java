

import BUGS.Bug1;
import BUGS.Bug2;
import BUGS.Bug3;
import BUGS.Bug4;
import BUGS.Bug5;
import BUGS.Bug6;
import BUGS.Bug7;

public class Main {
	 
	
	
	public static void define_bug() {

	    Bug1 insect_1 = new Bug1("Bugla", 100, 10.5, 5.0, false, true); 
	    Bug2 insect_2 = new Bug2("Spida", 150, 9.0, 7.0, false, true); 
	    Bug3 insect_3 = new Bug3("Wormak", 50, 8.7, 14, false, true);  
	    Bug4 insect_4 = new Bug4("Cricketo", 80, 10.0, 5.5, false, true); 
	    Bug5 insect_5 = new Bug5("Camoscorp", 40, 4.0, 3.2, false, true); 
	    Bug6 insect_6 = new Bug6("Blackisbarkung", 100, 9.3, 4.0, false, true); 
	    Bug7 insect_7 = new Bug7("Draguhofistua", 200, 50.5, 30.8, true, false); 
	    
	}
	
    public static void main(String[] args) {
    	
    	define_bug();  
        
        User_Inputs.Inputs(); 
    	
    	
    	
    }
}