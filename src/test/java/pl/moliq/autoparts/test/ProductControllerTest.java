package pl.moliq.autoparts.test;

import org.springframework.stereotype.Controller;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.RequestMethod;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import pl.moliq.autoparts.controller.ProductController;

public class ProductControllerTest {
	
	public void testShowAllProduct() throws Exception{
		ProductController productController = new ProductController();
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(productController).build();
		mockMvc.perform(get("/products")).andExpect(view().name("products"));
	
	}

}
