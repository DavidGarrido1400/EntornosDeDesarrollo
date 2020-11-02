package Trivial;

import javax.swing.JOptionPane;

public class trivialF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = JOptionPane.showInputDialog("mostrar una nota en pantalla de 0 a 10");
		int int1 = Integer.parseInt(str);
		switch (int1){
			case 0: 
				System.out.println("mostrar en pantalla la nota:" + "muy deficiente");
				break;
			case 1: 
				System.out.println("mostrar en pantalla la nota:" + "muy deficiente");
				break;
			case 2: 
				System.out.println("mostrar en pantalla la nota:" + "muy deficiente");
				break;
			case 3: 
				System.out.println("mostrar en pantalla la nota:" + "muy deficiente");
				break;
			case 4: 
				System.out.println("mostrar en pantalla la nota:" + "insuficiente");
				break;
			case 5: 
				System.out.println("mostrar en pantalla la nota:" + "suficiente");
				break;
			case 6: 
				System.out.println("mostrar en pantalla la nota:" + "bien");
				break;
			case 7: 
				System.out.println("mostrar en pantalla la nota:" + "notable");
				break;
			case 8: 
				System.out.println("mostrar en pantalla la nota:" + "notable");
				break;
			case 9: 
				System.out.println("mostrar en pantalla la nota:" + "muy sobresaliente");
				break;
			case 10: 
				System.out.println("mostrar en pantalla la nota:" + "muy sobresaliente");
				break;
			
			}
	
	
	}

}
