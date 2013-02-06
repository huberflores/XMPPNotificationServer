package ee.ut.notification.xmpp.server;


public class Pair {
	
	 public final String name;
	 public final String value;

	  public Pair(final String n, final String v) {
	    this.name = n;
	    this.value = v;
	  }
	  
	  public String getPairName(){
		  return this.name;
	  }
	  
	  public String getPairValue(){
		  return this.value;
	  }

}
