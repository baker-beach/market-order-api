package com.bakerbeach.market.order.api.model;

import com.bakerbeach.market.core.api.model.Address;

public interface Packet {

	String getReference();

	String getInvoiceId();

	String getTrackingId();
	
	void setTrackingId(String trackingId);

	Address getShippingAddress();
}
