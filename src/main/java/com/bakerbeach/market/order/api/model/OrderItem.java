package com.bakerbeach.market.order.api.model;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bakerbeach.market.core.api.model.TaxCode;

public interface OrderItem {

	String getQualifier();

	void setQualifier(String qualifier);

	String getCode();

	void setCode(String code);

	String getGtin();

	void setGtin(String gtin);

	String getName();

	void setName(String name);

	String getBrand();

	void setBrand(String brand);

	Map<String, String> getTitle();

	String getTitle(String key);

	void setTitle(Map<String, String> title);

	@Deprecated
	String getTitle1();

	@Deprecated
	String getTitle2();

	@Deprecated
	String getTitle3();

	String getSize();

	String getColor();

	Map<String, String> getImages();

	String getImage(String key);

	void setImages(Map<String, String> images);

	@Deprecated
	String getImageUrl1();

	@Deprecated
	String getImageUrl2();

	@Deprecated
	BigDecimal getUnitPrice();

	Map<String, BigDecimal> getUnitPrices();

	BigDecimal getUnitPrice(String key);

	void setUnitPrices(Map<String, BigDecimal> unitPrices);

	void setUnitPrice(String string, BigDecimal value);

	void addUnitPrices(Map<String, BigDecimal> unitPrices);

	BigDecimal getQuantity();

	void setQuantity(BigDecimal quantity);

	BigDecimal getDiscount();

	void setDiscount(BigDecimal discount);

	@Deprecated
	BigDecimal getTotalPrice();

	Map<String, BigDecimal> getTotalPrices();

	BigDecimal getTotalPrice(String key);

	void setTotalPrices(Map<String, BigDecimal> totalPrices);

	String getSupplier();

	void setSupplier(String supplier);

	TaxCode getTaxCode();

	void setTaxCode(TaxCode taxCode);

	BigDecimal getTaxPercent();

	void setTaxPercent(BigDecimal taxPercent);

	Boolean isVisible();

	void setIsVisible(Boolean isVisible);

	Boolean isVolatile();

	void setIsVolatile(Boolean isVolatile);

	Boolean isImmutable();

	void setIsImmutable(Boolean isImmutable);

	@Deprecated
	Map<String, OrderItemComponent> getComponents();

	@Deprecated
	HashMap<String, Object> getAttributes();

	Map<String, Object> getAllAttributes();

	@Deprecated
	Map<String, OrderItemOption> getOptions();

	Map<String, Option> getAllOptions();

	void setOptions(Map<String, Option> options);
	
	void putOption(String key, Option option);

	Option newOption(String code);

	public interface Option {

		String getCode();

		void setCode(String code);

		BigDecimal getQuantity();

		void setQuantity(BigDecimal quantity);

		String getTag();

		void setTag(String tag);

		String getGtin();

		void setGtin(String gtin);

		Map<String, BigDecimal> getUnitPrices();

		BigDecimal getUnitPrice(String key);

		void setUnitPrices(Map<String, BigDecimal> unitPrices);

		void setUnitPrice(String key, BigDecimal value);

		void addUnitPrices(Map<String, BigDecimal> unitPrices);

		void multiplyUnitPrices(BigDecimal multiplicand);

		Map<String, String> getTitle();

		String getTitle(String key);

		void setTitle(Map<String, String> title);

	}

	@Deprecated
	public static interface OrderItemComponent {

		String getName();

		Map<String, OrderItemOption> getOptions();

	}

	@Deprecated
	public static interface OrderItemOption {

		String getGtin();

		Integer getQuantity();

		void setQuantity(Integer quantity);

		Map<String, BigDecimal> getUnitPrices();

		void setUnitPrices(Map<String, BigDecimal> unitPrices);

		@Deprecated
		BigDecimal getUnitPrice();

		@Deprecated
		void setUnitPrice(BigDecimal unitPrice);

		@Deprecated
		BigDecimal getTotalPrice();

		@Deprecated
		void setTotalPrice(BigDecimal totalPrice);

		Map<String, String> getTitle();

		void setTitle(Map<String, String> title);

		@Deprecated
		String getTitle1();

		@Deprecated
		void setTitle1(String title1);

		@Deprecated
		String getTitle2();

		@Deprecated
		void setTitle2(String title2);

		@Deprecated
		String getTitle3();

		@Deprecated
		void setTitle3(String title3);

	}
	
	List<PacketItemInfo> getPacketItemInfos();

}
