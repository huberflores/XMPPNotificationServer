package ee.ut.tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import ee.ut.notification.xmpp.server.XMPPGateway;



public class LoadDataTest {

	private static XMPPGateway server;
	
	private static String ip;
	private static String domain;
	
    public LoadDataTest(){
    
    	
    }	

	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		server = new XMPPGateway();
    	ip = server.getXMPPServer();
    	domain = server.getXMPPDomain();
    	
		System.out.println("Server IP: " + ip);
		System.out.println("Domain: " + domain);
		
	}
	
    
}
