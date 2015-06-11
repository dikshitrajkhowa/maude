package com.maudeinterface.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.maudeinterface.controller.NavigationController;
import com.maudeinterface.model.FormData;
import com.maudeinterface.model.Report;
import com.maudeinterface.model.Result;
import com.maudeinterface.service.Utils;

@Component
public class SearchDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	static final Logger logger = Logger.getLogger(SearchDao.class);
	
	public List<Result> getSearchData(FormData params) {
		
		StringBuffer reportQry = new StringBuffer("SELECT A.Manufacturer_Name,B.Brand_Name,A.Date_Received FROM mdrfoi A LEFT JOIN device B ON A.Mdr_Report_Key=B.Mdr_Report_Key  ");
		
		List<Result> result =new ArrayList<Result>();
		
		if(Report.checkFields(params.getReport()))
		{
			reportQry.append(" WHERE ");
			int whereCount=0;
			
			if(validParam(params.getReport().getRprtNumber())  )
			{
				reportQry.append(" A.Report_Number = '"+params.getReport().getRprtNumber()+"'");//2953189-2013-00003
				whereCount++;
			}
			
			//only from date
			if(validParam(params.getReport().getDateRcvdFrm()) && (!validParam(params.getReport().getDateRcvdFrm())) )
			{
								
				if(whereCount > 0){
					reportQry.append(" OR A.Date_Received = '"+params.getReport().getDateRcvdFrm()+"'");
				}else
					reportQry.append(" A.Date_Received = '"+params.getReport().getDateRcvdFrm()+"'");
					whereCount++;
								
			}
			
			//both form and to date
			if (validParam(params.getReport().getDateRcvdFrm())&& (validParam(params.getReport().getDateRcvdTo()))) {
				
				java.sql.Date sqlStartDate = Utils.getSqlDataFrmString(params.getReport().getDateRcvdFrm(), "MM/dd/yyyy");
				java.sql.Date sqlEndDate = Utils.getSqlDataFrmString(params.getReport().getDateRcvdTo(), "MM/dd/yyyy");
				
				if(whereCount > 0){
					reportQry.append(" OR STR_TO_DATE(A.Date_Received,'%m/%d/%Y')  BETWEEN '"+ sqlStartDate + "' AND '" + sqlEndDate+"'");
				}else
				{
					reportQry.append(" STR_TO_DATE(A.Date_Received,'%m/%d/%Y')  BETWEEN '"+ sqlStartDate + "' AND '" + sqlEndDate+"'");
				}
				
				
				whereCount++;
			}
			
			//Report source Code
			if(validParam(params.getReport().getRprtSrcCode()))
			{
								
				if(whereCount > 0){
					reportQry.append(" OR A.Report_Source_Code = '"+params.getReport().getRprtSrcCode()+"'");
				}else
					reportQry.append(" A.Report_Source_Code = '"+params.getReport().getRprtSrcCode()+"'");
					whereCount++;
								
			}
			
			//Event Type
			if(validParam(params.getReport().getEvntType()))
			{
								
				if(whereCount > 0){
					reportQry.append(" OR A.Event_Type = '"+params.getReport().getEvntType()+"'");
				}else
					reportQry.append(" A.Event_Type = '"+params.getReport().getEvntType()+"'");
					whereCount++;
								
			}
			
			----
			
			logger.info("Report Qry :: "+reportQry.toString());
			
			
			List<Map<String, Object>> reportOutput = jdbcTemplate.queryForList(reportQry.toString());
			
			for (Map<String, Object> row : reportOutput) {
				Result res = new Result();
				res.setManufacturer((String)(row.get("Manufacturer_Name")));
				res.setBrandName((String)(row.get("Brand_Name")));
				res.setDateRcvd((String)(row.get("Date_Received")));
				
				result.add(res);
			}
			
			
		 	
		}
		
				
		return result;
				

	}

	private boolean validParam(String param) {
		if(param!=null && (param.trim().length() > 0))
		{
			return true;
		}
		return false;
	}

}
