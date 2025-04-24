package com.training.dto.response;

import java.util.List;

import com.training.model.Visitor;

public class VisitorsShowAllByCityResponse {
	int statusCode;
	String description;
	List<Visitor> visitors;
	
	
	public int getStatusCode() {
		return statusCode;
	}


	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public List<Visitor> getVisitors() {
		return visitors;
	}


	public void setVisitors(List<Visitor> visitors) {
		this.visitors = visitors;
	}


	@Override
	public String toString() {
		return "VisitorShowAllResponse [statusCode=" + statusCode + ", description=" + description + ", visitors="
				+ visitors + "]";
	}

}
