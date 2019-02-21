package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveQuoteCompetitionRequest {
	
	public List<Competition> competitionsList;

	public List<Competition> getCompetitionsList() {
		return competitionsList;
	}

	public void setCompetitionsList(List<Competition> competitionsList) {
		this.competitionsList = competitionsList;
	}

	@Override
	public String toString() {
		return "SaveQuoteCompetitionRequest [competitionsList=" + competitionsList + "]";
	}

}

@Alias("SaveQuoteCompetition")
class Competition{
	private Integer quoteId;
	private Integer adviceNo;
	private Integer cedingId;
	private String cedingRepId;
	private String option;
	private String wordings;
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
	public Integer getCedingId() {
		return cedingId;
	}
	public void setCedingId(Integer cedingId) {
		this.cedingId = cedingId;
	}
	public String getCedingRepId() {
		return cedingRepId;
	}
	public void setCedingRepId(String cedingRepId) {
		this.cedingRepId = cedingRepId;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public String getWordings() {
		return wordings;
	}
	public void setWordings(String wordings) {
		this.wordings = wordings;
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
				+ ", cedingRepId=" + cedingRepId + ", option=" + option + ", wordings=" + wordings + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + "]";
	}
	
	
}
