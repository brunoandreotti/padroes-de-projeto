package br.com.cod3r.factorymethod.app.dbadapter.after.db;

public interface DB {
	void query(String sql);
	void update(String sql);
}
