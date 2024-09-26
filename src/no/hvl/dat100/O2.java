package no.hvl.dat100;
 
 
	import static javax.swing.JOptionPane.*;
	import static java.lang.Integer.parseInt;
	
	public class O2 {
		
			public static void main(String[] args) {
			
				String lønn = showInputDialog(" Hva er din bruttolønn?");
				int Bruttolønn = parseInt(lønn);

				if (Bruttolønn<= 280050) {
					showMessageDialog( null,"Ingen trinnskatt");	
				} else if(Bruttolønn>= 208051 && Bruttolønn<= 292850) {
					showMessageDialog( null," Din trinnskatt er på 1,7%");
				}
				else if (Bruttolønn>= 292851 && Bruttolønn<= 670000) {
					showMessageDialog( null, "Din trinnskatt er på 4,0%");
				}else if (Bruttolønn >=670001 && Bruttolønn<= 937900) {
					showMessageDialog(null, "Din trinnskatt er på 13,6%");
				}else if (Bruttolønn>=937901 && Bruttolønn<= 1350000) {
					showMessageDialog( null,"Din trinnskatt er på 16,6%" );
				} else if (Bruttolønn>= 1350001) {
					showMessageDialog(null, "Din trinnskattt er på 17,6%");
				}
			}
		}