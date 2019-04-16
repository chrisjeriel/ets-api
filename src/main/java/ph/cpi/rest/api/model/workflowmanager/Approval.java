package ph.cpi.rest.api.model.workflowmanager;

import org.apache.ibatis.type.Alias;

@Alias("WfmApproval")
public class Approval {
	private String referenceId;
	private String module;
	private String quotationNo;
	private String preparedBy;
	private String createDate;
	public String getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public String getQuotationNo() {
		return quotationNo;
	}
	public void setQuotationNo(String quotationNo) {
		this.quotationNo = quotationNo;
	}
	public String getPreparedBy() {
		return preparedBy;
	}
	public void setPreparedBy(String preparedBy) {
		this.preparedBy = preparedBy;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "Approvals [referenceId=" + referenceId + ", module=" + module + ", quotationNo=" + quotationNo
				+ ", preparedBy=" + preparedBy + ", createDate=" + createDate + "]";
	}
	
	
}
