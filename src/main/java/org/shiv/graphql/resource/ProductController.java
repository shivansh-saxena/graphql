package org.shiv.graphql.resource;

import org.shiv.graphql.entity.Product;
import org.shiv.graphql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

//@RestController
//@RequestMapping("/products")
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

//    @GetMapping
    @QueryMapping
    public List<Product> getAllProducts() {
        List<Product> tmp =  productService.getAllProducts();
        System.out.println(tmp);
        return tmp;
    }

//    @GetMapping("/{category}")
    @QueryMapping
    public List<Product> getProductsByCategory(/*@PathVariable*/@Argument String category) {
        return productService.getProductsByCategory(category);
    }

    @MutationMapping
    public Product updateProductStock(@Argument int id, @Argument int quantity) {
        return productService.updateProductStock(id, quantity);
    }
}
