package com.ge.ae.diagnostics.service.cnr.data.api.models;

import java.util.List;

public class CnrDO{
	String cnrNumber;
	String cnrPriority;
	String cnrStatus;
	String issueDate;
	String analysis;
	String observation;
	String shiftStartDate; 
	String shiftEndDate;
	String additionalFeedbk;
	String additionalAOCFeedbk;
	String lastCruiseDate;
	String lastTakeoffDate;
	String isCNRSuccess;
	String isCNRDelayed;
	String actualRootCause;
	String fbAOCCnrSuccess;
	String exceedanceDescription;
	String aocActualRootCause;
	String ackBy;
	String ackDate;
	String logicalDelInd;
	String creationDate;
	String lastUpdatedDate;	
	String prcName;
	List<CnrRecommendationDO> cnrRecommendation;
	List<CnrParametersDO> cnrParameters;
	List<EngineVO> engine;
	AircraftVO aircraft;
	public String getCnrNumber() {
		return cnrNumber;
	}
	public void setCnrNumber(String cnrNumber) {
		this.cnrNumber = cnrNumber;
	}
	public String getCnrPriority() {
		return cnrPriority;
	}
	public void setCnrPriority(String cnrPriority) {
		this.cnrPriority = cnrPriority;
	}
	public String getCnrStatus() {
		return cnrStatus;
	}
	public void setCnrStatus(String cnrStatus) {
		this.cnrStatus = cnrStatus;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getAnalysis() {
		return analysis;
	}
	public void setAnalysis(String analysis) {
		this.analysis = analysis;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	public String getShiftStartDate() {
		return shiftStartDate;
	}
	public void setShiftStartDate(String shiftStartDate) {
		this.shiftStartDate = shiftStartDate;
	}
	public String getShiftEndDate() {
		return shiftEndDate;
	}
	public void setShiftEndDate(String shiftEndDate) {
		this.shiftEndDate = shiftEndDate;
	}
	public String getAdditionalFeedbk() {
		return additionalFeedbk;
	}
	public void setAdditionalFeedbk(String additionalFeedbk) {
		this.additionalFeedbk = additionalFeedbk;
	}
	public String getAdditionalAOCFeedbk() {
		return additionalAOCFeedbk;
	}
	public void setAdditionalAOCFeedbk(String additionalAOCFeedbk) {
		this.additionalAOCFeedbk = additionalAOCFeedbk;
	}
	public String getLastCruiseDate() {
		return lastCruiseDate;
	}
	public void setLastCruiseDate(String lastCruiseDate) {
		this.lastCruiseDate = lastCruiseDate;
	}
	public String getLastTakeoffDate() {
		return lastTakeoffDate;
	}
	public void setLastTakeoffDate(String lastTakeoffDate) {
		this.lastTakeoffDate = lastTakeoffDate;
	}
	public String getIsCNRSuccess() {
		return isCNRSuccess;
	}
	public void setIsCNRSuccess(String isCNRSuccess) {
		this.isCNRSuccess = isCNRSuccess;
	}
	public String getIsCNRDelayed() {
		return isCNRDelayed;
	}
	public void setIsCNRDelayed(String isCNRDelayed) {
		this.isCNRDelayed = isCNRDelayed;
	}
	public String getActualRootCause() {
		return actualRootCause;
	}
	public void setActualRootCause(String actualRootCause) {
		this.actualRootCause = actualRootCause;
	}
	public String getFbAOCCnrSuccess() {
		return fbAOCCnrSuccess;
	}
	public void setFbAOCCnrSuccess(String fbAOCCnrSuccess) {
		this.fbAOCCnrSuccess = fbAOCCnrSuccess;
	}
	public String getExceedanceDescription() {
		return exceedanceDescription;
	}
	public void setExceedanceDescription(String exceedanceDescription) {
		this.exceedanceDescription = exceedanceDescription;
	}
	public String getAocActualRootCause() {
		return aocActualRootCause;
	}
	public void setAocActualRootCause(String aocActualRootCause) {
		this.aocActualRootCause = aocActualRootCause;
	}
	public String getAckBy() {
		return ackBy;
	}
	public void setAckBy(String ackBy) {
		this.ackBy = ackBy;
	}
	public String getAckDate() {
		return ackDate;
	}
	public void setAckDate(String ackDate) {
		this.ackDate = ackDate;
	}
	public String getLogicalDelInd() {
		return logicalDelInd;
	}
	public void setLogicalDelInd(String logicalDelInd) {
		this.logicalDelInd = logicalDelInd;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(String lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	public String getPrcName() {
		return prcName;
	}
	public void setPrcName(String prcName) {
		this.prcName = prcName;
	}
	public List<CnrRecommendationDO> getCnrRecommendation() {
		return cnrRecommendation;
	}
	public void setCnrRecommendation(List<CnrRecommendationDO> cnrRecommendation) {
		this.cnrRecommendation = cnrRecommendation;
	}
	public List<CnrParametersDO> getCnrParameters() {
		return cnrParameters;
	}
	public void setCnrParameters(List<CnrParametersDO> cnrParameters) {
		this.cnrParameters = cnrParameters;
	}
	public List<EngineVO> getEngine() {
		return engine;
	}
	public void setEngine(List<EngineVO> engine) {
		this.engine = engine;
	}
	public AircraftVO getAircraft() {
		return aircraft;
	}
	public void setAircraft(AircraftVO aircraft) {
		this.aircraft = aircraft;
	}
	
		
	}
