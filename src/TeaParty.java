import javax.swing.JOptionPane;

public class TeaParty {
	public String welcome(String lastName, boolean isWoman, boolean isKnighted) {
	if (isWoman) {
		return "Hello Ms. "+lastName;
	}
	else if (isKnighted) {
		return "Hello Sir "+lastName;
	}

	else{
		return "Hello Mr. "+lastName;
	}
	}
}




