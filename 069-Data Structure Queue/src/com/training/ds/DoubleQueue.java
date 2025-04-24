package com.training.ds;

public class DoubleQueue {
	
	double[] arr;
	int index;
	int capacity;
	int front;

	public DoubleQueue(int qSize) throws Exception {
		if (qSize < 0) {
			Exception e = new Exception("Invalid queue size");
			throw e;
		}
		this.index = 0;
		this.front = 0;
		this.capacity = qSize;
		this.arr = new double[qSize];

	}

	public void enqueue(double x) throws Exception {
		// if queue is full
		if (index == capacity)

		{
			Exception e = new Exception("Queue is full");
			throw e;
		}
		arr[index] = x;
		index++;
	}

	public void dequeue() throws Exception {
		// if queue is empty
		if (index == 0) {
			Exception e = new Exception("Queue is empty");
			throw e;
		}

		// shift all elements to left
		for (int i = 1; i < index; i++) {
			arr[i - 1] = arr[i];
		}

		index--;
	}

	public double getFront() {
		// if queue is empty
		if (index == 0)
			return -1;
		return arr[front];
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
