package com.ebao.slite.service.rpc.impl;

import com.ebao.slite.service.rpc.SampleService;
import com.ebao.slite.service.rpc.modal.SampleModal;


public class SampleServiceImpl implements SampleService {

	public SampleModal say() {
    	SampleModal modal = new SampleModal();
    	modal.setUserName("daniel.zhao");
    	modal.setPassword("password");
    	modal.setDesc("this is test data!");
    	System.out.println(modal);
        return modal;
    }
}
