package ph.cpi.rest.api.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import ph.cpi.rest.api.model.request.RetrievePolAttachmentRequest;
import ph.cpi.rest.api.model.request.RetrievePolCATPerilRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoverageRequest;
import ph.cpi.rest.api.model.request.RetrievePolEndtRequest;
import ph.cpi.rest.api.model.request.RetrievePolItemRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyDeductiblesRequest;
import ph.cpi.rest.api.model.request.SavePolCATPerilRequest;
import ph.cpi.rest.api.model.request.SavePolItemRequest;
import ph.cpi.rest.api.model.response.RetrievePolAttachmentResponse;
import ph.cpi.rest.api.model.response.RetrievePolCATPerilResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoverageResponse;
import ph.cpi.rest.api.model.response.RetrievePolEndtResponse;
import ph.cpi.rest.api.model.response.RetrievePolItemResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyDeductiblesResponse;
import ph.cpi.rest.api.model.response.SavePolCATPerilResponse;
import ph.cpi.rest.api.model.response.SavePolItemResponse;

@Service
public interface UnderwritingService {
	
	public RetrievePolicyDeductiblesResponse retrievePolicyDeductibles(RetrievePolicyDeductiblesRequest rpdr) throws SQLException;
	public RetrievePolCoverageResponse retrievePolCoverage(RetrievePolCoverageRequest rpcr) throws SQLException;
	public RetrievePolAttachmentResponse retrievePolAttachment(RetrievePolAttachmentRequest rpar) throws SQLException;
	public RetrievePolEndtResponse retrievePolEndt(RetrievePolEndtRequest rper) throws SQLException;
	public RetrievePolItemResponse retrievePolItem(RetrievePolItemRequest rpir) throws SQLException;
	public RetrievePolCATPerilResponse retrievePolCATPeril(RetrievePolCATPerilRequest rpcpr) throws SQLException;
	public SavePolCATPerilResponse savePolCATPeril(SavePolCATPerilRequest spcpr ) throws SQLException;
	public SavePolItemResponse savePolItem(SavePolItemRequest spir ) throws SQLException;
	
}
