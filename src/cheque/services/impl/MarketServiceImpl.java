package cheque.services.impl;

import cheque.enums.Products;
import cheque.services.MarketService;

import java.util.ArrayList;
import java.util.List;

public class MarketServiceImpl implements MarketService {
    List<Products>products=new ArrayList<>();

    @Override
    public Integer stock() {
        return null;
    }

    @Override
    public String getAllProducts() {
        for (Products product : products) {
            System.out.println(product.name());
        }
        return null;
    }

    @Override
    public String cancel() {
        return null;
    }
}
