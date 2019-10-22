package ru.basicspring.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Something {
	
	private InnerSomething inner;
	
	@Autowired
	public Something(InnerSomething inner) {
		this.inner = inner;
	}
	
	public String getWhatInside() {
		return inner.getHiddenMessage();
	}
}
