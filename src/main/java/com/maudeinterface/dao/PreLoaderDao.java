package com.maudeinterface.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class PreLoaderDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	public Map<String, String> getEventType() {
		String sql = "SELECT * FROM event_type_master";
		return getCodeMap(sql, "code", "description");
		
	}
	
	public Map<String, String> getRemedialAction() {
		String sql = "SELECT * FROM remedial_action_master";
		return getCodeMap(sql, "code", "description");
		
	}
	
	public Map<String, String> getPatOutcome() {
		String sql = "SELECT * FROM patient_outcome_master";
		return getCodeMap(sql, "code", "description");
		
	}
	
	public Map<String, String> getDeviceOperator() {
		String sql = "SELECT * FROM device_operator_code_master";
		
		return getCodeMap(sql, "Device_Operator_Code_Key", "Description");

	}

	
	public Map<String, String> getDeviceProdProb() {

		String sql = "SELECT * FROM device_problem_codes";
		return getCodeMap(sql, "device_problem_code", "description");
	
	}
	
	
	public Map<String, String> getreporterOccptnCode() {
		
		String sql = "SELECT * FROM reporter_occupation_code_master;";
		return getCodeMap(sql, "Reporter_Occupation_Code", "Description");
		
	}
	
	
	public Map<String, String> getEventLocationCode() {
		String sql = "SELECT * FROM event_location_code";
		return getCodeMap(sql, "event_location_code", "description");
		
	}
	
	public Map<String, String> getReportSourceCode() {
		String sql = "SELECT * FROM report_source_code_master";
		return getCodeMap(sql, "Report_Source_Code", "Description");
		
	}
	
	private Map<String,String>  getCodeMap(String sql,final String key,final String val)
	{
		List<Map<String, String>> codeList = new  ArrayList<Map<String,String>>();
		Map<String,String> dataMap = new LinkedHashMap<String, String>();
		
		codeList=jdbcTemplate.query(sql, new RowMapper<Map<String, String>>(){

			@Override
			public Map<String, String> mapRow(ResultSet rs, int rowNum)throws SQLException {
				Map<String, String> codeMap = new HashMap<String, String>();
				codeMap.put(rs.getString(key),rs.getString(val));
								
				return codeMap;
			}
			
		});
		
		for(Map<String,String> rec:codeList)
		{
			dataMap.putAll(rec);
		}
		
		
		return dataMap;
	}
	

}
