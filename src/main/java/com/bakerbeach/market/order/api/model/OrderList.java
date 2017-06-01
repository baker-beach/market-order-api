package com.bakerbeach.market.order.api.model;

import java.util.List;


public interface OrderList {

	Long getCount();

	void setCount(Long count);
	
	List<Order> getOrders();

}
