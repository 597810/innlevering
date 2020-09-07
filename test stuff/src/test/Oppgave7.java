package test;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;	


public class Oppgave7 {
	
	public static void main(String[] args) {
		
		
		
	
		char letterGrade = 'S';
		
		int input;
				
		for (int i = 1; i<=10; i++) {
			
			 input = parseInt(showInputDialog("poengsummen til student")); 
			 while(input <0 || input > 100 ) {
				 showMessageDialog(null," uyldig poengsumm");
				 input =parseInt(showInputDialog("skriv ein gyldig poengsum"));
			 }
			 if( input < 40 ) {
					letterGrade = 'F';
				} else if (input <40 && input <=49) {
					letterGrade='E';
				} else if (input <50 && input <=59) {
					letterGrade ='D';
				} else if (input <60 && input <=79)  {
					letterGrade ='C';
				} else if (input <80 && input <=89 ) {
					letterGrade = 'B'; 
				} else if (input <= 90 && input <=100) {
					letterGrade = 'A'; 
				}
			showMessageDialog(null,"karakter du fikk" + letterGrade);
			
		}		
	}
}