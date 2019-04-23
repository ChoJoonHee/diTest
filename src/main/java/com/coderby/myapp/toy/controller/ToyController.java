package com.coderby.myapp.toy.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.coderby.myapp.toy.service.IBattery;

@Controller
public class ToyController {
	@Resource(name="battery")
	IBattery battery;
	
	//1. ������ ��� ������ ����
	public ToyController(IBattery battery) {
		this.battery = battery;
	}
	
	//2. setter ��� ������ ����
//	public void setBattery(IBattery battery) {
//		this.battery = battery;
//	}
	
	public void playToy() {
		System.out.println("�峭���� ������ ��ϴ�.");
		battery.useBattery();
	}
}
