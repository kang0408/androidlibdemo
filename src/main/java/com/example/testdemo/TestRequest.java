package com.example.testdemo;

import android.content.Context;


public class TestRequest extends AppHttpRequest {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8704435370298039485L;

	protected TestRequest(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		setWebServiceMethod(HttpUtil.TESTMETHOD);
		setC(HttpUtil.TESTC);
	}



}
