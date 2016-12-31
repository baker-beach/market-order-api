package com.bakerbeach.market.order.api.service;

import com.bakerbeach.market.core.api.model.Cart;
import com.bakerbeach.market.core.api.model.Customer;
import com.bakerbeach.market.core.api.model.Order;
import com.bakerbeach.market.core.api.model.ShopContext;
import com.bakerbeach.market.order.api.model.OrderList;

public interface OrderService {

	static final String ADDITIONAL_ORDER_INFORMATIONS = "ADDITIONAL_ORDER_INFORMATIONS";

	Order order(Cart cart, Customer customer, ShopContext shopContext) throws OrderServiceException;

	String getNextOrderId(ShopContext shopContext) throws OrderServiceException;

	Order cancelOrder(String orderId) throws OrderServiceException;

	OrderList findOrderByCustomerIdAndShopCode(String customerId, String shopCode) throws OrderServiceException;

	OrderList findOrderByCustomerIdAndShopCode(String customerId, String shopCode, Integer limit, Integer offset)
			throws OrderServiceException;

	Order findOrderById(String orderId) throws OrderServiceException;

}
