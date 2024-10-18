package com.api.controllers;

import com.api.dtos.filters.ProductFilter;
import com.api.dtos.models.ProductDTO;
import com.api.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RestControllerAdvice
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService) {this.productService = productService;}

    @GetMapping("/{id}")
    public ProductDTO getSomeProductById(@PathVariable("id") Integer id){

        return productService.findById(id);
    }

    @GetMapping()
    public List<ProductDTO> getProducts(){return productService.list();}
    @GetMapping("/search")
    public List<ProductDTO> searchProducts(@RequestBody ProductFilter productFilter){
        return productService.searchProduct(productFilter);
    }

    @PutMapping(value = "/update/{id}")
    public ProductDTO update(@PathVariable("id") Integer id,
                          @RequestBody ProductDTO product){
        return productService.update(product, id);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") Integer id){
        productService.delete(id);
    }}