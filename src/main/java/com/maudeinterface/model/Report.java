package com.maudeinterface.model;

public class Report {
	private String rprtNumber;
	private String dateRcvdFrm;
	private String dateRcvdTo;
	private String rprtSrcCode;
	private String evntType;
	private String evntLocation;
	private String rprtrOcptnCode;
	private String remedialAction;
	private String allWords;
	private String noneWords;

	public static boolean checkFields(Report report)
	{
		StringBuffer all = new StringBuffer(report.rprtNumber).append(report.dateRcvdFrm).append(report.dateRcvdTo).append(report.rprtSrcCode).append(report.evntType)
				.append(report.evntLocation).append(report.rprtrOcptnCode).append(report.remedialAction).append(report.allWords).append(report.noneWords);
		
		if(!(all.toString().trim().equals("-1-1-1-1-1")) && (all.toString().trim().length() > 0))
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public String getRprtNumber() {
		return rprtNumber;
	}

	public void setRprtNumber(String rprtNumber) {
		this.rprtNumber = rprtNumber;
	}

	public String getDateRcvdFrm() {
		return dateRcvdFrm;
	}

	public void setDateRcvdFrm(String dateRcvdFrm) {
		this.dateRcvdFrm = dateRcvdFrm;
	}

	public String getDateRcvdTo() {
		return dateRcvdTo;
	}

	public void setDateRcvdTo(String dateRcvdTo) {
		this.dateRcvdTo = dateRcvdTo;
	}

	public String getRprtSrcCode() {
		return rprtSrcCode;
	}

	public void setRprtSrcCode(String rprtSrcCode) {
		this.rprtSrcCode = rprtSrcCode;
	}

	public String getEvntType() {
		return evntType;
	}

	public void setEvntType(String evntType) {
		this.evntType = evntType;
	}

	public String getEvntLocation() {
		return evntLocation;
	}

	public void setEvntLocation(String evntLocation) {
		this.evntLocation = evntLocation;
	}

	public String getRprtrOcptnCode() {
		return rprtrOcptnCode;
	}

	public void setRprtrOcptnCode(String rprtrOcptnCode) {
		this.rprtrOcptnCode = rprtrOcptnCode;
	}

	public String getRemedialAction() {
		return remedialAction;
	}

	public void setRemedialAction(String remedialAction) {
		this.remedialAction = remedialAction;
	}

	public String getAllWords() {
		return allWords;
	}

	public void setAllWords(String allWords) {
		this.allWords = allWords;
	}

	public String getNoneWords() {
		return noneWords;
	}

	public void setNoneWords(String noneWords) {
		this.noneWords = noneWords;
	}

}
