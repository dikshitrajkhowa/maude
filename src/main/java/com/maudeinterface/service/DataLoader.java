package com.maudeinterface.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.maudeinterface.dao.SearchDao;
import com.maudeinterface.model.FormData;
import com.maudeinterface.model.Result;

@Component
public class DataLoader {
	
	private FormData form;
	@Autowired
	SearchDao dao;
	public List<Result> getData()
	{
		List<Result> result = new ArrayList<Result>();
		result=dao.getSearchData(form);

		return result;
	}

	public FormData getForm() {
		return form;
	}

	public void setForm(FormData form) {
		this.form = form;
	}

	
	
}

//result.add(new Result("ABC CORPORATION", "HEARTMATE II LVAS", "05/31/2015"));
//result.add(new Result("APPLIED MEDICAL",	"C6001, 5MMX33CM PROB/VALV DUAL BAG 12/BX",	"05/31/2015"));
//result.add(new Result("New Jenei CORPORATION", "HEARTMATE II LVAS", "05/31/2015"));
//result.add(new Result("Fortic MEDICAL",	"C6001, 5MMX33CM PROB/VALV DUAL BAG 12/BX",	"05/31/2015"));
//result.add(new Result("THORATEC CORPORATION", "HEARTMATE II LVAS", "05/31/2015"));
//result.add(new Result("3M MEDICAL",	"C6001, 5MMX33CM PROB/VALV DUAL BAG 12/BX",	"05/31/2015"));
//result.add(new Result("BlueDev CORPORATION", "HEARTMATE II LVAS", "05/31/2015"));
//result.add(new Result("New MEDICAL",	"C6001, 5MMX33CM PROB/VALV DUAL BAG 12/BX",	"05/31/2015"));
//