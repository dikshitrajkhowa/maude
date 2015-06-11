package com.maudeinterface.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.maudeinterface.dao.PreLoaderDao;

@Component

public class PreLoader {
	
	@Autowired PreLoaderDao dao;
	
	public Map<String,String> getReportSourceCode()
	{
		return dao.getReportSourceCode();
	}
	
	public Map<String,String> getEventLocationCode()
	{
		return dao.getEventLocationCode();
	}
	
	public Map<String,String> getReporterOccptnCode()
	{
		return dao.getreporterOccptnCode();
	}
	
	public Map<String,String> getDeviceProdProb()
	{
		return dao.getDeviceProdProb();
	}
	
	public Map<String,String> getDeviceOperator()
	{
		return dao.getDeviceOperator();
	}
	
	public Map<String, String> getEventType() {
		return dao.getEventType();
		
	}
	
	public Map<String, String> getRemedialAction() {
		return dao.getRemedialAction();
		
	}
	
	public Map<String, String> getPatOutcome() {
		return dao.getPatOutcome();
		
	}

}
