package com.coderby.myapp.toy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class DuraBattery implements IBattery {
	@Override
	@Autowired
	public void useBattery() {
		System.out.println("�䳢�� �����ϴ� ������");
	}
}
