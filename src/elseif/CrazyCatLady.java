//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
		String ans = JOptionPane.showInputDialog("How many cats do you have¿");
		// 2. Convert their answer into an int
		int ans2 = Integer.parseInt(ans);
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		if(ans2 >= 3) {
			JOptionPane.showMessageDialog(null, "I reccomend you see a psychiatrist");
		}
		else if (ans2 > 0) {
			playVideo("https://www.youtube.com/watch?v=oc6Yo3A7CC8");
		}
		else if(ans2 <= 0) {
			JOptionPane.showMessageDialog(null, "Congratulations on being normal");
		}
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video

		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

