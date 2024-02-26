package br.com.cod3r.factorymethod.app.dbadapter.factory;

import br.com.cod3r.factorymethod.app.dbadapter.db.DB;

public interface DBFactory {
	DB getDatabase();
}
