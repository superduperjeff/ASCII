import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.EOFException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.BufferedWriter;
public class ASCII {
public static void main(String[] args){

try{

    //FileOutputStream fos = new FileOutputStream("ascii.txt", true);
	PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt",false)));

        int xPos = 0;
        int yPos = 0;
    
        char[][] array = new char[56][40];

        for (int i = 0; i < 40; i ++){
        	for (int j = 0; j < 56; j++){
        		array[j][i] =  ' ';
        	}
        }
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter a string of text");
        String text= sc.next();

		for ( int i=0; i < text.length(); i++)
		{
		    char c = text.charAt(i);
		    if( c == 'n' && yPos < 40)
		    {
		        yPos++;
		    }
		
		    else if( c == 's' && yPos > 0)
		    {
		        yPos--;
		    }
		    
		    else if( c == 'e' && xPos < 56)
		    {
		        xPos++;
		    }
		
		    else if( c == 'w' && xPos > 0)
		    {
		        xPos--;
		    }
		
		    else
		    {
		        array[xPos][yPos] = c;
		    }
		}



	for (int i = 39; i >= 0; i --){
	    
	    for (int j =0; j < 56; j++)
	        out.write(array[j][i]);
	    
		out.write( "\n");
	}
		out.close();

	}
	catch (FileNotFoundException fnfe){
		System.out.println("File not found.");
	}
	catch (IOException ioe){
		ioe.printStackTrace();
	}
}
}
 

//PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt",true)));
