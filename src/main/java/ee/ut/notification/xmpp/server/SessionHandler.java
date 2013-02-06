package ee.ut.notification.xmpp.server;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.jivesoftware.smack.Chat;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.packet.Message;

public class SessionHandler implements MessageListener{

	private XMPPConnection connection;
	private XMPPGateway broker;
	private ConnectionConfiguration config;
	
	
    public SessionHandler(String user, String pass) throws FileNotFoundException, XMPPException, IOException{
    	configure();
    	login(user,pass);
    }
    
    
    public void login(String userName, String password) throws XMPPException, FileNotFoundException, IOException
	{
	    connection = new XMPPConnection(config);
	    connection.connect();
	    connection.login(userName, password);
	}
    
    public void configure() throws FileNotFoundException, IOException{
    	broker = new XMPPGateway();
	    config = new ConnectionConfiguration(broker.getXMPPServer(),5222, broker.getXMPPDomain());
    }
    
    public void sendMessage(String message, String to) throws XMPPException
	{
	    Chat chat = getXMPPConnection().getChatManager().createChat(to, this);
	    chat.sendMessage(message);
	}


	@Override
	public void processMessage(Chat arg0, Message arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public XMPPConnection getXMPPConnection(){
		return this.connection;
	}
	
    
}
