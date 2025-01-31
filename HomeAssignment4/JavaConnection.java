package week4.HomeAssignment4;

public class JavaConnection extends MySqlConnection implements DatabaseConnection {

	public static void main(String[] args) {
		JavaConnection cntn = new JavaConnection();
		cntn.disconnect();
		cntn.connect();
		cntn.executeUpdate();
		cntn.executeQuery("Connected to server successfully");
	}

	@Override
	public void connect() {
		System.out.println("Connecting...");
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnecting...");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execute the updates...");
	}

}
