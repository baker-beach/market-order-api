package com.bakerbeach.market.order.api.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bakerbeach.market.core.api.model.Address;
import com.bakerbeach.market.core.api.model.Total;

public interface Order {

	public final static String STATUS_TMP = "tmp";
	public final static String STATUS_SUBMITTED = "submitted";
	@Deprecated
	public final static String STATUS_SUBMIT = "submit";
	public final static String STATUS_ACCEPTED = "accepted";
	public final static String STATUS_CANCELED = "canceled";
	public final static String STATUS_LOGISTIC = "logistic";
	public final static String STATUS_PART_SENT = "part sent";
	public final static String STATUS_SENT = "sent";

	String getId();

	void setId(String id);

	String getShopCode();

	void setShopCode(String shopCode);

	@Deprecated
	String getCurrency();

	String getCurrencyCode();

	void setCurrencyCode(String currencyCode);

	@Deprecated
	BigDecimal getTotal();

	@Deprecated
	void setTotal(BigDecimal total);

	Total getTotal(Boolean asObject);

	void setTotal(Total total);

	String getCustomerId();

	void setCustomerId(String customerId);

	Address getShippingAddress();

	void setShippingAddress(Address shippingAddress);

	Address getBillingAddress();

	void setBillingAddress(Address billingAddress);

	Address newAddress(Address source);

	@Deprecated
	List<OrderItem> getItems();

	Map<String, OrderItem> getItems(Boolean asObject);

	OrderItem getItem(String key);

	@Deprecated
	void addItem(Object newOrderItem);

	void addItem(OrderItem item);

	Map<String, Object> getAllAttributes();

	void addAttributes(Map<String, Object> map);

	@Deprecated
	HashMap<String, Object> getAttributes();

	@Deprecated
	HashMap<String, Object> getAdditionalInformations();

	@Deprecated
	String getOrderStatus();

	String getStatus();

	void setStatus(String status);

	String getCustomerEmail();

	void setCustomerEmail(String customerEmail);

	Date getUpdatedAt();

	void setUpdatedAt(Date date);

	Date getCreatedAt();

	void setCreatedAt(Date createdAt);

	String getPaymentCode();

	void setPaymentCode(String paymentCode);

	String getPaymentTransactionId();

	OrderItem newItem();

	Total newTotal(Total source);

	List<Invoice> getInvoices();
	
	List<Packet> getPackets();


}
