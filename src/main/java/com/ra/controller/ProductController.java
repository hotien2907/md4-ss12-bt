package com.ra.controller;
import com.ra.model.Product;
import com.ra.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value = "/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("")
    public String getAllProducts(Model model) {
        model.addAttribute("products", productService.findAll());
        return "product";
    }

    @GetMapping("/add-product")
    public String add(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "add-product";
    }

    @PostMapping("/save-product")
    public String save(@ModelAttribute("product") Product product) {
        product.setProductCode(productService.getNewId());
        productService.save(product);
        return "redirect:/product";
    }



    @GetMapping("/delete/{id}")
    public  String delete(@PathVariable("id") int id){
        productService.deleteById(id);
        return "redirect:/product";
    }


    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "edit-product";
    }

        @PostMapping("/update")
        public String update( @ModelAttribute("product") Product product) {
        productService.updateById(product,productService.findIndex(product.getProductCode()));
        return "redirect:/product";
    }


}
