package com.bakerbeach.market.order.api.model;

import java.math.BigDecimal;

import com.bakerbeach.market.core.api.model.TaxCode;

public interface InvoiceItem {
	
	String getGtin();

	String getName();

	BigDecimal getQuantity();
	
	TaxCode getTaxCode();
	
	BigDecimal getTaxPercent();

	BigDecimal getTotal();
	
	BigDecimal getUnitPrice();

}
