package br.com.cod3r.bridge.mvc.services;

import br.com.cod3r.bridge.mvc.dao.UserDao;
import br.com.cod3r.bridge.mvc.model.User;

public class UserRest implements UserService{

	private final UserDao dao;

	public UserRest(UserDao dao) {
		this.dao = dao;
	}

	@Override
	public void save(User user) {

		System.out.println("Starting a save operation through Rest Protocol!");
		dao.save(user);
	}
}
