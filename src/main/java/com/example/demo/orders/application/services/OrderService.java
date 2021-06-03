package com.example.demo.orders.application.services;

import java.time.LocalDateTime;
import java.util.UUID;

import com.example.demo.orders.domain.model.entites.Orders;
import com.example.demo.orders.domain.model.entites.OrdersDetail;
import com.example.demo.orders.infrastructure.repositories.OrdersDetailRepository;
import com.example.demo.orders.infrastructure.repositories.OrdersRepository;
import com.example.demo.orders.interfaces.rest.dto.OrderCreateDto;
import com.example.demo.orders.interfaces.rest.dto.OrderViewDto;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {
    
    private final OrdersRepository ordersRepository;
    private final OrdersDetailRepository ordersDetailRepository;

    @Transactional(rollbackFor = Exception.class)
    public OrderViewDto createOrder(OrderCreateDto orderCreateDto){
        Orders orders = new Orders();
        String orderId = UUID.randomUUID().toString();
        orders.setOrderId(orderId);
        orders.setCustomerName(orderCreateDto.getCustomerName());
        orders.setTotalAmount(orderCreateDto.getTotalAmount());
        orders.setVersion(0);
        orders.setCreatedBy(orderCreateDto.getCustomerName());
        orders.setCreatedDate(LocalDateTime.now());
        orders.setLastModifiedBy(orderCreateDto.getCustomerName());
        orders.setLastModifiedDate(LocalDateTime.now());
        ordersRepository.save(orders);
        orderCreateDto.getGoods().forEach(goods -> {
            OrdersDetail ordersDetail = new OrdersDetail();
            ordersDetail.setSerId(UUID.randomUUID().toString());
            ordersDetail.setOrderId(orderId);
            ordersDetail.setGoodsId(goods.getGoodsId());
            ordersDetail.setGoodsName(goods.getGoodsName());
            ordersDetail.setCount(goods.getCount());
            ordersDetail.setVersion(0);
            ordersDetail.setCreatedBy(orderCreateDto.getCustomerName());
            ordersDetail.setCreatedDate(LocalDateTime.now());
            ordersDetail.setLastModifiedBy(orderCreateDto.getCustomerName());
            ordersDetail.setLastModifiedDate(LocalDateTime.now());
            ordersDetailRepository.save(ordersDetail);
        });
        OrderViewDto orderViewDto = new OrderViewDto();
        orderViewDto.setOrderId(orderId);
        orderViewDto.setCustomerName(orderCreateDto.getCustomerName());
        orderViewDto.setTotalAmount(orderCreateDto.getTotalAmount());
        orderViewDto.setGoods(orderCreateDto.getGoods());
        return orderViewDto;
    }
}
