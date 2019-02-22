package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;


public class SaveQuoteEndorsementsRequest {

	private String quoteId;
	private String optionId;
	private List<Endorsementss> saveEndorsements;
	private List<Endorsementss> deleteEndorsements;
	public String getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	public String getOptionId() {
		return optionId;
	}
	public void setOptionId(String optionId) {
		this.optionId = optionId;
	}
	public List<Endorsementss> getSaveEndorsements() {
		return saveEndorsements;
	}
	public void setSaveEndorsements(List<Endorsementss> saveEndorsements) {
		this.saveEndorsements = saveEndorsements;
	}
	public List<Endorsementss> getDeleteEndorsements() {
		return deleteEndorsements;
	}
	public void setDeleteEndorsements(List<Endorsementss> deleteEndorsements) {
		this.deleteEndorsements = deleteEndorsements;
	}
	@Override
	public String toString() {
		return "SaveQuoteEndorsementsRequest [quoteId=" + quoteId + ", optionId=" + optionId + ", saveEndorsements="
				+ saveEndorsements + ", deleteEndorsements=" + deleteEndorsements + "]";
	}
	
}


class Endorsementss {
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
		return "Endorsements [endtCd=" + endtCd + ", remarks=" + remarks + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
	
}
