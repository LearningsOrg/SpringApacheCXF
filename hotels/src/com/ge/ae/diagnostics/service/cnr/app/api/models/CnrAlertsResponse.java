package com.ge.ae.diagnostics.service.cnr.app.api.models;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.ge.ae.diagnostics.service.cnr.data.api.models.CnrDO;
import com.ge.ae.diagnostics.service.cnr.data.api.models.Response;


@XmlRootElement(name="Response")
public class CnrAlertsResponse extends Response{
	 private List<CnrDO> cnrAlerts;
	 private int cnrCount;
	 
	public List<CnrDO> getCnrAlerts() {
		return cnrAlerts;
	}
	public void setCnrAlerts(List<CnrDO> cnrAlerts) {
		this.cnrAlerts = cnrAlerts;
	}
	public int getCnrCount() {
		return cnrCount;
	}
	public void setCnrCount(int cnrCount) {
		this.cnrCount = cnrCount;
	}

	 
}
