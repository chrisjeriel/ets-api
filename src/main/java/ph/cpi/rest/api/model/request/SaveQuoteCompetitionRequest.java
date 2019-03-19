package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveQuoteCompetitionRequest {
	
	public List<SCompetition> saveQuoteCompetition;

	public List<SCompetition> getSaveQuoteCompetition() {
		return saveQuoteCompetition;
	}

	public void setSaveQuoteCompetition(List<SCompetition> saveQuoteCompetition) {
		this.saveQuoteCompetition = saveQuoteCompetition;
	}

	@Override
	public String toString() {
		return "SaveQuoteCompetitionRequest [saveQuoteCompetition=" + saveQuoteCompetition + "]";
	}
	
}

@Alias("SaveQuoteCompetition")
class SCompetition{
	private Integer quoteId;
	private Integer adviceNo;
	private String cedingId;
	private Integer cedingRepId;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public Integer getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}
	public Integer getAdviceNo() {
		return adviceNo;
	}
	public void setAdviceNo(Integer adviceNo) {
		this.adviceNo = adviceNo;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public Integer getCedingRepId() {
		return cedingRepId;
	}
	public void setCedingRepId(Integer cedingRepId) {
		this.cedingRepId = cedingRepId;
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
		return "Competition [quoteId=" + quoteId + ", adviceNo=" + adviceNo + ", cedingId=" + cedingId
				+ ", cedingRepId=" + cedingRepId + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}
