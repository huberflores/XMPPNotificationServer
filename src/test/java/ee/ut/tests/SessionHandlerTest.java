package ee.ut.tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.jivesoftware.smack.XMPPException;

import ee.ut.notification.xmpp.server.SessionHandler;
import ee.ut.notification.xmpp.server.Utilities;

public class SessionHandlerTest {

	private static SessionHandler server;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			runTest();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XMPPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void runTest() throws FileNotFoundException, XMPPException, IOException{
		server = new SessionHandler(Utilities.JID, Utilities.password);
		server.sendMessage("Hola Mundo", "jidmobile@amazon-xmpp/Home");
		
	}
	

}
