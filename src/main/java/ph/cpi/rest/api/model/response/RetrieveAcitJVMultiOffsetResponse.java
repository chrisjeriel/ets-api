package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.MultiOffsetClm;
import ph.cpi.rest.api.model.accountingintrust.MultiOffsetExisting;
import ph.cpi.rest.api.model.accountingintrust.MultiOffsetInvPl;
import ph.cpi.rest.api.model.accountingintrust.MultiOffsetInvPo;
import ph.cpi.rest.api.model.accountingintrust.MultiOffsetIpb;
import ph.cpi.rest.api.model.accountingintrust.MultiOffsetLrd;
import ph.cpi.rest.api.model.accountingintrust.MultiOffsetOth;
import ph.cpi.rest.api.model.accountingintrust.MultiOffsetTrty;
import ph.cpi.rest.api.model.accountingintrust.MultiOffsetUnapp;

public class RetrieveAcitJVMultiOffsetResponse {

	private MultiOffsetExisting existing;
	private List<MultiOffsetIpb> ipbList;
	private List<MultiOffsetClm> clmList;
	private List<MultiOffsetTrty> trtyList;
	private List<MultiOffsetUnapp> unappList;
	private List<MultiOffsetInvPo> invPoList;
	private List<MultiOffsetInvPl> invPlList;
	private List<MultiOffsetLrd> lrdList;
	private List<MultiOffsetOth> othList;
	
	public MultiOffsetExisting getExisting() {
		return existing;
	}
	public void setExisting(MultiOffsetExisting existing) {
		this.existing = existing;
	}
	public List<MultiOffsetIpb> getIpbList() {
		return ipbList;
	}
	public void setIpbList(List<MultiOffsetIpb> ipbList) {
		this.ipbList = ipbList;
	}
	public List<MultiOffsetClm> getClmList() {
		return clmList;
	}
	public void setClmList(List<MultiOffsetClm> clmList) {
		this.clmList = clmList;
	}
	public List<MultiOffsetTrty> getTrtyList() {
		return trtyList;
	}
	public void setTrtyList(List<MultiOffsetTrty> trtyList) {
		this.trtyList = trtyList;
	}
	public List<MultiOffsetUnapp> getUnappList() {
		return unappList;
	}
	public void setUnappList(List<MultiOffsetUnapp> unappList) {
		this.unappList = unappList;
	}
	public List<MultiOffsetInvPo> getInvPoList() {
		return invPoList;
	}
	public void setInvPoList(List<MultiOffsetInvPo> invPoList) {
		this.invPoList = invPoList;
	}
	public List<MultiOffsetInvPl> getInvPlList() {
		return invPlList;
	}
	public void setInvPlList(List<MultiOffsetInvPl> invPlList) {
		this.invPlList = invPlList;
	}
	public List<MultiOffsetLrd> getLrdList() {
		return lrdList;
	}
	public void setLrdList(List<MultiOffsetLrd> lrdList) {
		this.lrdList = lrdList;
	}
	public List<MultiOffsetOth> getOthList() {
		return othList;
	}
	public void setOthList(List<MultiOffsetOth> othList) {
		this.othList = othList;
	}
	@Override
	public String toString() {
		return "RetrieveAcitJVMultiOffsetResponse [existing=" + existing + ", ipbList=" + ipbList + ", clmList="
				+ clmList + ", trtyList=" + trtyList + ", unappList=" + unappList + ", invPoList=" + invPoList
				+ ", invPlList=" + invPlList + ", lrdList=" + lrdList + ", othList=" + othList + "]";
	}
}