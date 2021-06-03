package com.example.demo.orders.interfaces.rest;

import com.example.demo.orders.application.services.OrderService;
import com.example.demo.orders.interfaces.rest.dto.OrderCreateDto;
import com.example.demo.orders.interfaces.rest.dto.OrderViewDto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class OrderController implements OrderApi{

    private final OrderService orderService;

    public ResponseEntity<OrderViewDto> postOrders( OrderCreateDto orderCreateDto) throws Exception {
        OrderViewDto orderViewDto = orderService.createOrder(orderCreateDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(orderViewDto);
    }
    
}
