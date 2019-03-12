package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveQuoteEndorsementsOcRequest {
	private String quoteIdOc;
	private List<EndorsementssOc> saveEndorsementsOc;
	private List<EndorsementssOc> deleteEndorsementsOc;
	public String getQuoteIdOc() {
		return quoteIdOc;
	}
	public void setQuoteIdOc(String quoteIdOc) {
		this.quoteIdOc = quoteIdOc;
	}
	public List<EndorsementssOc> getSaveEndorsementsOc() {
		return saveEndorsementsOc;
	}
	public void setSaveEndorsementsOc(List<EndorsementssOc> saveEndorsementsOc) {
		this.saveEndorsementsOc = saveEndorsementsOc;
	}
	public List<EndorsementssOc> getDeleteEndorsementsOc() {
		return deleteEndorsementsOc;
	}
	public void setDeleteEndorsementsOc(List<EndorsementssOc> deleteEndorsementsOc) {
		this.deleteEndorsementsOc = deleteEndorsementsOc;
	}
	@Override
	public String toString() {
		return "SaveQuoteEndorsementsOcRequest [quoteIdOc=" + quoteIdOc + ", saveEndorsementsOc=" + saveEndorsementsOc
				+ ", deleteEndorsementsOc=" + deleteEndorsementsOc + "]";
	}
	
}

class EndorsementssOc {
	private String endtCd;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;

	public String getEndtCd() {
		return endtCd;
	}
	public void setEndtCd(String endtCd) {
		this.endtCd = endtCd;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
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
		return "EndorsementssOc [endtCd=" + endtCd + ", remarks=" + remarks + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
	
}
