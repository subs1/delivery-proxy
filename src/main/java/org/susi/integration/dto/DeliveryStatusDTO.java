package org.susi.integration.dto;

import com.google.gson.Gson;

public class DeliveryStatusDTO {
	
	String orderId;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return new Gson().toJson(this);
	}
	
	
	
}
