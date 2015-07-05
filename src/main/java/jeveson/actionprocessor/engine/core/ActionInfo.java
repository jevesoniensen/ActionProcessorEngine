package jeveson.actionprocessor.engine.core;

public class ActionInfo {
	
	private String name = null;
	
	
	public ActionInfo(){
		super();
	}
	
	public ActionInfo(String name){
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}
