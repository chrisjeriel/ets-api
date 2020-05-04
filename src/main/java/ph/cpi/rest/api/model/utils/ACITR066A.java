package ph.cpi.rest.api.model.utils;

public class ACITR066A {
	private String acctGroup;
	private String sortSeq;
	private String accountName;
	private String dollarTreaty;
	private String pesoEquivalent;
	private String pesoTreaty;
	private String totalTreatyCy;
	private String totalTreatyPy;
	private String paramDate;
	public String getAcctGroup() {
		return acctGroup;
	}
	public void setAcctGroup(String acctGroup) {
		this.acctGroup = acctGroup;
	}
	public String getSortSeq() {
		return sortSeq;
	}
	public void setSortSeq(String sortSeq) {
		this.sortSeq = sortSeq;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getDollarTreaty() {
		return dollarTreaty;
	}
	public void setDollarTreaty(String dollarTreaty) {
		this.dollarTreaty = dollarTreaty;
	}
	public String getPesoEquivalent() {
		return pesoEquivalent;
	}
	public void setPesoEquivalent(String pesoEquivalent) {
		this.pesoEquivalent = pesoEquivalent;
	}
	public String getPesoTreaty() {
		return pesoTreaty;
	}
	public void setPesoTreaty(String pesoTreaty) {
		this.pesoTreaty = pesoTreaty;
	}
	public String getTotalTreatyCy() {
		return totalTreatyCy;
	}
	public void setTotalTreatyCy(String totalTreatyCy) {
		this.totalTreatyCy = totalTreatyCy;
	}
	public String getTotalTreatyPy() {
		return totalTreatyPy;
	}
	public void setTotalTreatyPy(String totalTreatyPy) {
		this.totalTreatyPy = totalTreatyPy;
	}
	public String getParamDate() {
		return paramDate;
	}
	public void setParamDate(String paramDate) {
		this.paramDate = paramDate;
	}
	@Override
	public String toString() {
		return "ACITR066A [acctGroup=" + acctGroup + ", sortSeq=" + sortSeq + ", accountName=" + accountName
				+ ", dollarTreaty=" + dollarTreaty + ", pesoEquivalent=" + pesoEquivalent + ", pesoTreaty=" + pesoTreaty
				+ ", totalTreatyCy=" + totalTreatyCy + ", totalTreatyPy=" + totalTreatyPy + ", paramDate=" + paramDate
				+ "]";
	}
}
