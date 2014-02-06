package com.ge.ae.diagnostics.service.cnr.data.api.models;

import java.util.List;

public class CnrRecommendationDO {
	String recDesc;
	String stepNumber;
	String cnrNumber;
	List<CnrFeedbackDO> cnrFeedbk;
	public String getRecDesc() {
		return recDesc;
	}
	public void setRecDesc(String recDesc) {
		this.recDesc = recDesc;
	}
	public String getStepNumber() {
		return stepNumber;
	}
	public void setStepNumber(String stepNumber) {
		this.stepNumber = stepNumber;
	}
	public String getCnrNumber() {
		return cnrNumber;
	}
	public void setCnrNumber(String cnrNumber) {
		this.cnrNumber = cnrNumber;
	}
	public List<CnrFeedbackDO> getCnrFeedbk() {
		return cnrFeedbk;
	}
	public void setCnrFeedbk(List<CnrFeedbackDO> cnrFeedbk) {
		this.cnrFeedbk = cnrFeedbk;
	}
	
	
	
}
