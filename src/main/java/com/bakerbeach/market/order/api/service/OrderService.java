package com.bakerbeach.market.order.api.service;

import com.bakerbeach.market.core.api.model.Cart;
import com.bakerbeach.market.core.api.model.Customer;
import com.bakerbeach.market.core.api.model.ShopContext;
import com.bakerbeach.market.order.api.model.Order;
import com.bakerbeach.market.order.api.model.OrderList;

public interface OrderService {

	static final String ADDITIONAL_ORDER_INFORMATIONS = "ADDITIONAL_ORDER_INFORMATIONS";

	Order order(Cart cart, Customer customer, ShopContext shopContext) throws OrderServiceException;

	String getNextOrderId(ShopContext shopContext) throws OrderServiceException;

	@Deprecated
	Order cancelOrder(String orderId) throws OrderServiceException;

	Order cancelOrder(String shopCode, String orderId) throws OrderServiceException;

	@Deprecated
	OrderList findOrderByCustomerIdAndShopCode(String customerId, String shopCode) throws OrderServiceException;

	OrderList findOrderByCustomerIdAndShopCode(String customerId, String shopCode, String sort, Integer limit,
			Integer offset) throws OrderServiceException;

	@Deprecated
	Order findOrderById(String orderId) throws OrderServiceException;

	Order findOrderById(String shopCode, String orderId) throws OrderServiceException;

	OrderList findOrderByStatusAndShopCode(String status, String shopCode, String sort, Integer limit, Integer offset)
			throws OrderServiceException;

	void saveOrUpdate(Order order) throws OrderServiceException;

}
