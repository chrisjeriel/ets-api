package ph.cpi.rest.api.model.response;

import org.joda.time.DateTime;

public class RetrievePolInstTagAcctDateResponse {
	private String instTag;
	private DateTime acctDate;
	public String getInstTag() {
		return instTag;
	}
	public void setInstTag(String instTag) {
		this.instTag = instTag;
	}
	public DateTime getAcctDate() {
		return acctDate;
	}
	public void setAcctDate(DateTime acctDate) {
		this.acctDate = acctDate;
	}
	@Override
	public String toString() {
		return "RetrievePolInstTagAcctDateResponse [instTag=" + instTag + ", acctDate=" + acctDate + "]";
	}
	
}
