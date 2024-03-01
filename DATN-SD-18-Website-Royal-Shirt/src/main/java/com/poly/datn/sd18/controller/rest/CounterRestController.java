package com.poly.datn.sd18.controller.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/counter")
public class CounterRestController {
    @PostMapping("/add-bill")
    public ResponseEntity<?> addBill() {
        return null;
    }

    @GetMapping("/employees")
    public ResponseEntity<?> getAllEmployees() {
        return null;
    }

    @PostMapping("/checkout")
    public ResponseEntity<?> checkOut() {
        return null;
    }
}
