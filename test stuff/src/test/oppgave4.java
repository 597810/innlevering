		package test;
		
		
		
		import static javax.swing.JOptionPane.*;
		import static java.lang.Integer.*;
		
		public class oppgave4 {
			
		public static void main(String[] args) {
			
		
			int userGrossPay = parseInt(showInputDialog("skriv inn inntekta di"));
			String taxTxt = ("du betale dette i skatt");
			
			if( userGrossPay <=180000)
				showMessageDialog(null, "du betaler ikkje skatt   ");
			
					else { if (userGrossPay <=254500)	{
							double taxLvl = (userGrossPay * 1.90)/100;
							showMessageDialog(null, " skattenivå 1" + taxTxt + taxLvl  );
					}
					
					else if (userGrossPay <= 639750)	{
							double taxLvl = (userGrossPay * 4.2) / 100;
							showMessageDialog(null, "skattenivå 2" + taxTxt + taxLvl);
					}
					
					else if (userGrossPay <= 999550)  {
							double taxLvl = (userGrossPay *13.2) /100;
							showMessageDialog(null, "skattenivå 3" + taxTxt + taxLvl);
					}
						
					else if (userGrossPay >=999551)	{
							double taxLvl = (userGrossPay * 16.2) / 100;
							showMessageDialog(null, "skattenivå 4, " + taxTxt + taxLvl);
					}
		}		
	}
		}
