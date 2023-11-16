package com.ra.service;

import com.ra.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class ProductService  implements IGenericService<Product,Integer>{
    private List<Product> products ;
    public ProductService() {
        products = new ArrayList<>();
        products.add(new Product(1,"product1" ,500));
        products.add(new Product(2,"product2" ,600));
        products.add(new Product(3,"product3" ,700));
    }


    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Boolean save(Product product) {
        return products.add(product);
    }

    @Override
    public Product findById(Integer id) {
        for (Product p:products
        ) {
            if(p.getProductCode() == id){
                return p;
            }
        }
        return null;
    }

    @Override
    public Boolean updateById(Product product, Integer id) {
        if (products != null && id >= 0 && id < products.size()) {
            products.set(id, product);
            return true;
        }
        return false;
    }

    @Override
    public void deleteById(Integer id) {
        products.remove(findById(id));
    }
    public int getNewId (){
        int idMax = 0;
        for (Product p:products
        ) {
            if(idMax<p.getProductCode()){
                idMax = p.getProductCode();
            }
        }
        return idMax+1;
    }

    public int findIndex (int id){
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getProductCode()==id){
                return  i;
            }
        }
        return -1;
    }

}
