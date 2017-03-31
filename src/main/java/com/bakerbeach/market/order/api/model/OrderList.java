package com.bakerbeach.market.order.api.model;

import java.util.List;

import com.bakerbeach.market.core.api.model.Order;


public interface OrderList {

	Long getCount();

	void setCount(Long count);
	
	List<Order> getOrders();

}
