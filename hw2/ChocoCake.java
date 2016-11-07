package Homework2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ChocoCake {
	
	public static void main(String[] args) throws IOException {
		
        System.out.println("Ingredient \t1 (person)\t2 (persons) \t5 (persons)");

		//creating File instance to reference text file in Java
        File txt = new File("ingredient.txt");
      
        
        //Creating Scanner instance to read File in Java
		Scanner scanner = new Scanner(txt);
      
        //Read each line of file      
        while(scanner.hasNextLine()){
            String ln = scanner.nextLine();
            
            String Current = "", ingredient = "";
            if(!(ln.charAt(0) == '#') && !(ln.contains("==end==")))
            {
                //System.out.print(line); // For Ingredient
                //System.out.print("\t");
            	
                ingredient = ln;
                ln = scanner.nextLine();
                String[] section = ln.split(" ");
                System.out.print(ingredient + "(" + section[1] +")"); 
                System.out.print("\t");
                
                System.out.print(section[0]); // For Amount
                System.out.print("\t");
                System.out.print("\t");
                
                //System.out.print(parts[1]); // For Unit
                //System.out.print("\t");
                System.out.print(Float.parseFloat(section[0]) * 2);
                System.out.print("\t");
                System.out.print("\t");
                System.out.print(Float.parseFloat(section[0]) * 5);
                System.out.print("\n");
            }
                   

        }    
	}

}