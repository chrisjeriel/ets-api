package ph.cpi.rest.api.model.response;

import java.util.ArrayList;
import java.util.List;

import ph.cpi.rest.api.model.underwriting.BatchPost;

public class BatchPostingResponse {
	private List<BatchPost> updateResult = new ArrayList<BatchPost>();

	public List<BatchPost> getUpdateResult() {
		return updateResult;
	}

	public void setUpdateResult(List<BatchPost> updateResult) {
		this.updateResult = updateResult;
	}

	@Override
	public String toString() {
		return "BatchPostingResponse [updateResult=" + updateResult + "]";
	}
}
