package com.ds;

import com.db.model.Product;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class ProductServiceDS {

    //todo private final ProductRepository productRepository;
    protected final DSLContext jooq;

    public List<Product> list() {
        //jooq.select().from()
        return null; //todo productRepository.findAll();
    }

    public Product findById(int prdId){
        return null;
        //jooq.select().from(generated.tables.Product).where()
        //return productRepository.findById(prdId);
    }

    public void addProduct(Product product){
        //todo productRepository.save(product);
    }

    // TODO: rework without filter, but with conditions
    public List<Product> searchProduct(List<Condition> conditions){
        List<Product> test = new ArrayList<>();
        /* todo
        for(Product product: productRepository.findAll()){
            if(product.getPrice() == productFilter.getPrice() &&
                    product.getTitle().toLowerCase().equals(productFilter.getTitle().toLowerCase()) &&
                    categoryFound(productFilter.getCategory(),product.getCategories())
            )
                test.add(product);
        }*/
        return test;
    }

    private boolean categoryFound(String filterCategory, String productCategories) {
        boolean categoryFound = false;
        String[] categoriesArray = productCategories.split(",");
        for(int i = 0 ; i < categoriesArray.length; i++){
            categoriesArray[i] = categoriesArray[i].trim();
        }

        for(String category: categoriesArray){
            if (filterCategory.toLowerCase().equals(category.toLowerCase())){
                categoryFound = true;
                break;
            }
        }
        return categoryFound;
    }

    public Product update(Product product, int id){//todo
        return null;
    }

    public void delete(int id){
       // todo productRepository.deleteById(id);
    }
}