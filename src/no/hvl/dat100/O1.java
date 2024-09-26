package no.hvl.dat100;
 
	import static javax.swing.JOptionPane.*;
	import static java.lang.Integer.parseInt;
	public class O1 {
		public static void main(String[] args) {
			for (int i= 0; i< 10; i++) {
				int poengsum2;

				while(true) {
					String poengsum = showInputDialog("Hva er poengsummen til sudent nummer "+ (i+1) + "?");
					poengsum2 = parseInt( poengsum);
					if(poengsum2>=0 && poengsum2 <=100) {
						break;
					} else {
						showMessageDialog(null, "Feilmelding: Ugydlig pensum.Poengsummen må være mellom 0 til 100.");
					}
				 	}

					if (poengsum2>=90 &&poengsum2 <=100) {
						showMessageDialog(null," Karakteren er A");
					}else if (poengsum2>=80 && poengsum2<=89) {
						showMessageDialog(null, "Karaketren er B");
					}else if (poengsum2>=60 && poengsum2<=79) {
						showMessageDialog(null," Karakteren er C");
					} else if (poengsum2>=50 && poengsum2<=59) {
						showMessageDialog(null, "Karakter er  D");
					} else if (poengsum2>=40 && poengsum2<=49) {
						showMessageDialog(null, " karakter er E ");
					} else {
						showMessageDialog(null, "Karakter er F ");
					}
			}
		}
	}