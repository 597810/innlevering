package test;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class oppgave {
	
	public static void main(String[]	args) {

		
		int n = parseInt(showInputDialog("skriv in verdien "));
		int svar = 1;
		
			if (n >= 0) {
			  for (int i = 1; i <= n; i++) {
			svar = svar * i;	
			
			}
			showMessageDialog(null, svar);
			
			}
				else {
					showMessageDialog(null, "må være eit positivt tal");
				}
	}
}	
	
	


