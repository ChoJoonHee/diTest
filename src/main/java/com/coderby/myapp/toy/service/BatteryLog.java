package com.coderby.myapp.toy.service;

import java.util.Random;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
@Resource(name="BatteryLog")
public class BatteryLog {
	
	public void checkBattery() {
		System.out.println((int)Math.random() * 99 + 1 + "% 남았습니다.");
	}

}
