package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveQuoteAdviceWordingsRequest {
	
	private List<AdviceWordings> saveAdviceWordings;

	public List<AdviceWordings> getSaveAdviceWordings() {
		return saveAdviceWordings;
	}

	public void setSaveAdviceWordings(List<AdviceWordings> saveAdviceWordings) {
		this.saveAdviceWordings = saveAdviceWordings;
	}

	@Override
	public String toString() {
		return "SaveQuoteAdviceWordingsRequest [saveAdviceWordings=" + saveAdviceWordings + "]";
	}
}

@Alias("SaveQuoteAdviceWordings")
class AdviceWordings{
	private Integer quoteId;
	private Integer adviceNo;
	private String cedingId;
	private String advOption;
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
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getAdvOption() {
		return advOption;
	}
	public void setAdvOption(String advOption) {
		this.advOption = advOption;
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
		return "AdviceWordings [quoteId=" + quoteId + ", adviceNo=" + adviceNo + ", cedingId=" + cedingId
				+ ", advOption=" + advOption + ", wordings=" + wordings + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
