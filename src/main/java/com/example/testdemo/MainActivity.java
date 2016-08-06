package com.example.testdemo;

import roboguice.inject.InjectView;

import com.langk.base.activity.BaseActivity;
import com.langk.base.http.HttpManager;
import com.langk.base.http.respones.BaseAsyncHttpResponseHandler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

	@InjectView(R.id.test)
	TextView testView;
	
	
	@Override
	protected void initContentView() {
		// TODO Auto-generated method stub
		super.initContentView();
		setContentView(R.layout.activity_main);
	}
	@Override
	protected void initView() {
		// TODO Auto-generated method stub
		super.initView();
		testView.setText("dd");
		testView.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				TestRequest request = new TestRequest(MainActivity.this);
				HttpManager.post(MainActivity.this, request, handler);
			}
		});
	}
	@Override
	protected void initData() {
		// TODO Auto-generated method stub
		super.initData();
		TestRequest request = new TestRequest(this);
		HttpManager.post(this, request, handler);
	}
	
	BaseAsyncHttpResponseHandler<TestRespones> handler = new BaseAsyncHttpResponseHandler<TestRespones>(true){
		
		@Override
		public void onSuccessTrans(TestRespones responseModelVO) {
			super.onSuccessTrans(responseModelVO);
		};
		
		public void onFailureTrans(TestRespones responseModelVO) {
			
		};
		
		public void onPopUpHttpErrorDialogPre(String strTitle, String strCode, String strMsg) {
			
		};
		
		
	};
}
