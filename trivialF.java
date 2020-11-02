package Trivial;

import javax.swing.JOptionPane;

public class trivialF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = JOptionPane.showInputDialog("¿En qué año se descubrió Ámerica?");
		int int1 = Integer.parseInt(str);
		switch (int1) {
		case 1492:
			System.out.println("Se descubrió en 1492 por Colón");

			str = JOptionPane.showInputDialog("¿En qué año expulsaron a los moriscos?");
			int1 = Integer.parseInt(str);
		case 1613:
			System.out.println("Los moriscos fueron expulsados en 1613");

			str = JOptionPane.showInputDialog("¿En qué año se decretó la primera constitución?");
			int1 = Integer.parseInt(str);
		case 1812:
			System.out.println("Se decretó en 1812 , llamada la Pepa");

			str = JOptionPane.showInputDialog("¿En qué año terminó la dictadura de Franco?");
			int1 = Integer.parseInt(str);
		case 1975:
			System.out.println("Terminó en 1975 , con su muerte");

			str = JOptionPane.showInputDialog("¿En qué año dió el golpe de estado Primo de Rivera?");
			int1 = Integer.parseInt(str);
		case 1923:
			System.out.println("EL golpe de estado fue en 1923");

			str = JOptionPane.showInputDialog("¿En qué año fue la primera elección democrática en España?");
			int1 = Integer.parseInt(str);
		case 1977:
			System.out.println("La primera elección democrática fue en 1977");
			str = JOptionPane.showInputDialog("¿En qué año llegaron los musulmanes a España?");
			int1 = Integer.parseInt(str);
		case 711:
			System.out.println("Los musulmanes llegaron a la península en el 711");
			str = JOptionPane.showInputDialog("¿En qué año llegaron los visigodos a la península?");
			int1 = Integer.parseInt(str);
		case 409:
			System.out.println("Los visigodos llegaron a España en el 409");
			str = JOptionPane.showInputDialog("¿En qué año se inició la reconquista?");
			int1 = Integer.parseInt(str);
		case 722:
			System.out.println("La reconquista se inició en el 722 d.c");

			str = JOptionPane.showInputDialog("¿En qué año murió Fernando el católico?");
			int1 = Integer.parseInt(str);
		case 1516:
			System.out.println("Fernando el católico murió en 1516");
			str = JOptionPane.showInputDialog("¿En qué año se instauró la dinastía de los Borbones?");
			int1 = Integer.parseInt(str);
		case 1700:
			System.out.println("La dinastía de los borbones se inció en 1700");
			break;
		}

	}

}
