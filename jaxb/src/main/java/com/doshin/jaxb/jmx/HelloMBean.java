package com.doshin.jaxb.jmx;

public interface HelloMBean {
	public void setMessage(String message);

	public String getMessage();

	public void sayHello();
}