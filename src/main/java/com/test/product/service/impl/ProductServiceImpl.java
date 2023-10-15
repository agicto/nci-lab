package com.test.product.service.impl;

import com.test.product.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author
 * @version v1.0.0
 * @date 2023/10/7 16:36
 */
@Service
public class ProductServiceImpl implements ProductService {

    private static final Map<String, String> stockMap = new HashMap<>();

    static {
        stockMap.put("1001", "iphone 13");
        stockMap.put("1002", "iphone 14");
        stockMap.put("1003", "iphone 15");
        stockMap.put("1004", "iphone 16");
    }

    @Override
    public String selectStockByProductId(String productId) {
        return stockMap.get(productId);
    }

    @Override
    public Map<String, String> selectStockByProductAll() {
        return stockMap;
    }
}
