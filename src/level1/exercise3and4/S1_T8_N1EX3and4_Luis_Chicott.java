package level1.exercise3and4;

import java.util.ArrayList;
import java.util.List;

public class S1_T8_N1EX3and4_Luis_Chicott {

	public static void main(String[] args) {

		
		List<String> months = new ArrayList<String>();
		
		months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");
        

        //Ejercicio 3
        months.forEach(month -> System.out.print(month + " ")); 
        
        System.out.println("\n");
        
        
        //Ejercicio 4
        months.forEach(S1_T8_N1EX3and4_Luis_Chicott::printMonths);

	}
	
	public static void printMonths(String month) {
		System.out.print(month + " "); 
	}
	
	

}
