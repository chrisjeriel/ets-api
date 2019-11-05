package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;



public class SaveQuoteChangeQuoteStatusRequest {
	
	private String statusCd;
	private String reasonCd;
	private String user;
	private List<ChangeQuoteStatus> changeQuoteStatus;
	
	public List<ChangeQuoteStatus> getChangeQuoteStatus() {
		return changeQuoteStatus;
	}
	public void setChangeQuoteStatus(List<ChangeQuoteStatus> changeQuoteStatus) {
		this.changeQuoteStatus = changeQuoteStatus;
	}
	public String getStatusCd() {
		return statusCd;
	}
	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}
	public String getReasonCd() {
		return reasonCd;
	}
	public void setReasonCd(String reasonCd) {
		this.reasonCd = reasonCd;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		return "SaveQuoteChangeQuoteStatusRequest [statusCd=" + statusCd
				+ ", reasonCd=" + reasonCd + ", user=" + user
				+ ", changeQuoteStatus=" + changeQuoteStatus + "]";
	}

	
	
}


@Alias("SaveQuoteChangeQuoteStatus")
class ChangeQuoteStatus {
	private Integer quoteId ;
	
	public Integer getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}
	@Override
	public String toString() {
		return "ChangeQuoteStatus [quoteId=" + quoteId + "]";
	}
	
}


