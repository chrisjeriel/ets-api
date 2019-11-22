package ph.cpi.rest.api.model.response;

import java.math.BigDecimal;
import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcctServFeeDist;

public class RetrieveAcctPrqServFeeResponse {

	private List<AcctServFeeDist> mainDistList;
	private List<AcctServFeeDist> subDistList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	private Integer returnCode;
	private String refNo;
	private BigDecimal amount;
	
	public List<AcctServFeeDist> getMainDistList() {
		return mainDistList;
	}
	public void setMainDistList(List<AcctServFeeDist> mainDistList) {
		this.mainDistList = mainDistList;
	}
	public List<AcctServFeeDist> getSubDistList() {
		return subDistList;
	}
	public void setSubDistList(List<AcctServFeeDist> subDistList) {
		this.subDistList = subDistList;
	}
	public PaginationResponse getPaginationResponse() {
		return paginationResponse;
	}
	public void setPaginationResponse(PaginationResponse paginationResponse) {
		this.paginationResponse = paginationResponse;
	}
	public SortResponse getSortResponse() {
		return sortResponse;
	}
	public void setSortResponse(SortResponse sortResponse) {
		this.sortResponse = sortResponse;
	}
	public Integer getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(Integer returnCode) {
		this.returnCode = returnCode;
	}
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "RetrieveAcctPrqServFeeResponse [mainDistList=" + mainDistList + ", subDistList=" + subDistList
				+ ", paginationResponse=" + paginationResponse + ", sortResponse=" + sortResponse + ", returnCode="
				+ returnCode + ", refNo=" + refNo + ", amount=" + amount + "]";
	}
}
