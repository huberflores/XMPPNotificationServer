package ee.ut.tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.jivesoftware.smack.XMPPException;

import ee.ut.notification.xmpp.server.Message;
import ee.ut.notification.xmpp.server.MessagingFramework;

public class MessagingFrameworkTest {

	private static MessagingFramework xmpp;
	private static Message msg;
	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws XMPPException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, XMPPException, IOException {
		// TODO Auto-generated method stub

		xmpp = new MessagingFramework();
		xmpp.initialize();
		
		msg = new Message();
		msg.addAttribute("payload", "This is raw data for a mobile application");
		msg.addAttribute("servertime", System.currentTimeMillis() + ""); //comment if not needed
		
		xmpp.sendNotification("jidmobile@amazon-xmpp/Home", msg);
		
	}

}

