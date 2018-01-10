package com.bakerbeach.market.order.api.model;

import java.util.Date;
import java.util.List;

import com.bakerbeach.market.core.api.model.Address;
import com.bakerbeach.market.core.api.model.Total;

public interface Invoice {
	
	String getId();
	
	String getOrderId();
	
	String getCustomerId();
	
	Address getShippingAddress();

	Address getBillingAddress();
	
	Total getTotal();
	
	List<InvoiceItem> getItems();
	
	Date getOrderDate();
	
	Date getInvoiceDate();

}
