package ph.cpi.rest.api.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import ph.cpi.rest.api.model.request.RetrievePolAlopItemRequest;
import ph.cpi.rest.api.model.request.RetrievePolAlopRequest;
import ph.cpi.rest.api.model.request.RetrievePolAttachmentRequest;
import ph.cpi.rest.api.model.request.RetrievePolCATPerilRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoInsuranceRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoverageOcRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoverageRequest;
import ph.cpi.rest.api.model.request.RetrievePolEndtRequest;
import ph.cpi.rest.api.model.request.RetrievePolGenInfoRequest;
import ph.cpi.rest.api.model.request.RetrievePolInwardBalRequest;
import ph.cpi.rest.api.model.request.RetrievePolItemRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyDeductiblesRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyListingRequest;
import ph.cpi.rest.api.model.request.SavePolAlopItemRequest;
import ph.cpi.rest.api.model.request.SavePolAlopRequest;
import ph.cpi.rest.api.model.request.SavePolAttachmentRequest;
import ph.cpi.rest.api.model.request.SavePolCoverageOcRequest;
import ph.cpi.rest.api.model.request.SavePolCoverageRequest;
import ph.cpi.rest.api.model.request.SavePolicyDeductiblesRequest;
import ph.cpi.rest.api.model.response.RetrievePolAlopItemResponse;
import ph.cpi.rest.api.model.response.RetrievePolAlopResponse;
import ph.cpi.rest.api.model.response.RetrievePolAttachmentResponse;
import ph.cpi.rest.api.model.response.RetrievePolCATPerilResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoInsuranceResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoverageOcResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoverageResponse;
import ph.cpi.rest.api.model.response.RetrievePolEndtResponse;
import ph.cpi.rest.api.model.response.RetrievePolGenInfoResponse;
import ph.cpi.rest.api.model.response.RetrievePolInwardBalResponse;
import ph.cpi.rest.api.model.response.RetrievePolItemResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyDeductiblesResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyListingResponse;
import ph.cpi.rest.api.model.response.SavePolAlopItemResponse;
import ph.cpi.rest.api.model.response.SavePolAlopResponse;
import ph.cpi.rest.api.model.response.SavePolAttachmentResponse;
import ph.cpi.rest.api.model.response.SavePolCoverageOcResponse;
import ph.cpi.rest.api.model.response.SavePolCoverageResponse;
import ph.cpi.rest.api.model.response.SavePolicyDeductiblesResponse;

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
	public SavePolicyDeductiblesResponse savePolicyDeductibles(SavePolicyDeductiblesRequest spdr) throws SQLException;
	public SavePolCoverageResponse savePolCoverage(SavePolCoverageRequest spcr) throws SQLException;	
	public RetrievePolicyListingResponse retrievePolicyListing(RetrievePolicyListingRequest rpgip) throws SQLException;
	public SavePolAlopResponse savePolAlop(SavePolAlopRequest spap) throws SQLException;
	public SavePolAlopItemResponse savePolAlopItem(SavePolAlopItemRequest spaip) throws SQLException;
	public RetrievePolCoverageOcResponse retrievePolCoverageOc(RetrievePolCoverageOcRequest rpcr) throws SQLException;
	public SavePolCoverageOcResponse savePolCoverageOc(SavePolCoverageOcRequest spaip) throws SQLException;
	
}
