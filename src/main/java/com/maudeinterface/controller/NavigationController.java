package com.maudeinterface.controller;

import java.io.IOException;
import java.io.InputStream;
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.eclipse.jetty.util.log.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.maudeinterface.model.FormData;
import com.maudeinterface.service.DataLoader;
import com.maudeinterface.service.PreLoader;

@Controller
public class NavigationController {

	static final Logger logger = Logger.getLogger(NavigationController.class);
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String searchForm(ModelMap model, Principal principal) {

		return "search";

	}
	
	@RequestMapping(value = "/searchData", method = RequestMethod.POST)
	public ModelAndView searchData(HttpServletRequest req,Principal principal) {

		HttpSession session = req.getSession();
		Map<String, Object> model = new HashMap<String, Object>();
		try {
			DataLoader loader = applicationContext.getBean(DataLoader.class);
			InputStream input = req.getInputStream();
			ObjectMapper mapper = new ObjectMapper();
			
			JsonNode node = mapper.readTree(input);
			FormData form = mapper.readValue(node.path("FormData").toString(),new TypeReference<FormData>() {});
			loader.setForm(form);
			
			logger.info(form.toString());
			model.put("event", "SUCCESS");
			model.put("result",loader.getData() );
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return new ModelAndView("jsonView", model);

	}

	
	@RequestMapping(value="/preLoadDataDevice.json", method=RequestMethod.GET)
	public ModelAndView getPreLoadDataDevice(HttpServletRequest req, Principal principal) throws Exception {
		Map<String, Object> model = new HashMap<String, Object>();
		PreLoader loader = applicationContext.getBean(PreLoader.class);
		try
		{	
			model.put("deviceProdProbCode",loader.getDeviceProdProb());
			model.put("deviceOperatorCode",loader.getDeviceOperator());
			model.put("event", "SUCCESS");
			
			logger.info("Data loaded successfully...");
			
		}
		catch(Exception e)
		{
			logger.info("Exception in preload :: "+e.getMessage());
		}
		
		return new ModelAndView("jsonView", model);
	}
	
	@RequestMapping(value="/preLoadDataPat.json", method=RequestMethod.GET)
	public ModelAndView getPreLoadDataPat(HttpServletRequest req, Principal principal) throws Exception {
		Map<String, Object> model = new HashMap<String, Object>();
		PreLoader loader = applicationContext.getBean(PreLoader.class);
		try
		{
			model.put("patOutComeCode",loader.getPatOutcome());
			model.put("event", "SUCCESS");
			
			logger.info("Data loaded successfully...");
		
		}
		catch(Exception e)
		{
			logger.info("Exception in preload :: "+e.getMessage());
		}
		
		return new ModelAndView("jsonView", model);
	}
	
	
	
	@RequestMapping(value="/preLoadData.json", method=RequestMethod.GET)
	public ModelAndView getPreLoadData(HttpServletRequest req, Principal principal) throws Exception {
		Map<String, Object> model = new HashMap<String, Object>();
		PreLoader loader = applicationContext.getBean(PreLoader.class);
		
		try
		{
			model.put("reportSourceCode", loader.getReportSourceCode());
			model.put("eventLocationCode", loader.getEventLocationCode());
			model.put("reporterOccptnCode", loader.getReporterOccptnCode());
			model.put("eventTypeCode", loader.getEventType());
			model.put("remedialActionCode",loader.getRemedialAction());
			
			model.put("event", "SUCCESS");
			
			logger.info("Data loaded successfully...");
			
		}
		catch(Exception e)
		{
			logger.info("Exception in preload :: "+e.getMessage());
		}
		return new ModelAndView("jsonView", model);
	}

}
