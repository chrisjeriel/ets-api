package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.underwriting.MoveBookingList;

public class RetrieveMoveBookingMonthListResponse {
	List<MoveBookingList> list;

	public List<MoveBookingList> getList() {
		return list;
	}

	public void setList(List<MoveBookingList> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "RetrieveMoveBookingMonthListResponse [list=" + list + "]";
	}
	
}
