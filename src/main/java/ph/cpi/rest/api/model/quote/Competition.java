package ph.cpi.rest.api.model.quote;

import org.joda.time.DateTime;

public class Competition {
	private Integer quoteId;
	private Integer adviceNo;
	private String cedingId;
	private String cedingName;
	private Integer cedingRepId;
	private String cedingRepName;
	private String position;
	private String advOption;
	private String wordings;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
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
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public Integer getCedingRepId() {
		return cedingRepId;
	}
	public void setCedingRepId(Integer cedingRepId) {
		this.cedingRepId = cedingRepId;
	}
	public String getCedingRepName() {
		return cedingRepName;
	}
	public void setCedingRepName(String cedingRepName) {
		this.cedingRepName = cedingRepName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
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
	public DateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public DateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}
	
	@Override
	public String toString() {
		return "Competition [quoteId=" + quoteId + ", adviceNo=" + adviceNo + ", cedingId=" + cedingId + ", cedingName="
				+ cedingName + ", cedingRepId=" + cedingRepId + ", cedingRepName=" + cedingRepName + ", position="
				+ position + ", advOption=" + advOption + ", wordings=" + wordings + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
