package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnBankAcctRequest {
	private String bankCd;
	private String bankAcctCd;
	private String accountNo;
	private String dcbTag;
	private PaginationRequest paginationRequest = new PaginationRequest();
	private SortRequest sortRequest = new SortRequest();
	
	public String getBankCd() {
		return bankCd;
	}
	public void setBankCd(String bankCd) {
		this.bankCd = bankCd;
	}
	public String getBankAcctCd() {
		return bankAcctCd;
	}
	public void setBankAcctCd(String bankAcctCd) {
		this.bankAcctCd = bankAcctCd;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getDcbTag() {
		return dcbTag;
	}
	public void setDcbTag(String dcbTag) {
		this.dcbTag = dcbTag;
	}
	public PaginationRequest getPaginationRequest() {
		return paginationRequest;
	}
	public void setPaginationRequest(PaginationRequest paginationRequest) {
		this.paginationRequest = paginationRequest;
	}
	public SortRequest getSortRequest() {
		return sortRequest;
	}
	public void setSortRequest(SortRequest sortRequest) {
		this.sortRequest = sortRequest;
	}
	
	@Override
	public String toString() {
		return "RetrieveMtnBankAcctRequest [bankCd=" + bankCd + ", bankAcctCd=" + bankAcctCd + ", accountNo="
				+ accountNo + ", dcbTag=" + dcbTag + ", paginationRequest=" + paginationRequest + ", sortRequest="
				+ sortRequest + "]";
	}
}
