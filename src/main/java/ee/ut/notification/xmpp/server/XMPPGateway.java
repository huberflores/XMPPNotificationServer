package ee.ut.notification.xmpp.server;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class XMPPGateway {
	
	private String XMPPServer;
	private String XMPPDomain;
	
	private Properties props = new Properties();
	
	public XMPPGateway() throws FileNotFoundException, IOException{
    	props.load(new FileInputStream("server.properties"));
    	loadProperties();
    	
	}
	
	public void loadProperties(){
		this.XMPPServer = props.getProperty("server");
    	this.XMPPDomain = props.getProperty("domain");
	}
	
	
	public String getXMPPServer(){
		return this.XMPPServer;
	}
	
	public String getXMPPDomain(){
		return this.XMPPDomain;
	}

}
