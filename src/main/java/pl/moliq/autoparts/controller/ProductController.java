package pl.moliq.autoparts.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
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
@RequestMapping(value = "/products")
public class ProductController {

	@Autowired
	ProductService productService;

	@RequestMapping(value = "/allproducts", method = RequestMethod.GET)
	public String showProductList(Model model) {
		model.addAttribute("lista", productService.getAllProducts());
		return "products";

	}

	@RequestMapping(value = "/getbyid", method = RequestMethod.GET)
	public String showProductById(Model model, @RequestParam("id") long id) {
		Product productById;
		if ((productById = productService.getProductById(id)) != null) {
			model.addAttribute("product", productById);
			return "product";
		}
		else{			
			model.addAttribute("id", id);
			return "noproduct";
		}
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String shorRegisterFormular(Model model){
		model.addAttribute("product", new Product());
		return "newProduct";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addNewProduct(@ModelAttribute("product") @Valid Product product, BindingResult result, Model model){
		if(!result.hasErrors()){
			productService.addProductToList(product);
			return "redirect:/products/allproducts";}
		else{
			model.addAttribute("product", product);
			return "newProduct";}
	}

	@RequestMapping(value = "/category/{categ}")
	public @ResponseBody ModelAndView productsByCategory(@PathVariable("categ") String categ) {
		ModelAndView model = new ModelAndView();
		model.addObject("category", categ);
		model.addObject("list", productService.getProductsByCategory(categ));
		model.setViewName("productByCategory");
		return model;
	}

}
