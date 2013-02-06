package ee.ut.tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ee.ut.notification.xmpp.server.*;


public class MessageTest {
	
	private static ArrayList<Pair> generic;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message m = new Message();
		m.addAttribute("payload", "Here comes the payload");
		m.addAttribute("type", "notification");
		m.addAttribute("timestamp", System.currentTimeMillis()+"");
		
		/*generic = m.getMessage();
		
		Iterator i = generic.iterator();
		Pair data;
		while (i.hasNext()){
			data = (Pair) i.next();
			System.out.println(data.getPairName().toString() + "," + data.getPairValue().toString());
		}*/
		
		//Notification test extended
		
		
		MessagePacker notification = new MessagePacker(m);
		try {
			System.out.println(notification.getJsonNotification().toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
