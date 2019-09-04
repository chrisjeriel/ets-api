package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.underwriting.DistPolInst;

public class RetrievePolDistInstResponse {
	List<DistPolInst> list;

	public List<DistPolInst> getList() {
		return list;
	}

	public void setList(List<DistPolInst> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "RetrievePolDistInstResponse [list=" + list + "]";
	}
	
}
