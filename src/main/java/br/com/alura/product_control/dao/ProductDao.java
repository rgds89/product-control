package br.com.alura.product_control.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.alura.product_control.model.Product;

public class ProductDao {

	private final Session session;

	public ProductDao() {
		this.session = new HibernateUtil().openSession();
	}

	public void adiciona(Product p) {
		Transaction tx = session.beginTransaction();
		session.save(p);
		tx.commit();
	}

	public void atualiza(Product p) {
		Transaction tx = session.beginTransaction();
		session.update(p);
		tx.commit();
	}

	public void remove(Product p) {
		Transaction tx = session.beginTransaction();
		session.delete(p);
		tx.commit();
	}

	@SuppressWarnings("unchecked")
	public List<Product> lista() {
		return session.createCriteria(Product.class).list();
	}

}