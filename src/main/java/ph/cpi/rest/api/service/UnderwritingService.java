package ph.cpi.rest.api.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import ph.cpi.rest.api.model.request.RetrievePolAlopItemRequest;
import ph.cpi.rest.api.model.request.RetrievePolAlopRequest;
import ph.cpi.rest.api.model.request.RetrievePolAttachmentRequest;
import ph.cpi.rest.api.model.request.RetrievePolCATPerilRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoInsuranceRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoverageRequest;
import ph.cpi.rest.api.model.request.RetrievePolEndtRequest;
import ph.cpi.rest.api.model.request.RetrievePolGenInfoRequest;
import ph.cpi.rest.api.model.request.RetrievePolInwardBalRequest;
import ph.cpi.rest.api.model.request.RetrievePolItemRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyDeductiblesRequest;
import ph.cpi.rest.api.model.request.SavePolAttachmentRequest;
import ph.cpi.rest.api.model.response.RetrievePolAlopItemResponse;
import ph.cpi.rest.api.model.response.RetrievePolAlopResponse;
import ph.cpi.rest.api.model.response.RetrievePolAttachmentResponse;
import ph.cpi.rest.api.model.response.RetrievePolCATPerilResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoInsuranceResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoverageResponse;
import ph.cpi.rest.api.model.response.RetrievePolEndtResponse;
import ph.cpi.rest.api.model.response.RetrievePolGenInfoResponse;
import ph.cpi.rest.api.model.response.RetrievePolInwardBalResponse;
import ph.cpi.rest.api.model.response.RetrievePolItemResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyDeductiblesResponse;
import ph.cpi.rest.api.model.response.SavePolAttachmentResponse;

@Service
public interface UnderwritingService {
	
	public RetrievePolInwardBalResponse retrievePolInwardBal(RetrievePolInwardBalRequest rpibp) throws SQLException;
	public RetrievePolCoInsuranceResponse retrievePolCoInsurance(RetrievePolCoInsuranceRequest rpcip) throws SQLException;
	public RetrievePolicyDeductiblesResponse retrievePolicyDeductibles(RetrievePolicyDeductiblesRequest rpdr) throws SQLException;
	public RetrievePolCoverageResponse retrievePolCoverage(RetrievePolCoverageRequest rpcr) throws SQLException;
	public RetrievePolAttachmentResponse retrievePolAttachment(RetrievePolAttachmentRequest rpar) throws SQLException;
	public RetrievePolEndtResponse retrievePolEndt(RetrievePolEndtRequest rper) throws SQLException;
	public RetrievePolItemResponse retrievePolItem(RetrievePolItemRequest rpir) throws SQLException;
	public RetrievePolCATPerilResponse retrievePolCATPeril(RetrievePolCATPerilRequest rpcpr) throws SQLException;
	public RetrievePolGenInfoResponse retrievePolGenInfo(RetrievePolGenInfoRequest rpgip) throws SQLException;
	public RetrievePolAlopResponse retrievePolAlop(RetrievePolAlopRequest rpap) throws SQLException;
	public RetrievePolAlopItemResponse retrievePolAlopItem(RetrievePolAlopItemRequest rpaip) throws SQLException;
	public SavePolAttachmentResponse savePolAttachments(SavePolAttachmentRequest spar) throws SQLException;
	
}
