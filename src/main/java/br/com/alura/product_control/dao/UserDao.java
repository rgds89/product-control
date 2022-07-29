package br.com.alura.product_control.dao;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.alura.product_control.model.User;

public class UserDao {
	private final Session session;

	public UserDao() {
		session = new HibernateUtil().openSession();
	}

	public User buscaUsuarioPorLoginESenha(User usuario) {
		Query query = this.session.createQuery("from Usuario where login = :pLogin and senha = :pSenha");
		query.setParameter("pLogin", usuario.getLogin());
		query.setParameter("pSenha", usuario.getPassword());
		return (User) query.uniqueResult();
	}
}
