package jeveson.actionprocessor.engine.core;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ActionLoader {
		
	/**
	 * getActionList - This method going to return the list actions to be executed
	 * @actionSetName - name of an action set  
	 * 
	 * @return action set
	 */
	public List<ActionInfo> getActionList(String actionSetName){
		
		/*
		 * Access some kind of repository to find an action set
		 * 
		 * Possible repositories: File, MongoDB, Oracle, ...
		 */
		
		ArrayList<ActionInfo> list = new ArrayList<ActionInfo>();
		
		if(actionSetName.equals("showServer")){
			list.add(new ActionInfo("serverListAction"));
		} else if(actionSetName.equals("showServices")){
			list.add(new ActionInfo("servicesListAction"));
			list.add(new ActionInfo("pieAction"));			
		}
		
		
		
		return list;
	}
}
