package com.ssh.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ModelDriven;
import com.ssh.entity.AP;
import com.ssh.service.APService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class APAction implements ModelDriven<AP>{

	private AP ap = new AP();
	@Override
	public AP getModel() {
		// TODO Auto-generated method stub
		return ap;
	}

	private APService apService;
	public void setApService(APService apService) {
		this.apService = apService;
	}
	
	//与ajax交互的数据
	private String oneAP;
    //从Action返回json数据给调用的Ajax，毕竟用用Ajax基本上要交互下嘛。
	public String getOneAP() {
		return oneAP;
	}
	public void setOneAP(String oneAP) {
		this.oneAP = oneAP;
	}
	
	private String allAP;	
	public String getAllAP() {
		return allAP;
	}
	public void setAllAP(String allAP) {
		this.allAP = allAP;
	}
	//查找某个AP
	public String search()
	{
//		String name = ap.getApName();
//		name = ServletActionContext.getRequest().getParameter("apName");
		if(ap!=null)
		{
			AP tmpAP = apService.search(ap);
			//bean对象改为json文件
			oneAP = JSONObject.fromObject(tmpAP).toString();
		}
		
		return "search";
	}
	
	//查找所有的AP
	public String searchAll()
	{
		List<String> jsons = new ArrayList<>();
		List<AP> lists = apService.searchAll();
		String str = "";
		for(AP tmp:lists)
		{
			jsons.add(JSONObject.fromObject(tmp).toString());
		}
		allAP = JSONArray.fromObject(jsons).toString();
//		allAP = allAP.substring(0, -1);
		System.out.println(allAP);
		return "searchAll";
	}
	
	//添加AP
	public String add()
	{
		apService.add(ap);
		List<String> jsons = new ArrayList<>();
		List<AP> lists = apService.searchAll();
		String str = "";
		for(AP tmp:lists)
		{
			jsons.add(JSONObject.fromObject(tmp).toString());
		}
		allAP = JSONArray.fromObject(jsons).toString();
		return "add";
	}
	
}
