package com.example.testdemo;

import java.util.List;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.langk.base.http.request.BaseHttpRequest;

/**
 *  HTTP请求处理类父类
 *  @author LangK
 *  */
public class AppHttpRequest extends BaseHttpRequest{

	@Expose(serialize=false,deserialize=false)
	private static final long serialVersionUID = -2746671583409220809L;
	
	
	protected AppHttpRequest(Context context) {
		super(HttpUtil.HTTPSSFLAG, HttpUtil.SERVERIP, HttpUtil.SERVERPORT);
		setWebServicePath(HttpUtil.TESTPATH);
		setCryptoConfigFileId(R.string.key);
		setCryptoFlag(true);
	}
	
	/** 用户登陆后的授权码Token，通过我们的解密程序获取用户的8位工号*/
	private String T;
	
	/** 语言参数2052中文1033英文*/
	private String L;

	/** 命令CommandName*/
	private String C;
	
	/** 分页提交参数对象*/
	private PageInput P;
	
	/** 其他参数，采用jsonString*/
	private String D;
	
	/** 用户账号*/
	private String U;
	
	/** 过滤对象数组*/
	private List<FilterInfo> F;

	/**  
	 * 获取用户登陆后的授权码Token，通过我们的解密程序获取用户的8位工号  
	 * @return t t  
	 */
	public String getT() {
		return T;
	}

	/**  
	 * 设置用户登陆后的授权码Token，通过我们的解密程序获取用户的8位工号  
	 * @param t t  
	 */
	public void setT(String t) {
		T = t;
	}

	/**  
	 * 获取语言参数2052中文、1033英文  
	 * @return l l  
	 */
	public String getL() {
		return L;
	}

	/**  
	 * 设置语言参数2052中文、1033英文  
	 * @param l l  
	 */
	public void setL(String l) {
		L = l;
	}

	/**  
	 * 获取命令CommandName  
	 * @return c c  
	 */
	public String getC() {
		return C;
	}

	/**  
	 * 设置命令CommandName  
	 * @param c c  
	 */
	public void setC(String c) {
		C = c;
	}

	/**  
	 * 获取分页提交参数对象  
	 * @return p p  
	 */
	public PageInput getP() {
		return P;
	}

	/**  
	 * 设置分页提交参数对象  
	 * @param p p  
	 */
	public void setP(PageInput p) {
		P = p;
	}

	/**  
	 * 获取其他参数，采用jsonString  
	 * @return d d  
	 */
	public String getD() {
		return D;
	}

	/**  
	 * 设置其他参数，采用jsonString  
	 * @param d d  
	 */
	public void setD(Object d) {
		try {
			if(d!=null){
				Gson gson = new Gson();
				setD(gson.toJson(d).toString());
			}else{
				setD("");
			}
		} catch (Exception e) {
			e.printStackTrace();
			setD("");
		}
		
	}

	/**  
	 * 获取用户信息对象  
	 * @return u u  
	 */
	public String getU() {
		return U;
	}

	/**  
	 * 设置用户信息对象  
	 * @param u u  
	 */
	public void setU(String u) {
		U = u;
	}

	/**
	 *设置d
	 * @param d the d to set
	 */
	public void setD(String d) {
		D = d;
	}

	/**
	 *取得过滤对象数组
	 * @return the f
	 */
	public List<FilterInfo> getF() {
		return F;
	}

	/**
	 *设置过滤对象数组
	 * @param f the f to set
	 */
	public void setF(List<FilterInfo> f) {
		F = f;
	}

	
	
	
}
