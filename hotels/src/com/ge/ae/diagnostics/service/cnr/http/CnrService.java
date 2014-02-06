package com.ge.ae.diagnostics.service.cnr.http;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

import com.ge.ae.diagnostics.service.cnr.app.api.ICnrService;
import com.ge.ae.diagnostics.service.cnr.app.api.models.CnrAlertsResponse;
import com.ge.ae.diagnostics.service.cnr.app.api.models.GetCnrDetailsResponse;
import com.ge.ae.diagnostics.service.cnr.data.api.ICnrData;
import com.ge.ae.diagnostics.service.cnr.data.api.models.CnrDO;
import com.ge.ae.diagnostics.service.cnr.http.response.GetCnrsDataResponse;

public class CnrService {
	ICnrService iCnrService;
	ICnrData iCnrData;
	

	public ICnrService getiCnrService() {
		return iCnrService;
	}

	public void setiCnrService(ICnrService iCnrService) {
		this.iCnrService = iCnrService;
	}
	
	public ICnrData getiCnrData() {
		return iCnrData;
	}

	public void setiCnrData(ICnrData iCnrData) {
		this.iCnrData = iCnrData;
	}

	@POST
	@Path("/service/cnr/getCnrs")
	@Produces({ "application/json", "application/xml" })
	public GetCnrsDataResponse getCnrsSrvc(@FormParam("start") int start,
			@FormParam("count") int count,
			@FormParam("cnrStatus") String cnrStatus,
			@FormParam("priority") String priority,
			@FormParam("esn") String esn, @FormParam("deleted") String deleted,
			@Context HttpServletRequest request ) {
		System.out.println("getCnrs Data Service called");
		GetCnrsDataResponse response = new GetCnrsDataResponse();
		String sso = request.getHeader("sm_ssoid");
		if (sso != null && !sso.equalsIgnoreCase("")) {
			List<CnrDO> cnrLst = null;
			try {
				cnrLst = iCnrData.getCnrs(start, count, cnrStatus, priority,
						esn, deleted);
			} catch (Exception e) {
				response.setSuccess("Failed");
				response.setError("Exception Occured");
				return response;
			}

			response.setCnrAlerts(cnrLst);
			response.setSuccess("Success");
			response.setError("");
			return response;
		}else{
			response.setSuccess("Failed");
			response.setError("No Valid SSO Input to Service");
			return response;
		}
	}

	@POST
	@Path("/service/cnrApp/getCnrs")
	@Produces({ "application/json", "application/xml" })
	public CnrAlertsResponse getCNRsAppSrvc(@FormParam("start") int start,
			@FormParam("count") int count,
			@FormParam("cnrStatus") String cnrStatus,
			@FormParam("priority") String priority,
			@FormParam("esn") String esn, @FormParam("deleted") String deleted, @Context HttpServletRequest request ) {
		String sso = request.getHeader("sm_ssoid");
		System.out.println("getCnrs Application Service called");
		if (sso != null && !sso.equalsIgnoreCase("")) {
			return iCnrService.getCnrs(sso,start,count, cnrStatus,priority, esn, deleted);
		}else{
			CnrAlertsResponse response = new CnrAlertsResponse();
			response.setSuccess("Failed");
			response.setError("No Valid SSO Input to Service");
			return response;
		}
		
		
	}
	
	@POST
	@Path("/service/cnr/getCNRDetail")
	@Produces({ "application/json", "application/xml" })
	public GetCnrDetailsResponse getCnrDetails(@FormParam("cnrNumber") String cnrNumber,@Context HttpServletRequest request) {
		System.out.println("getCNRDetail Data Service called");
		GetCnrDetailsResponse cnrResp =null;
		String sso = request.getHeader("sm_ssoid");
		if (sso != null && !sso.equalsIgnoreCase("")) {
			System.out.println("Inside end point");
		cnrResp = iCnrService.getCnrDetails(cnrNumber, sso);
		 
		}
		return cnrResp;
	}

	/*
	 * public ICnrData getiCnrData() { return iCnrData; }
	 * 
	 * public void setiCnrData(ICnrData iCnrData) { this.iCnrData = iCnrData; }
	 */
	/*
	 * @POST
	 * 
	 * @Path("/service/cnrApp/loadCNRWidgetAppSrvc")
	 * 
	 * @Produces({ "application/json", "application/xml" }) public Response
	 * loadCNRWidgetAppSrvc(@FormParam("SSO") String SSO,
	 * 
	 * @FormParam("APP") String APP,
	 * 
	 * @FormParam("PortalESNListing") String PortalESNListing) {
	 * 
	 * return iCnrService.loadCNRWidgetAppSrvc(SSO, APP, PortalESNListing); }
	 * 
	 * @POST
	 * 
	 * @Path("/service/cnrApp/getCNRsAppSrvc")
	 * 
	 * @Produces({ "application/json", "application/xml" }) public Response
	 * getCNRsAppSrvc(@FormParam("age") int age,
	 * 
	 * @FormParam("cnrStatus") String cnrStatus,
	 * 
	 * @FormParam("esn") String esn, @FormParam("sso") String sso) {
	 * 
	 * return iCnrService.getCNRsAppSrvc(age, cnrStatus, esn, sso); }
	 * 
	 * @POST
	 * 
	 * @Path("/service/cnr/getCNRs")
	 * 
	 * @Produces({ "application/json", "application/xml" }) public
	 * com.ge.ae.diagnostics.service.cnr.data.api.models.Response getCNRs(
	 * 
	 * @FormParam("startDt") Date startDt, @FormParam("endDt") Date endDt,
	 * 
	 * @FormParam("cnrStatus") String cnrStatus,
	 * 
	 * @FormParam("esn") String esn, @FormParam("deleted") String deleted) {
	 * 
	 * return iCnrData.getCNRs(startDt, endDt, cnrStatus, esn, deleted); }
	 * 
	 * @POST
	 * 
	 * @Path("/service/cnrApp/getCNRDetailAppSrvc")
	 * 
	 * @Produces({ "application/json", "application/xml" }) public Response
	 * getCNRDetailAppSrvc(
	 * 
	 * @FormParam("cnrNumber") String cnrNumber,
	 * 
	 * @FormParam("sso") String sso) {
	 * 
	 * return iCnrService.getCNRDetailAppSrvc(cnrNumber, sso); }
	 * 
	 * @POST
	 * 
	 * @Path("/service/cnr/getCNRDetail")
	 * 
	 * @Produces({ "application/json", "application/xml" }) public CnrDetail
	 * getCNRDetail(@FormParam("cnrNumber") String cnrNumber,
	 * 
	 * @FormParam("sso") String sso) {
	 * 
	 * return iCnrData.getCNRDetail(cnrNumber, sso); }
	 * 
	 * @POST
	 * 
	 * @Path("/service/cnr/getFeedbackDetails")
	 * 
	 * @Produces({ "application/json", "application/xml" }) public Response
	 * getFeedbackDetails(@FormParam("cnrNumber") String cnrNumber) {
	 * 
	 * return iCnrService.getFeedbackDetails(cnrNumber); }
	 * 
	 * @POST
	 * 
	 * @Path("/service/cnr/createCNRRecommendation")
	 * 
	 * @Produces({ "application/json", "application/xml" }) public Response
	 * createCNRRecommendation(
	 * 
	 * @FormParam("cnrNumber") String cnrNumber,
	 * 
	 * @FormParam("recommendation") Date recommendation,
	 * 
	 * @FormParam("mxStatusCode") Date mxStatusCode,
	 * 
	 * @FormParam("mxDate") Date mxDate,
	 * 
	 * @FormParam("remarks") String remarks,
	 * 
	 * @FormParam("isEffective") String isEffective) {
	 * 
	 * return iCnrService.createCNRRecommendation(cnrNumber, recommendation,
	 * mxStatusCode, mxDate, remarks, isEffective); }
	 * 
	 * @POST
	 * 
	 * @Path("/service/cnr/deleteCNRRec")
	 * 
	 * @Produces({ "application/json", "application/xml" }) public Response
	 * deleteCNRRec(@FormParam("cnrNumber") String cnrNumber,
	 * 
	 * @FormParam("stepNumber") String stepNumber) {
	 * 
	 * return iCnrService.deleteCNRRec(cnrNumber, stepNumber); }
	 * 
	 * @POST
	 * 
	 * @Path("/service/cnr/updateCNRFeedback")
	 * 
	 * @Produces({ "application/json", "application/xml" }) public Response
	 * updateCNRFeedback(@FormParam("cnrNumber") String cnrNumber,
	 * 
	 * @FormParam("engineId") String engineId,
	 * 
	 * @FormParam("stepNumber") String stepNumber,
	 * 
	 * @FormParam("mxStatusCode") String mxStatusCode,
	 * 
	 * @FormParam("date") Date date, @FormParam("remarks") String remarks,
	 * 
	 * @FormParam("isEffective") String isEffective,
	 * 
	 * @FormParam("recommendation") String recommendation) {
	 * 
	 * return iCnrService.updateCNRFeedback(cnrNumber, engineId, stepNumber,
	 * mxStatusCode, date, remarks, isEffective, recommendation); }
	 * 
	 * @POST
	 * 
	 * @Path("/service/cnr/routeCNRtoAOC")
	 * 
	 * @Produces({ "application/json", "application/xml" }) public Response
	 * routeCNRtoAOC(@FormParam("cnrNumber") String cnrNumber,
	 * 
	 * @FormParam("actualRCCode") String actualRCCode,
	 * 
	 * @FormParam("isCNRSuccess") String isCNRSuccess,
	 * 
	 * @FormParam("isCNRDelayed") String isCNRDelayed,
	 * 
	 * @FormParam("addlFeedback") String addlFeedback) {
	 * 
	 * return iCnrService.routeCNRtoAOC(cnrNumber, actualRCCode, isCNRSuccess,
	 * isCNRDelayed, addlFeedback); }
	 * 
	 * @POST
	 * 
	 * @Path("/service/cnr/getClosureDetails")
	 * 
	 * @Produces({ "application/json", "application/xml" }) public Response
	 * getClosureDetails(@FormParam("cnrNumber") String cnrNumber) {
	 * 
	 * return iCnrService.getClosureDetails(cnrNumber); }
	 * 
	 * @POST
	 * 
	 * @Path("/service/cnr/sendCNRTextNotif")
	 * 
	 * @Produces({ "application/json", "application/xml" }) public Response
	 * sendCNRTextNotif(@FormParam("cnrNumber") String cnrNumber,
	 * 
	 * @FormParam("msgTemplate") String msgTemplate) {
	 * 
	 * return iCnrService.sendCNRTextNotif(cnrNumber, msgTemplate); }
	 * 
	 * @GET
	 * 
	 * @Path("/myeCustomerEsn")
	 * 
	 * @Produces({ "application/json", "application/xml" }) public
	 * MyeCustomerEsn getMyeCustomer(
	 * 
	 * @FormParam("custSeqId") String custSeqId,
	 * 
	 * @FormParam("esn") String esn) { System.out
	 * .println("----invoking JAX-RS getMyeCustomer, Customer id is: " +
	 * custSeqId); return iCnrService.getMyeCustomer(custSeqId, esn); }
	 */
}
