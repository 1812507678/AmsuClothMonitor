package com.amsu.clothmonitor.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONString;

import org.apache.struts2.ServletActionContext;

import push.Demo;

import com.amsu.clothmonitor.bean.Result;
import com.amsu.clothmonitor.bean.User;
import com.amsu.clothmonitor.dao.UserDao;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class UserInfoAction implements Action{
	
	private List<User> userList;  
	private String parm;  

	@Override
	public String execute() throws Exception {
		System.out.println("execute001");
		//UserDao userDao = new UserDao();
		userList = new ArrayList<User>();
		
		UserDao userDao = new UserDao();
		List<User> query = userDao.query();
		if (query!=null && query.size()>0) {
			System.out.println("query.size(): "+query.size());
			userList.addAll(query);
		}
		else {
			System.out.println("数据为空");
		}
		
		return SUCCESS;
	}
	
	public void addOnlineUser() {
		System.out.println("addOnlineUser");
		
		ActionContext context=ActionContext.getContext(); 
		HttpServletRequest request = (HttpServletRequest)context.get(ServletActionContext.HTTP_REQUEST); 
         
        String iconUrl=request.getParameter("iconUrl");   
        String username=request.getParameter("username");
        String onlinestate=request.getParameter("onlinestate");
        
        System.out.println("iconUrl："+iconUrl+",username:"+username+",onlinestate:"+onlinestate); 
        if (Integer.parseInt(onlinestate)==1) {
			//插入
        	UserDao userDao = new UserDao();
        	long addUser = userDao.addUser(new User(iconUrl, username));
        	Result result = new Result();
        	if (addUser>0) {
        		result.setRet(0);
        		result.setErrDesc(addUser+"");
    		}
        	else {
        		result.setRet(-1);
        		result.setErrDesc("add error");
    		}
        	writeResultJson(result,context);
		}
	}
	
	
	
	public void deleteOnlineUser() {
		System.out.println("deleteOnlineUser");
		
		ActionContext context=ActionContext.getContext(); 
		HttpServletRequest request = (HttpServletRequest)context.get(ServletActionContext.HTTP_REQUEST); 
         
        long id=Long.parseLong(request.getParameter("id"));   
        
        System.out.println("id："+id); 
        UserDao userDao = new UserDao();
    	long deleteUser = userDao.deleteUser(id);
    	
    	Result result = new Result();
    	
    	if (deleteUser>0) {
    		result.setRet(0);
    		result.setErrDesc("delete success");
		}
    	else {
    		result.setRet(-1);
    		result.setErrDesc("delete error");
		}
    	writeResultJson(result,context);
	}
	
	public void sendNotification() {
		System.out.println("sendNotification");
		String key  ="58d9cf4a717c19016700017c";
		String secret = "sogvc1qao2qohppcjtlwg0oxmwsd6rmz";
		Demo demo = new Demo(key, secret);
		try {
			demo.sendAndroidBroadcast();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void writeResultJson(Result result,ActionContext context) {
		HttpServletResponse response = (HttpServletResponse)context.get(ServletActionContext.HTTP_RESPONSE); 
		try {
			PrintWriter writer = response.getWriter();
			Gson gson = new Gson();
			String json2 = gson.toJson(result);
			writer.write(json2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	public List<User> getUserList() {
		return userList;
	}
	
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public String getParm() {
		return parm;
	}

	public void setParm(String parm) {
		this.parm = parm;
	} 
	
	
}
