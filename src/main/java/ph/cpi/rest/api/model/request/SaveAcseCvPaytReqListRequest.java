package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveAcseCvPaytReqListRequest {
	private List<SaveAcseCvPaytReq> savePaytReqList;
	private List<SaveAcseCvPaytReq> deletePaytReqList;
	public List<SaveAcseCvPaytReq> getSavePaytReqList() {
		return savePaytReqList;
	}
	public void setSavePaytReqList(List<SaveAcseCvPaytReq> savePaytReqList) {
		this.savePaytReqList = savePaytReqList;
	}
	public List<SaveAcseCvPaytReq> getDeletePaytReqList() {
		return deletePaytReqList;
	}
	public void setDeletePaytReqList(List<SaveAcseCvPaytReq> deletePaytReqList) {
		this.deletePaytReqList = deletePaytReqList;
	}
	@Override
	public String toString() {
		return "SaveAcseCvPaytReqListRequest [savePaytReqList=" + savePaytReqList + ", deletePaytReqList="
				+ deletePaytReqList + "]";
	}
}

class SaveAcseCvPaytReq {
	private Integer tranId;
	private Integer itemNo;
	private Integer reqId;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	private String cvStatus;
	
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public Integer getItemNo() {
		return itemNo;
	}
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}
	public Integer getReqId() {
		return reqId;
	}
	public void setReqId(Integer reqId) {
		this.reqId = reqId;
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
	public String getCvStatus() {
		return cvStatus;
	}
	public void setCvStatus(String cvStatus) {
		this.cvStatus = cvStatus;
	}
}


