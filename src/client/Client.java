package client;

public class Client {
	protected String refClient ;

	public Client(String refClient) {
		this.refClient = refClient;
	}

	public String getRefClient() {
		return refClient;
	}

	public void setRefClient(String refClient) {
		this.refClient = refClient;
	} 
}
