package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class AcitArSeries {
	private Integer minArNo;
	private Integer maxArNo;
	private Integer arNo;
	private Integer tranId;
	private String usedTag;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;

	public Integer getMinArNo() {
		return minArNo;
	}
	public void setMinArNo(Integer minArNo) {
		this.minArNo = minArNo;
	}
	public Integer getMaxArNo() {
		return maxArNo;
	}
	public void setMaxArNo(Integer maxArNo) {
		this.maxArNo = maxArNo;
	}

	public Integer getArNo() {
		return arNo;
	}
	public void setArNo(Integer arNo) {
		this.arNo = arNo;
	}
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public String getUsedTag() {
		return usedTag;
	}
	public void setUsedTag(String usedTag) {
		this.usedTag = usedTag;
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
		return "AcitArSeries [minArNo=" + minArNo + ", maxArNo=" + maxArNo + ", arNo=" + arNo + ", tranId=" + tranId
				+ ", usedTag=" + usedTag + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
	
}
