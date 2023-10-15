package com.test.product.controller;

import com.test.product.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 库存服务
 *
 * @author 
 * @version v1.0.0
 * @date 2023/10/7 16:38
 */
@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/getProductInfoById")
    public String getStockByProductId(String productId) {
        return productService.selectStockByProductId(productId);
    }

    @GetMapping("/getProductInfo")
    public Map<String, String> getStockByProductAll() {
        return productService.selectStockByProductAll();
    }



}
