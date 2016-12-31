package com.bakerbeach.market.order.api.service;

import com.bakerbeach.market.commons.ServiceException;
import com.bakerbeach.market.core.api.model.Message;
import com.bakerbeach.market.core.api.model.Messages;

@SuppressWarnings("serial")
public class OrderServiceException extends ServiceException {

	public OrderServiceException() {
		super();
	}

	public OrderServiceException(Messages messages) {
		super(messages);
	}

	public OrderServiceException(String arg) {
		super(arg);
	}
	
	public OrderServiceException(Message message){
		super();
		messages.add(message);
	}

}
