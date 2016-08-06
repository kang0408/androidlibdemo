package com.example.testdemo;

import java.util.logging.LogManager;

import com.langk.base.application.BaseApplication;
import com.langk.base.db.DBConfig;
import com.langk.base.db.DBManager;

import android.content.Context;
import android.util.Log;

/******************************************************************************
 * Copyright (C) 2014 ZTE Co.,Ltd All Rights Reserved.
 * 本软件为中兴通讯股份有限公司�?��研制。未经本公司正式书面同意，其他任何个人�?团体 不得使用、复制�?修改或发布本软件.
 * cn.com.zte.android.teamshare.base.client.android.appdemo.base;
 * 
 * import cn.com.zte.android.app.application.BaseApplication; import
 * cn.com.zte.android.app.demo.R; import cn.com.zte.android.orm.DBManager;
 * import cn.com.zte.android.orm.config.DBConfig;
 * 
 * /** MyApplication. <br/>
 * 日期: 2014-5-20 上午10:51:32 <br/>
 * 
 * @author wangenzi
 * @version 1.0
 * @since JDK 1.6
 * @history 2014-5-20 wangenzi 新建
 */

public class MyApplication extends BaseApplication {
	
	/** 测试环境应用ID */
	public static final String appId = "A00237";
	
	/** 生产环境应用ID */
//	public static final String appId = "A00156";
	
	@Override
	public void onCreate() {
		super.onCreate();
	}

	public static MyApplication GetApp(){
		return ((MyApplication)MyApplication.getInstance());
	}
	
	
	@Override
	public void initDBManager() {
		Log.d("TAG", "initDBManager");
		DBConfig sharedDBConfig = new DBConfig(
				R.string.database_shared_db_name_suffix,
				R.integer.database_shared_db_version,
				R.array.database_shared_tables);

		DBConfig userScopeDBConfig = new DBConfig(
				R.string.database_user_scope_db_name_suffix,
				R.integer.database_user_scope_db_version,
				R.array.database_user_scope_tables);

		BaseApplication.getInstance().setDBManager(
				new DBManager(this, sharedDBConfig, userScopeDBConfig));

		// 初始化公共数据库操作组件
		BaseApplication.getInstance().getDBManager().initSharedDBHelper();
	}
	

}
