package com.ebao.slite.service.rpc.modal;

import java.io.Serializable;

public class SampleModal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4567511992903969899L;
	
	private String userName;
	
	private String password;
	
	private String desc;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	@Override
	public String toString() {
		return "SampleModal[userName=" + userName + ", password=" + password + ", desc=" + desc + "]";
	}
}
