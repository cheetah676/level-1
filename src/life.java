import javax.swing.JOptionPane;

public class life {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your real name");
		if (name.equalsIgnoreCase("jake")) {
			String password = JOptionPane.showInputDialog("You are amazing");
			if (password.equalsIgnoreCase("dump trump")) {
				JOptionPane.showMessageDialog(null, "You are a VIP");
			}
		} else if (name.equalsIgnoreCase("dave")) {
			String password = JOptionPane.showInputDialog("You are an octopus");
			if (password.equalsIgnoreCase("dump trump")) {
				JOptionPane.showMessageDialog(null, "You are a VIP");
			}
		} else if (name.equalsIgnoreCase("kaden")) {
			String password = JOptionPane.showInputDialog("hi doggy 'pat pat'");
			if (password.equalsIgnoreCase("dump trump")) {
				JOptionPane.showMessageDialog(null, "You are a VIP");
			}
		} else if (name.equalsIgnoreCase("daniel")) {
			String password = JOptionPane.showInputDialog("You are a loser");
			if (password.equalsIgnoreCase("dump trump")) {
				JOptionPane.showMessageDialog(null, "You are a VIP");
			}
		} else if (name.equalsIgnoreCase("keith")) {
			String password = JOptionPane.showInputDialog("You are not family; the duck is.");
			if (password.equalsIgnoreCase("dump trump")) {
				JOptionPane.showMessageDialog(null, "You are a VIP");
			}
		} else if (name.equalsIgnoreCase("otis")) {
			String password = JOptionPane.showInputDialog("");
			if (password.equalsIgnoreCase("dump trump")) {
				JOptionPane.showMessageDialog(null, "You are a VIP");
			}
		} else if (name.equalsIgnoreCase("")) {
			String password = JOptionPane.showInputDialog("");
			if (password.equalsIgnoreCase("dump trump")) {
				JOptionPane.showMessageDialog(null, "You are a VIP");
			}
		} else {
			JOptionPane.showMessageDialog(null, name + " is an imposter.");
		}
	}
}
