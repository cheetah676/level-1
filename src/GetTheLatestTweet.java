import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class GetTheLatestTweet {
	public static void main(String[]args) {
		GetTheLatestTweet tweet=new GetTheLatestTweet();
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		JButton button=new JButton();
		JTextField box=new JTextField();
		frame.setVisible(true);
		frame.add(panel);
		panel.add(box);
		panel.add(button);
		box.setText("Click here to type");
		button.setText("Check Twitter");
		button.addActionListener((e)->{
			String input=box.getText();
			String check=tweet.getLatestTweet(input);
			JOptionPane.showConfirmDialog(null, check);
		});
		frame.pack();
			}
	private String getLatestTweet(String searchingFor) {

		Twitter twitter = new TwitterFactory().getInstance();
		AccessToken accessToken = new AccessToken(
				"2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
				"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
		twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
				"6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
		twitter.setOAuthAccessToken(accessToken);

		Query query = new Query(searchingFor);
		try {
			QueryResult result = twitter.search(query);
			return result.getTweets().get(0).getText();
		} catch (Exception e) {
			System.err.print(e.getMessage());
			return "What the heck is that?";
		}
	}


	
}



