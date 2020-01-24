package ph.cpi.rest.api.model.request;

import java.util.List;

public class PrintOrBatchRequest {
	private List<PrintBatchOr> printOrList;
	public List<PrintBatchOr> getPrintOrList() {
		return printOrList;
	}

	public void setPrintOrList(List<PrintBatchOr> printOrList) {
		this.printOrList = printOrList;
	}
	
	@Override
	public String toString() {
		return "PrintOrBatchRequest [printOrList=" + printOrList + "]";
	}	
}

class PrintBatchOr{
	private String tranId;
	private String orNo;
	private String updateUser;
	private String updateDate;
	
	public String getTranId() {
		return tranId;
	}
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}
	public String getOrNo() {
		return orNo;
	}
	public void setOrNo(String orNo) {
		this.orNo = orNo;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "printOr [tranId=" + tranId + ", orNo=" + orNo + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}

}
