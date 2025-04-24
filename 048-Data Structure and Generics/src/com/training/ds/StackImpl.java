package com.training.ds;

import com.training.exceptions.InvalidStackSizeException;
import com.training.exceptions.StackEmptyException;
import com.training.exceptions.StackIsFullException;

public class StackImpl<T>implements Stack<T> {
	
	Object[] arr;
	int index = 0;

	public StackImpl(int size) throws Exception {
		if(size<0) {
			Exception e=new InvalidStackSizeException("Stack size can not be negative");
			throw e;
		}
		this.arr = new Object[size];
	}

	public void push(T data) throws Exception {
		
		if(index==arr.length) {
			Exception e=new StackIsFullException("Stack already full");
			throw e;
		}
		this.arr[index] = data;
		index++;
	}

	public T pop() throws Exception {
		if(index==0) {
			Exception e=new StackEmptyException("Stack has no elements..nothing to pop");
			throw e;
		}
		--index;
		T r = (T)this.arr[index];
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
