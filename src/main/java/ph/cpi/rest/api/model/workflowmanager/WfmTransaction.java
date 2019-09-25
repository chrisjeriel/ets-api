package ph.cpi.rest.api.model.workflowmanager;

import org.joda.time.DateTime;

public class WfmTransaction {
	
	private String tranTitle;
	private String tranText;
	private Integer position;
	private String imgUrl;
	private String remarks;
	private Integer tranCount;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	public String getTranTitle() {
		return tranTitle;
	}
	public void setTranTitle(String tranTitle) {
		this.tranTitle = tranTitle;
	}
	public String getTranText() {
		return tranText;
	}
	public void setTranText(String tranText) {
		this.tranText = tranText;
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
	public Integer getTranCount() {
		return tranCount;
	}
	public void setTranCount(Integer tranCount) {
		this.tranCount = tranCount;
	}
	public Integer getPosition() {
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	@Override
	public String toString() {
		return "WfmTransaction [tranTitle=" + tranTitle + ", tranText=" + tranText + ", position=" + position
				+ ", imgUrl=" + imgUrl + ", remarks=" + remarks + ", tranCount=" + tranCount + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + "]";
	}
	
}
