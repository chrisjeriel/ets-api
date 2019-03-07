package ph.cpi.rest.api.model.quote;

import org.joda.time.LocalDateTime;

public class Competition {
	private Integer quoteId;
	private Integer adviceNo;
	private Integer cedingId;
	private String cedingName;
	private String cedingRepId;
	private String cedingRepName;
	private String position;
	private String option;
	private String wordings;
	private String createUser;
	private LocalDateTime createDate;
	private String updateUser;
	private LocalDateTime updateDate;
	
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
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public String getCedingRepId() {
		return cedingRepId;
	}
	public void setCedingRepId(String cedingRepId) {
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
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public LocalDateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "Competition [quoteId=" + quoteId + ", adviceNo=" + adviceNo + ", cedingId=" + cedingId + ", cedingName="
				+ cedingName + ", cedingRepId=" + cedingRepId + ", cedingRepName=" + cedingRepName + ", position="
				+ position + ", option=" + option + ", wordings=" + wordings + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
	
	
}
