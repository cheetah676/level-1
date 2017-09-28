
	import java.applet.AudioClip;
	import java.io.IOException;
	import javax.swing.JApplet;

	public class cowTimer {
		static /*
		 * This is an advanced recipe. There may be more than one line of code for
		 * each instruction.
		 * Work in seconds when testing, then change to minutes
		 */
int minutes1=2;
		public static void main(String[] args) throws InterruptedException {
			/* 1. Make a CowTimer, set the time and start it. */
cowTimer cT=new cowTimer();
cT.setTime(minutes1);
cT.start();
		}
		private int minutes;

		public void setTime(int minutes) {
			this.minutes1 = minutes;
			System.out.println("Cow set to " + minutes + " minutes.");
		}

		public void start() throws InterruptedException {
			/*
			 * 2. Count down the minutes, print the current minute then sleep for 60
			 * seconds using Thread.sleep(int milliseconds).
			 */
			for (int i = 0; i < 20; i++) {
if (minutes1>0) {
	System.out.println(minutes1);
minutes1-=1;
}
Thread.sleep(600);
if(minutes1<=0) {
	playSound("moo.wav");
	Thread.sleep(500);
	playSound("moo.wav");
	Thread.sleep(500);
	playSound("moo.wav");
	Thread.sleep(500);
	playSound("moo.wav");
	Thread.sleep(500);
	playSound("moo.wav");
	Thread.sleep(500);
	playSound("moo.wav");
	Thread.sleep(500);
	playSound("moo.wav");
	Thread.sleep(500);
	playSound("moo.wav");
	Thread.sleep(500);
	playSound("moo.wav");
		Thread.sleep(3000);
		System.exit(0);
}
		}
			}
			/*
			 * 3. When the timer is finished, use the playSound method to play a moo
			 * sound. You can download one from freesound.org, then drag it into
			 * your default package. Tell the students (by speaking) it's time to walk.
			 */


		private void playSound(String moo) {
			AudioClip sound = JApplet
					.newAudioClip(getClass().getResource(moo));
			sound.play();
		}

	private void speak(String stuffToSay) {
			try {
				Runtime.getRuntime().exec("say " + stuffToSay).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}


	}

