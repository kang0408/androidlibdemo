package com.example.testdemo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.langk.base.db.BasePO;

@DatabaseTable(tableName="test")
public class TestEntity extends BasePO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3949411732976599861L;

	@DatabaseField(columnName="id",id=true)
	private String id;
	
	@DatabaseField(columnName="name",index=true)
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
