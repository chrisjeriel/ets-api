package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveQuoteOptionAllRequest {
	private Integer quoteId;
	private List<QuoteOption> saveQuoteOptionsList;
	private List<QuoteOption> deleteQuoteOptionsList;
	
	private List<OtherRates> otherRates;
	private List<QuoteOption> newQuoteOptionsList;
//	private List<OtherRates> deleteOtherRates;
//	
	private List<Deductibles> saveDeductibleList;
	private List<Deductibles> deleteDeductibleList;
	public Integer getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}
	public List<QuoteOption> getSaveQuoteOptionsList() {
		return saveQuoteOptionsList;
	}
	public void setSaveQuoteOptionsList(List<QuoteOption> saveQuoteOptionsList) {
		this.saveQuoteOptionsList = saveQuoteOptionsList;
	}
	public List<QuoteOption> getDeleteQuoteOptionsList() {
		return deleteQuoteOptionsList;
	}
	public void setDeleteQuoteOptionsList(List<QuoteOption> deleteQuoteOptionsList) {
		this.deleteQuoteOptionsList = deleteQuoteOptionsList;
	}
	public List<OtherRates> getOtherRates() {
		return otherRates;
	}
	public void setOtherRates(List<OtherRates> otherRates) {
		this.otherRates = otherRates;
	}
	
	public List<QuoteOption> getNewQuoteOptionsList() {
		return newQuoteOptionsList;
	}
	public void setNewQuoteOptionsList(List<QuoteOption> newQuoteOptionsList) {
		this.newQuoteOptionsList = newQuoteOptionsList;
	}
	
	public List<Deductibles> getSaveDeductibleList() {
		return saveDeductibleList;
	}
	public void setSaveDeductibleList(List<Deductibles> saveDeductibleList) {
		this.saveDeductibleList = saveDeductibleList;
	}
	public List<Deductibles> getDeleteDeductibleList() {
		return deleteDeductibleList;
	}
	public void setDeleteDeductibleList(List<Deductibles> deleteDeductibleList) {
		this.deleteDeductibleList = deleteDeductibleList;
	}
	@Override
	public String toString() {
		return "SaveQuoteOptionAllRequest [quoteId=" + quoteId + ", saveQuoteOptionsList=" + saveQuoteOptionsList
				+ ", deleteQuoteOptionsList=" + deleteQuoteOptionsList + ", otherRates=" + otherRates
				+ ", newQuoteOptionsList=" + newQuoteOptionsList + ", saveDeductibleList=" + saveDeductibleList
				+ ", deleteDeductibleList=" + deleteDeductibleList + "]";
	}
	
}

