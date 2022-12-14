package br.com.alura.product_control.controller;

import br.com.alura.product_control.dao.ProductDao;
import br.com.caelum.produtos.dao.ProdutoDao;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;

@Resource
public class IndexController {

	@Path("/")
	public void index() {
		new ProductDao().lista();
	}

}
