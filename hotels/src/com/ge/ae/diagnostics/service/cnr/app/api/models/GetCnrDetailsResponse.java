package com.ge.ae.diagnostics.service.cnr.app.api.models;

import javax.xml.bind.annotation.XmlRootElement;
import com.ge.ae.diagnostics.service.cnr.data.api.models.CnrDO;
import com.ge.ae.diagnostics.service.cnr.data.api.models.Response;
@XmlRootElement(name="Response")
public class GetCnrDetailsResponse extends Response{
	private CnrDO cnrDo;

	public CnrDO getCnrDo() {
		return cnrDo;
	}

	public void setCnrDo(CnrDO cnrDo) {
		this.cnrDo = cnrDo;
	}
	

}
