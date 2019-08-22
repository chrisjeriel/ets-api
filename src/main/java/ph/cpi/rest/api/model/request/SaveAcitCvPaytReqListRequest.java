package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveAcitCvPaytReqListRequest {

	private List<SaveAcitCvPaytReq> savePaytReqList;
	private List<SaveAcitCvPaytReq> deletePaytReqList;
	
	public List<SaveAcitCvPaytReq> getSavePaytReqList() {
		return savePaytReqList;
	}
	public void setSavePaytReqList(List<SaveAcitCvPaytReq> savePaytReqList) {
		this.savePaytReqList = savePaytReqList;
	}
	public List<SaveAcitCvPaytReq> getDeletePaytReqList() {
		return deletePaytReqList;
	}
	public void setDeletePaytReqList(List<SaveAcitCvPaytReq> deletePaytReqList) {
		this.deletePaytReqList = deletePaytReqList;
	}
	@Override
	public String toString() {
		return "SaveAcitCvPaytReqListRequest [savePaytReqList=" + savePaytReqList + ", deletePaytReqList="
				+ deletePaytReqList + "]";
	}
}

class SaveAcitCvPaytReq {
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
	@Override
	public String toString() {
		return "SaveAcitCvPaytReq [tranId=" + tranId + ", itemNo=" + itemNo + ", reqId=" + reqId + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + ", cvStatus=" + cvStatus + "]";
	}
}
