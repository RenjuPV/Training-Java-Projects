package com.training.ds;

import com.training.model.Circle;

public class CircleStack {
	
	Circle[] arr;
	int index = 0;

	public CircleStack(int size) {
		this.arr = new Circle[size];
	}

	public void push(Circle data) {
		this.arr[index] = data;
		index++;
	}

	public Circle pop() {
		--index;
		Circle r = this.arr[index];
		return r;
	}

	@Override
	public String toString() {
		String str = "[";
		for (int i = 0; i < index; i++) {
			if (i == index - 1)
				str = str + this.arr[i];
			else
				str = str + this.arr[i] + ",";
		}
		str = str + "]";
		return str;
	}


}
