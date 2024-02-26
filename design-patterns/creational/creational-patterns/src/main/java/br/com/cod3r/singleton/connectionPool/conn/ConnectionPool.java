package br.com.cod3r.singleton.connectionPool.conn;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
	private static final ConnectionPool instance = new ConnectionPool();
	private final static int POOL_SIZE = 2;
	private List<Connection> connectionsPool;

	//Construtor privado utilizado para a criação da instancia dentro da classe
	private ConnectionPool() {
		System.out.println("Creating Connection Pool");
		connectionsPool = new ArrayList<>();
		for(int i = 0; i < POOL_SIZE; i++) {
			connectionsPool.add(new Connection());
		}
	}

	//Método de retorno da instância que é iniciada na propria classe
	public static ConnectionPool getInstance() {
		return instance;
	}
	

	
	public Connection getConnection() {
		Connection avaiable = null;
		for(Connection conn: connectionsPool) {
			if(!conn.isInUse()) {
				avaiable = conn;
				break;
			}
		}
		if(avaiable == null) {
			System.out.println("No Connections avaiable");
			return null;
		}
		avaiable.setInUse(true);
		return avaiable;
	}
	
	public void leaveConnection(Connection conn) {
		conn.setInUse(false);
	}
}
