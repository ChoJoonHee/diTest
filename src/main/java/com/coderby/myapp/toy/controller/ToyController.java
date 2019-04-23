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
	
	//1. 생성자 기반 의존성 주입
	public ToyController(IBattery battery) {
		this.battery = battery;
	}
	
	//2. setter 기반 의존성 주입
//	public void setBattery(IBattery battery) {
//		this.battery = battery;
//	}
	
	public void playToy() {
		System.out.println("장난감을 가지고 놉니다.");
		battery.useBattery();
	}
}
