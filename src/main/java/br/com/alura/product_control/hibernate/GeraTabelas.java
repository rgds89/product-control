package br.com.alura.product_control.hibernate;

import java.util.Calendar;

import br.com.alura.product_control.model.Product;
import br.com.alura.product_control.model.User;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import br.com.caelum.produtos.dao.HibernateUtil;
import br.com.caelum.produtos.modelo.Produto;
import br.com.caelum.produtos.modelo.Usuario;

public class GeraTabelas {
	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.addAnnotatedClass(Product.class);
		cfg.addAnnotatedClass(User.class);
		new SchemaExport(cfg).create(true, true);
		criaUsuarioEProduto();
	}

	private static void criaUsuarioEProduto() {
		User usuario = new User();
		usuario.setLogin("teste");
		usuario.setPassword("teste");
		Session session = new HibernateUtil().openSession();
		session.beginTransaction();
		session.save(usuario);
		Product produto = new Product();
		produto.setSalesStartDate(Calendar.getInstance());
		produto.setDescription("Descricao de teste");
		produto.setName("Teste");
		produto.setPrice(20.5);
		session.save(produto);
		session.getTransaction().commit();
		session.close();

	}

}
