package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;



public class SaveQuoteChangeQuoteStatusRequest {
	
	private String statusCd;
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
	@Override
	public String toString() {
		return "SaveQuoteChangeQuoteStatusRequest [statusCd=" + statusCd + ", changeQuoteStatus=" + changeQuoteStatus
				+ "]";
	}
	
}


@Alias("SaveQuoteChangeQuoteStatus")
class ChangeQuoteStatus {
	private Integer quoteId ;
	private String reasonCd;
	
	public Integer getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}
	
	public String getReasonCd() {
		return reasonCd;
	}
	public void setReasonCd(String reasonCd) {
		this.reasonCd = reasonCd;
	}
	@Override
	public String toString() {
		return "ChangeQuoteStatus [quoteId=" + quoteId + ", reasonCd=" + reasonCd + "]";
	}
}


