package ProjectHD;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MessageHandler {
	
	
	public static void handleMessage(ObjectInputStream ois, ObjectOutputStream oos, String ipAdress) {
		Message message;
		final String splitter = "///";
		//IF ATLEATS 1 SUPPORTER AVAILABLE
		try {
			message = (Message) ois.readObject();
			if (message.getMessageText().contains("client connect")){
				try {
					String[] parts = message.getMessageText().split(splitter);
					Server.addClient(new Client(parts[1],ipAdress));
					oos.writeObject(new Message(Server.supporterList.get(0).ipAdress,null));
					oos.flush();
					//System.out.println("message sent!");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else
			if (message.getMessageText().contains("supporter connect")){
				//handleSupporterMessage(message.getMessageText());
				System.out.println(message.getMessageText());
				String[] parts = message.getMessageText().split(splitter);
				String supporterName = parts[1];
				//String supporterName = message.getMessageText().substring (18);
				Server.addSupporter(new Supporter(parts[1], ipAdress));
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
//	private static void handleClientMessage(String message){
//		
//	}
//	
//	private static void handleSupporterMessage(String message){
//		
//	}
}
