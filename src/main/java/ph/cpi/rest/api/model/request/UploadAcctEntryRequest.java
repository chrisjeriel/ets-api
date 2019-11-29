package ph.cpi.rest.api.model.request;

import java.util.ArrayList;
import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.AcctEntryRowUpload;

public class UploadAcctEntryRequest {
	
	List<AcctEntryRowUpload> aeruList = new ArrayList<AcctEntryRowUpload>();

	public List<AcctEntryRowUpload> getAeruList() {
		return aeruList;
	}

	public void setAeruList(List<AcctEntryRowUpload> aeruList) {
		this.aeruList = aeruList;
	}

	@Override
	public String toString() {
		return "UploadAcctEntryRequest [aeruList=" + aeruList + "]";
	}
	
}
