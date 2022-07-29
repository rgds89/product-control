package br.com.alura.product_control.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import br.com.alura.product_control.model.Product;
import br.com.alura.product_control.model.User;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;

	static {

		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.addAnnotatedClass(Product.class);
		configuration.addAnnotatedClass(User.class);
		sessionFactory = configuration.buildSessionFactory();
		new SchemaExport().create(true, false);

	}

	public Session openSession() {
		return sessionFactory.openSession();
	}
}