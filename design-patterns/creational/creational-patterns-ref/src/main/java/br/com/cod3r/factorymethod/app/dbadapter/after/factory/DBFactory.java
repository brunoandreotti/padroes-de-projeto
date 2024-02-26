package br.com.cod3r.factorymethod.app.dbadapter.after.factory;

import br.com.cod3r.factorymethod.app.dbadapter.after.db.DB;

public interface DBFactory {
	DB getDatabase();
}
