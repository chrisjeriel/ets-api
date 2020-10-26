package ph.cpi.rest.api.model.utils;

public class ACITR066J {

	private String groupNo;
	private String groupName;
	private String itemNo;
	private String eomDate;
	private String tranNo;
	private String itemName;
	private String itemAmt;
	private String localAmt;
	
	public String getGroupNo() {
		return groupNo;
	}
	public void setGroupNo(String groupNo) {
		this.groupNo = groupNo;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public String getEomDate() {
		return eomDate;
	}
	public void setEomDate(String eomDate) {
		this.eomDate = eomDate;
	}
	public String getTranNo() {
		return tranNo;
	}
	public void setTranNo(String tranNo) {
		this.tranNo = tranNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemAmt() {
		return itemAmt;
	}
	public void setItemAmt(String itemAmt) {
		this.itemAmt = itemAmt;
	}
	public String getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(String localAmt) {
		this.localAmt = localAmt;
	}
	@Override
	public String toString() {
		return "ACITR066J [groupNo=" + groupNo + ", groupName=" + groupName + ", itemNo=" + itemNo + ", eomDate="
				+ eomDate + ", tranNo=" + tranNo + ", itemName=" + itemName + ", itemAmt=" + itemAmt + ", localAmt="
				+ localAmt + "]";
	}
}
