package ph.cpi.rest.api.model.utils;

public class ACSER024A {
	private String acctGroup;
	private String acctName;
	private String groupNum;
	private String paramDate;
	private String itemNo;
	private String acctAmt;
	private String currNetAmt;
	private String prevNetAmt;
	public String getAcctGroup() {
		return acctGroup;
	}
	public void setAcctGroup(String acctGroup) {
		this.acctGroup = acctGroup;
	}
	public String getAcctName() {
		return acctName;
	}
	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}
	public String getGroupNum() {
		return groupNum;
	}
	public void setGroupNum(String groupNum) {
		this.groupNum = groupNum;
	}
	public String getParamDate() {
		return paramDate;
	}
	public void setParamDate(String paramDate) {
		this.paramDate = paramDate;
	}
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public String getAcctAmt() {
		return acctAmt;
	}
	public void setAcctAmt(String acctAmt) {
		this.acctAmt = acctAmt;
	}
	public String getCurrNetAmt() {
		return currNetAmt;
	}
	public void setCurrNetAmt(String currNetAmt) {
		this.currNetAmt = currNetAmt;
	}
	public String getPrevNetAmt() {
		return prevNetAmt;
	}
	public void setPrevNetAmt(String prevNetAmt) {
		this.prevNetAmt = prevNetAmt;
	}
	@Override
	public String toString() {
		return "ACSER024A [acctGroup=" + acctGroup + ", acctName=" + acctName + ", groupNum=" + groupNum
				+ ", paramDate=" + paramDate + ", itemNo=" + itemNo + ", acctAmt=" + acctAmt + ", currNetAmt="
				+ currNetAmt + ", prevNetAmt=" + prevNetAmt + "]";
	}
}
