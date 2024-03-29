package ProjectHD;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public abstract class Connector {
	
		protected AudioInput speaker;
		protected AudioOutput microphone;
		protected Socket connection;
		protected String userName;
		protected ObjectOutputStream oos;;
		protected ObjectInputStream ois;
	
	public void startSpeakers() {
		speaker = new AudioInput(connection);
		Thread receiverThread = new Thread(speaker);
		receiverThread.start();
	}

	public void startMicrophone() {
		microphone = new AudioOutput(connection);
		Thread senderThread = new Thread(microphone);
		senderThread.start();
	}

	public void suspendSpeakers() {
		speaker.pause();
	}

	public void suspendMicrophone() {
		microphone.pause();
	}

	public void resumeSpeakers() {
		speaker.resume();
	}

	public void resumeMicrophone() {
		microphone.resume();
	}
	
	public void setUserName(String userName){
		try {
			oos.writeObject(new Message(userName, null));
			oos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getUserName(){
		return userName;
	}
	
	public void receiveUserName(){
		try {
			Message message = (Message)ois.readObject();
			userName = message.getMessageText();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
