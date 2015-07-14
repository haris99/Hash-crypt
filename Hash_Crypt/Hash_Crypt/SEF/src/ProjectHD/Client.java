package ProjectHD;

import java.util.Arrays;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.TargetDataLine;
import javax.swing.JOptionPane;

public class Client extends User {
	private String userType;
	
	public Client() {
		super();
		userType = "client";
	}
	
	public Client(String userName, String ipAdress){
		super(userName,ipAdress);
		userType = "client";
	}

	public static void main(String[] args) throws Exception {
		// Client client = new Client();
		// AudioOutput output =new AudioOutput();
		// receiver.start();
		// Thread senderThread = new Thread(output);
		// senderThread.start();
		// AudioInput input = new AudioInput();
		// output.pause(); //PAUSE
		// output.resume(); //RESUME
		// ClientWindow.main(null);

	}

}

// 192.168.10.118