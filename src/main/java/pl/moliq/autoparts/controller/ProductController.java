package pl.moliq.autoparts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import pl.moliq.autoparts.domain.Car;
import pl.moliq.autoparts.domain.Product;
import pl.moliq.autoparts.services.CarService;
import pl.moliq.autoparts.services.ProductService;

@Controller
@RequestMapping(value="/products")
public class ProductController {

@Autowired 
ProductService productService;

@RequestMapping(value="/allproducts", method=RequestMethod.GET)
public ModelAndView showProductList(){
	ModelAndView model = new ModelAndView();
	model.addObject("list", productService.getAllProducts());
	model.setViewName("products");
	return model;
}

@RequestMapping(value="/getbyid", method=RequestMethod.GET)
public @ResponseBody ModelAndView showProductById(@RequestParam("id") long id)
{
	Product productById = productService.getProductById(id);
	ModelAndView model = new ModelAndView();
	model.addObject("product", productById);
	model.setViewName("product");
	return model;
}

@RequestMapping(value="/category/{categ}")
public @ResponseBody ModelAndView productsByCategory(@PathVariable("categ") String categ)
{
	ModelAndView model = new ModelAndView();
	model.addObject("category", categ);
	model.addObject("list", productService.getProductsByCategory(categ));
	model.setViewName("productByCategory");
	return model;
}


}
