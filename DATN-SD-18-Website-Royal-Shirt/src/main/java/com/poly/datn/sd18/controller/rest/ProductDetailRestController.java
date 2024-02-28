package com.poly.datn.sd18.controller.rest;

import com.poly.datn.sd18.dto.ProductDetailRequest;
import com.poly.datn.sd18.entity.ProductDetail;
import com.poly.datn.sd18.service.ProductDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/rest/product-detail")
public class ProductDetailRestController {
    @Autowired
    ProductDetailService productDetailService;

    @GetMapping("productDetails")
    public ResponseEntity<List<ProductDetail>> getAllProductDetails() {
        return ResponseEntity.ok().body(productDetailService.getAllProductDetail());
    }
    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody ProductDetailRequest productDetailRequest) {
        return ResponseEntity.ok(productDetailService.add(productDetailRequest));
    }
}
