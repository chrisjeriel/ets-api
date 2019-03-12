package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveQuoteEndorsementsOcRequest {
	private Integer quoteIdOc;
	private List<EndorsementsOc> saveEndorsementsOcList;
	private List<EndorsementsOc> deleteEndorsementsOcList;
	
	public Integer getQuoteIdOc() {
		return quoteIdOc;
	}
	public void setQuoteIdOc(Integer quoteIdOc) {
		this.quoteIdOc = quoteIdOc;
	}
	public List<EndorsementsOc> getSaveEndorsementsOcList() {
		return saveEndorsementsOcList;
	}
	public void setSaveEndorsementsOcList(List<EndorsementsOc> saveEndorsementsOcList) {
		this.saveEndorsementsOcList = saveEndorsementsOcList;
	}
	public List<EndorsementsOc> getDeleteEndorsementsOcList() {
		return deleteEndorsementsOcList;
	}
	public void setDeleteEndorsementsOcList(List<EndorsementsOc> deleteEndorsementsOcList) {
		this.deleteEndorsementsOcList = deleteEndorsementsOcList;
	}
	
	@Override
	public String toString() {
		return "SaveQuoteEndorsementsOcRequest [quoteIdOc=" + quoteIdOc + ", saveEndorsementsOcList="
				+ saveEndorsementsOcList + ", deleteEndorsementsOcList=" + deleteEndorsementsOcList + "]";
	}
}

@Alias("SaveQuoteEndorsementsOc")
class EndorsementsOc{
	private Integer endtCd;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public Integer getEndtCd() {
		return endtCd;
	}
	public void setEndtCd(Integer endtCd) {
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
		return "EndorsementsOc [endtCd=" + endtCd + ", remarks=" + remarks + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
	
}
