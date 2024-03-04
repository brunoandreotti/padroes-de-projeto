package br.com.cod3r.bridge.mvc.services;

import br.com.cod3r.bridge.mvc.dao.UserDao;
import br.com.cod3r.bridge.mvc.model.User;

public class UserSoap implements UserService{

	private final UserDao dao;

	public UserSoap(UserDao dao) {
		this.dao = dao;
	}

	@Override
	public void save(User user) {

		System.out.println("Starting a save operation through Soap Protocol!");
		dao.save(user);
	}
}
