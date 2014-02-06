package com.ge.ae.diagnostics.service.cnr.http.response;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import com.ge.ae.diagnostics.service.cnr.data.api.models.Response;
import com.ge.ae.diagnostics.service.cnr.data.api.models.CnrDO;

@XmlRootElement(name="Response")
public class GetCnrsDataResponse extends Response{
	 private List<CnrDO> cnrAlerts;

	public List<CnrDO> getCnrAlerts() {
		return cnrAlerts;
	}

	public void setCnrAlerts(List<CnrDO> cnrAlerts) {
		this.cnrAlerts = cnrAlerts;
	}
	

}
