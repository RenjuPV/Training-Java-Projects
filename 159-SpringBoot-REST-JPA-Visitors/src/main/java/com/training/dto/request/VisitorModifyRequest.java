package com.training.dto.request;

import com.training.model.Visitor;

public class VisitorModifyRequest {
	Visitor visitor;

	public Visitor getVisitor() {
		return visitor;
	}

	public void setVisitor(Visitor visitor) {
		this.visitor = visitor;
	}

	@Override
	public String toString() {
		return "VisitorModifyRequest [visitor=" + visitor + "]";
	}

}
