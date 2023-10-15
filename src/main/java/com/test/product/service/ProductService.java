package com.test.product.service;

import java.util.Map;

public interface ProductService {

    /**
     * 通过商品ID查询库存
     *
     * @param productId
     * @return
     */
    String selectStockByProductId(String productId);

    Map<String, String> selectStockByProductAll();
}