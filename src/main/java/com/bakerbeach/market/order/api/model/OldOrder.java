package com.bakerbeach.market.order.api.model;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.bakerbeach.market.core.api.model.Address;
import com.bakerbeach.market.core.api.model.Total;
import com.bakerbeach.market.core.api.model.Total.Line;

/**
 * @author: achim.wolf@baker-beach.com Date: 08.02.2013
 */

public interface OldOrder {

	public static final String STATUS_TMP = "TMP";
	public static final String STATUS_ACCEPTED = "ACCEPTED";
	public static final String STATUS_DECLINED = "DECLINED";
	public static final String STATUS_CANCELED = "CANCELED";
	public static final String STATUS_PROCESSING = "PROCESSING";
	public static final String STATUS_COMPLETED = "COMPLETED";

	public final static String ORDER_STATUS_WAITING = "0-WAITING";
	public final static String ORDER_STATUS_ACCEPTED = "1-ACCEPTED";
	public final static String ORDER_STATUS_PARTIAL_SENT = "2-PARTIAL-SENT";
	public final static String ORDER_STATUS_SENT = "3-SENT";
	public final static String ORDER_STATUS_CANCEL_REQUEST = "4-ASKED-STORNO";
	public final static String ORDER_STATUS_CANCELED = "5-CANCELED";
	public final static String ORDER_STATUS_DELIVERED = "6-DELIVERED";
	public final static String ORDER_STATUS_PARTIAL_CANCELED = "7-PARTIAL-CANCELED";
	public final static String ORDER_STATUS_REFUND = "8-REFUND";
	public final static String ORDER_STATUS_RETOURE = "9-RETOURE";

	public final static String PAYMENT_STATUS_PENDING = "0-PENDING";
	public final static String PAYMENT_STATUS_OK = "1-OK";
	public final static String PAYMENT_STATUS_REFUND_PENDING = "2-REFUND-PENDING";
	public final static String PAYMENT_STATUS_REFUND = "3-REFUND";
	public final static String PAYMENT_STATUS_SUBMITTED_TO_PROVIDER = "4-SUBMITTED-TO-PROVIDER";
	public final static String PAYMENT_STATUS_PAYABLE_WITHIN_14DAYS = "5-PAYABLE-WITHIN_14DAYS";
	public final static String PAYMENT_STATUS_WITHDRAWAL_ON_SHIPMENT = "6-WITHDRAWAL-ON-SHIPMENT";
	public final static String PAYMENT_STATUS_NOT_WITHDRAWN = "7-NOT-WITHDRAWN";


	String getCouponCodes();

	void setCouponCodes(String couponCodes);

	String getCurrency();

	void setCurrency(String currency);

	BigDecimal getValueOfGoods();

	void setValueOfGoods(BigDecimal valueOfGoods);

	BigDecimal getShipping();

	void setShipping(BigDecimal shipping);

	BigDecimal getRebate();

	void setRebate(BigDecimal rebate);

	BigDecimal getLoyalty();

	void setLoyalty(BigDecimal loyalty);

	BigDecimal getVoucher();

	void setVoucher(BigDecimal voucher);

	BigDecimal getTotal();

	void setTotal(BigDecimal total);

	Collection<Line> getTotalTaxLines();

	void setTotalTaxLines(Collection<Line> totalTaxLines);

	BigDecimal getTotalTax();

	Address getBillingAddress();

	void setBillingAddress(Address billingAddress);

	Address getShippingAddress();

	void setShippingAddress(Address shippingAddress);

	String getStatus();

	void setStatus(String status);

	String getStatusInfo();

	void setStatusInfo(String statusInfo);


}
