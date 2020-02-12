package singleton;

public class ConnectDB {

	public static ConnectDB objConnDb;
	
	// singleton
	public static ConnectDB createConnection() {
		if (objConnDb == null) {
			objConnDb = new ConnectDB();
		}
		return objConnDb;
	}

	// constructor
	public ConnectDB() {}

	public void connect() {}
	public void runSQL() {}
	public void disconnect() {}

}
