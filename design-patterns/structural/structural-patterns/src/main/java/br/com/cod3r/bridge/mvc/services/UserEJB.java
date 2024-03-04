package br.com.cod3r.bridge.mvc.services;

import br.com.cod3r.bridge.mvc.dao.UserDao;
import br.com.cod3r.bridge.mvc.model.User;

public class UserEJB implements UserService {

	private final UserDao dao;

	public UserEJB(UserDao dao) {
		this.dao = dao;
	}

	@Override
	public void save(User user) {

		System.out.println("Starting a save operation through EJB Protocol!");
		dao.save(user);
	}


}
