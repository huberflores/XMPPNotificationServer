package ee.ut.notification.xmpp.server;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jivesoftware.smack.XMPPException;

public class RESTNotification extends HttpServlet {

	private String jidmobile;
	private String payload;
	private MessagingFramework xmpp;
	private Message msg;
	
	
	private static final long serialVersionUID = 1L; 
	
	/**
	 * 
	 */
    public void doGet(HttpServletRequest req, HttpServletResponse res) {
		
    	jidmobile = req.getParameter("jidmobile").toString().trim();
		payload = req.getParameter("payload").toString().trim();
		
		xmpp = new MessagingFramework();
		
		try {
			xmpp.initialize();
			msg = new Message();
			msg.addAttribute("payload", payload);
			msg.addAttribute("servertime", System.currentTimeMillis()+""); //comment if not needed
			
			xmpp.sendNotification(jidmobile, msg);
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
	
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse res){}
		
	

}
