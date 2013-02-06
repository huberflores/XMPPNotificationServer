package ee.ut.notification.xmpp.server;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;

import org.json.simple.JSONObject;

public class MessagePacker {
	
	private Message message;
	private String jsonNotification;
	
	public MessagePacker(Message n){
		this.message = n;
		
	}
	
	private String packMessageToJSON() throws IOException{
	
		JSONObject jsonMessage = new JSONObject();
		Iterator i = message.getMessage().iterator();
		Pair data;
		while (i.hasNext()){
			data = (Pair) i.next();
			jsonMessage.put(data.getPairName(), data.getPairValue());
		}   	
		
		StringWriter notification = new StringWriter();
		jsonMessage.writeJSONString(notification);
		jsonNotification = notification.toString();
		
		return jsonNotification;
		
	}
	
	public String getJsonNotification() throws IOException{
		return packMessageToJSON();
	}

	

}
