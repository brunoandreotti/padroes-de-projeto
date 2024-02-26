package br.com.cod3r.singleton.connectionPool;

import br.com.cod3r.singleton.connectionPool.conn.Connection;
import br.com.cod3r.singleton.connectionPool.conn.ConnectionPool;

public class Client {

	//O padrão Singleton tem como objetivo garantir que uma classe possua somente uma única instância
	// provendo um ponto de acesso global para ela. Podendo ser feito através de um método estático (ex: getInstance)
	//e modificando a visibilidade do construtor da classe (ex: private)

	//No exemplo abaixo, cada método para executar uma query acessa a mesma instância do ConnectionPool
	//Evitando abrir uma connection pool para cada query. Dessa forma todas utilizam as conexões que já foram abertas
	// Então por termos colocado apenas 2 conexões no pool, ao tentar executar a terceira query
	//Será informado o erro de "No connection available" por que todas as queryes estão usando a mesma instância
	//da classe ConnectionPool
	public static void doQuery1() {
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		if(conn != null)
			conn.query("SELECT * FROM A1");
	}
	
	public static void doQuery2() {
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		if(conn != null)
			conn.query("SELECT * FROM A2");
	}
	
	public static void doQuery3() {
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		if(conn != null)
			conn.query("SELECT * FROM A3");
	}

	public static void main(String[] args) {
		doQuery1();
		doQuery2();
		doQuery3();
	}
}
