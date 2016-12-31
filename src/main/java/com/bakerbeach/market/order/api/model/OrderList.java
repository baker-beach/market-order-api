package com.bakerbeach.market.order.api.model;

import java.util.List;

import com.bakerbeach.market.core.api.model.Order;


public interface OrderList {

	Integer getCount();

	void setCount(Integer count);
	
	List<Order> getOrders();

}
