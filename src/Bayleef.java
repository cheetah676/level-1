import javax.swing.JOptionPane;

public class Bayleef {
	String food;
	String color;

	public Bayleef(String favFood, String favColor) {
		food = favFood;
		color = favColor;
	}

	void eat() {
		JOptionPane.showMessageDialog(null, "Bayleef is eating " + color + " " + food + ".  It is very happy!  Bay!");
	}
}
