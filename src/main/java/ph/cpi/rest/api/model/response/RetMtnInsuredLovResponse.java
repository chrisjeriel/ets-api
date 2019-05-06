package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.maintenance.Insured;

public class RetMtnInsuredLovResponse {
	private List<Insured> list;
	private Integer count;
	public List<Insured> getList() {
		return list;
	}
	public void setList(List<Insured> list) {
		this.list = list;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "RetMtnInsuredLovResponse [list=" + list + ", count=" + count + "]";
	}
	
	
	
}
