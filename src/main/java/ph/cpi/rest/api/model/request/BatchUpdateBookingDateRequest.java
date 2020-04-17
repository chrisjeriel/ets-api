package ph.cpi.rest.api.model.request;

import java.util.List;

public class BatchUpdateBookingDateRequest {
	private List<UpdateList> list;
	private String bookingDate;
	private String updateUser;
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public List<UpdateList> getList() {
		return list;
	}
	public void setList(List<UpdateList> list) {
		this.list = list;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	@Override
	public String toString() {
		return "BatchUpdateBookingDateRequest [list=" + list + ", bookingDate=" + bookingDate + ", updateUser="
				+ updateUser + "]";
	}
}

class UpdateList{
	private String policyId;
	private String instNo;
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getInstNo() {
		return instNo;
	}
	public void setInstNo(String instNo) {
		this.instNo = instNo;
	}
	@Override
	public String toString() {
		return "UpdateList [policyId=" + policyId + ", instNo=" + instNo + "]";
	}
}