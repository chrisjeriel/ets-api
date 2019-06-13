package ph.cpi.rest.api.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import ph.cpi.rest.api.model.request.ExtractExpiringPolicyRequest;
import ph.cpi.rest.api.model.request.GenHundredValPolPrintingRequest;
import ph.cpi.rest.api.model.request.PostDistributionRequest;
import ph.cpi.rest.api.model.request.PostPolicyRequest;
import ph.cpi.rest.api.model.request.ProcessRenewablePolicyRequest;
import ph.cpi.rest.api.model.request.PurgeExpiringPolRequest;
import ph.cpi.rest.api.model.request.RetrieveAlterationsPerPolicyRequest;
import ph.cpi.rest.api.model.request.RetrieveDistCoInsRequest;
import ph.cpi.rest.api.model.request.RetrieveExpPolListRequest;
import ph.cpi.rest.api.model.request.RetrievePolAlopItemRequest;
import ph.cpi.rest.api.model.request.RetrievePolAlopRequest;
import ph.cpi.rest.api.model.request.RetrievePolAttachmentOcRequest;
import ph.cpi.rest.api.model.request.RetrievePolAttachmentRequest;
import ph.cpi.rest.api.model.request.RetrievePolCATPerilRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoInsuranceRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoverageAltRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoverageOcRequest;
import ph.cpi.rest.api.model.request.RetrievePolCoverageRequest;
import ph.cpi.rest.api.model.request.RetrievePolDistRequest;
import ph.cpi.rest.api.model.request.RetrievePolEndtOcRequest;
import ph.cpi.rest.api.model.request.RetrievePolEndtRequest;
import ph.cpi.rest.api.model.request.RetrievePolForPurgingRequest;
import ph.cpi.rest.api.model.request.RetrievePolFullCoverageRequest;
import ph.cpi.rest.api.model.request.RetrievePolGenInfoOcRequest;
import ph.cpi.rest.api.model.request.RetrievePolGenInfoRequest;
import ph.cpi.rest.api.model.request.RetrievePolHoldCoverListingRequest;
import ph.cpi.rest.api.model.request.RetrievePolHoldCoverRequest;
import ph.cpi.rest.api.model.request.RetrievePolInwardBalRequest;
import ph.cpi.rest.api.model.request.RetrievePolItemRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyApproverRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyDeductiblesRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyInformationRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyListingRequest;
import ph.cpi.rest.api.model.request.RetrievePolicyOCListingRequest;
import ph.cpi.rest.api.model.request.RetrievePoolDistributionRequest;
import ph.cpi.rest.api.model.request.RetrieveRiskDistributionRequest;
import ph.cpi.rest.api.model.request.RetrieveWfmApprovalsRequest;
import ph.cpi.rest.api.model.request.SaveExpCovRequest;
import ph.cpi.rest.api.model.request.SaveOpenPolDetailsRequest;
import ph.cpi.rest.api.model.request.SavePolAlopItemRequest;
import ph.cpi.rest.api.model.request.SavePolAlopRequest;
import ph.cpi.rest.api.model.request.SavePolAttachmentOcRequest;
import ph.cpi.rest.api.model.request.SavePolAttachmentRequest;
import ph.cpi.rest.api.model.request.SavePolCATPerilRequest;
import ph.cpi.rest.api.model.request.SavePolCoverageOcRequest;
import ph.cpi.rest.api.model.request.SavePolCoverageRequest;
import ph.cpi.rest.api.model.request.SavePolEndorsementRequest;
import ph.cpi.rest.api.model.request.SavePolEndtOcRequest;
import ph.cpi.rest.api.model.request.SavePolFullCoverageRequest;
import ph.cpi.rest.api.model.request.SavePolGenInfoOcRequest;
import ph.cpi.rest.api.model.request.SavePolGenInfoRequest;
import ph.cpi.rest.api.model.request.SavePolHoldCoverRequest;
import ph.cpi.rest.api.model.request.SavePolInwardBalRequest;
import ph.cpi.rest.api.model.request.SavePolItemRequest;
import ph.cpi.rest.api.model.request.SavePolicyDeductiblesRequest;
import ph.cpi.rest.api.model.request.SavePolicyDetailsRequest;
import ph.cpi.rest.api.model.request.SaveSumInsOCRequest;
import ph.cpi.rest.api.model.request.UpdatePolGenInfoRequest;
import ph.cpi.rest.api.model.request.UpdatePolGenInfoSpoilageRequest;
import ph.cpi.rest.api.model.request.UpdatePolHoldCoverStatusRequest;
import ph.cpi.rest.api.model.request.UpdatePolicyStatusRequest;
import ph.cpi.rest.api.model.response.ExtractExpiringPolicyResponse;
import ph.cpi.rest.api.model.response.GenHundredValPolPrintingResponse;
import ph.cpi.rest.api.model.response.PostDistributionResponse;
import ph.cpi.rest.api.model.response.PostPolicyResponse;
import ph.cpi.rest.api.model.response.ProcessRenewablePolicyResponse;
import ph.cpi.rest.api.model.response.PurgeExpiringPolResponse;
import ph.cpi.rest.api.model.response.RetrieveAlterationsPerPolicyResponse;
import ph.cpi.rest.api.model.response.RetrieveDistCoInsResponse;
import ph.cpi.rest.api.model.response.RetrieveExpPolListResponse;
import ph.cpi.rest.api.model.response.RetrievePolAlopItemResponse;
import ph.cpi.rest.api.model.response.RetrievePolAlopResponse;
import ph.cpi.rest.api.model.response.RetrievePolAttachmentOcResponse;
import ph.cpi.rest.api.model.response.RetrievePolAttachmentResponse;
import ph.cpi.rest.api.model.response.RetrievePolCATPerilResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoInsuranceResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoverageAltResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoverageOcResponse;
import ph.cpi.rest.api.model.response.RetrievePolCoverageResponse;
import ph.cpi.rest.api.model.response.RetrievePolDistResponse;
import ph.cpi.rest.api.model.response.RetrievePolEndtOcResponse;
import ph.cpi.rest.api.model.response.RetrievePolEndtResponse;
import ph.cpi.rest.api.model.response.RetrievePolForPurgingResponse;
import ph.cpi.rest.api.model.response.RetrievePolFullCoverageResponse;
import ph.cpi.rest.api.model.response.RetrievePolGenInfoOcResponse;
import ph.cpi.rest.api.model.response.RetrievePolGenInfoResponse;
import ph.cpi.rest.api.model.response.RetrievePolHoldCoverResponse;
import ph.cpi.rest.api.model.response.RetrievePolInwardBalResponse;
import ph.cpi.rest.api.model.response.RetrievePolItemResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyApproverResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyDeductiblesResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyInformationResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyListingResponse;
import ph.cpi.rest.api.model.response.RetrievePolicyOCListingResponse;
import ph.cpi.rest.api.model.response.RetrievePoolDistributionResponse;
import ph.cpi.rest.api.model.response.RetrieveRiskDistributionResponse;
import ph.cpi.rest.api.model.response.RetrieveWfmApprovalsResponse;
import ph.cpi.rest.api.model.response.SaveExpCovResponse;
import ph.cpi.rest.api.model.response.SaveOpenPolDetailsResponse;
import ph.cpi.rest.api.model.response.SavePolAlopItemResponse;
import ph.cpi.rest.api.model.response.SavePolAlopResponse;
import ph.cpi.rest.api.model.response.SavePolAttachmentOcResponse;
import ph.cpi.rest.api.model.response.SavePolAttachmentResponse;
import ph.cpi.rest.api.model.response.SavePolCATPerilResponse;
import ph.cpi.rest.api.model.response.SavePolCoverageOcResponse;
import ph.cpi.rest.api.model.response.SavePolCoverageResponse;
import ph.cpi.rest.api.model.response.SavePolEndorsementResponse;
import ph.cpi.rest.api.model.response.SavePolEndtOcResponse;
import ph.cpi.rest.api.model.response.SavePolFullCoverageResponse;
import ph.cpi.rest.api.model.response.SavePolGenInfoOcResponse;
import ph.cpi.rest.api.model.response.SavePolGenInfoResponse;
import ph.cpi.rest.api.model.response.SavePolHoldCoverResponse;
import ph.cpi.rest.api.model.response.SavePolInwardBalResponse;
import ph.cpi.rest.api.model.response.SavePolItemResponse;
import ph.cpi.rest.api.model.response.SavePolicyDeductiblesResponse;
import ph.cpi.rest.api.model.response.SavePolicyDetailsResponse;
import ph.cpi.rest.api.model.response.SaveSumInsOCResponse;
import ph.cpi.rest.api.model.response.UpdatePolGenInfoResponse;
import ph.cpi.rest.api.model.response.UpdatePolGenInfoSpoilageResponse;
import ph.cpi.rest.api.model.response.UpdatePolHoldCoverStatusResponse;
import ph.cpi.rest.api.model.response.UpdatePolicyStatusResponse;

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
	public SavePolHoldCoverResponse savePolHoldCover(SavePolHoldCoverRequest sphcr) throws SQLException;
	public RetrievePolAttachmentOcResponse retrievePolAttachmentOc(RetrievePolAttachmentOcRequest rpaor) throws SQLException;
	public RetrievePolEndtOcResponse retrievePolEndtOc(RetrievePolEndtOcRequest rpeor) throws SQLException;
	public RetrievePolicyListingResponse retrievePolicyListing(RetrievePolicyListingRequest rpgip) throws SQLException;
	public SavePolAlopResponse savePolAlop(SavePolAlopRequest spap) throws SQLException;
	public SavePolAlopItemResponse savePolAlopItem(SavePolAlopItemRequest spaip) throws SQLException;
	public RetrievePolHoldCoverResponse retrievePolHoldCover(RetrievePolHoldCoverRequest rphc) throws SQLException;
	public SavePolCATPerilResponse savePolCATPeril(SavePolCATPerilRequest spcpr ) throws SQLException;
	public SavePolItemResponse savePolItem(SavePolItemRequest spir ) throws SQLException;
	public RetrievePolCoverageOcResponse retrievePolCoverageOc(RetrievePolCoverageOcRequest rpcr) throws SQLException;
	public SavePolCoverageOcResponse savePolCoverageOc(SavePolCoverageOcRequest spaip) throws SQLException;
	public SavePolEndtOcResponse savePolEndtOc(SavePolEndtOcRequest spaip) throws SQLException;
	public SavePolGenInfoResponse savePolGenInfo(SavePolGenInfoRequest spgip) throws SQLException;
	public SavePolicyDetailsResponse savePolicyDetails(SavePolicyDetailsRequest spdp) throws SQLException;
	public RetrievePolicyInformationResponse retrievePolicyInformation(RetrievePolicyInformationRequest rpir) throws SQLException;
	public SavePolInwardBalResponse savePolInwardBal(SavePolInwardBalRequest spibr) throws SQLException;
	public SavePolEndorsementResponse savePolEndorsement(SavePolEndorsementRequest sper)throws SQLException;
	public SaveSumInsOCResponse saveSumInsOC( SaveSumInsOCRequest ssioc) throws SQLException;
	public RetrievePolicyOCListingResponse retrievePolicyOCListing(RetrievePolicyOCListingRequest rplp) throws SQLException;
	public UpdatePolHoldCoverStatusResponse updatePolHoldCoverStatus(UpdatePolHoldCoverStatusRequest uphcsr) throws SQLException;
	public SaveOpenPolDetailsResponse saveOpenPolDetails(SaveOpenPolDetailsRequest sopdr) throws SQLException;
	public RetrievePolicyApproverResponse retrievePolicyApprover(RetrievePolicyApproverRequest rpaRequest) throws SQLException;
	public UpdatePolicyStatusResponse updatePolicyStatus(UpdatePolicyStatusRequest sqawr) throws SQLException;
	public RetrieveWfmApprovalsResponse retrieveWfmApprovals(RetrieveWfmApprovalsRequest rwar) throws SQLException;
	public RetrievePolHoldCoverResponse retrievePolHoldCoverListing(RetrievePolHoldCoverListingRequest rphclp) throws SQLException;
	public RetrievePolGenInfoOcResponse retrievePolGenInfoOc(RetrievePolGenInfoOcRequest rpgior) throws SQLException;
	public RetrievePolCoverageAltResponse retrivePolCoverageAlt (RetrievePolCoverageAltRequest rpcar)throws SQLException;
	public SavePolAttachmentOcResponse savePolAttachmentOc(SavePolAttachmentOcRequest spaocr) throws SQLException;
	public RetrieveAlterationsPerPolicyResponse retrieveAlterationsPerPolicy(RetrieveAlterationsPerPolicyRequest rappr) throws SQLException;
	public UpdatePolGenInfoSpoilageResponse updatePolGenInfoSpoilage(UpdatePolGenInfoSpoilageRequest upgisr) throws SQLException;
	public SavePolGenInfoOcResponse savePolGenInfoOc(SavePolGenInfoOcRequest spgip) throws SQLException;
	public UpdatePolGenInfoResponse updatePolGenInfo(UpdatePolGenInfoRequest uppgif) throws SQLException;
	public RetrievePolFullCoverageResponse retrievePolFullCoverage(RetrievePolFullCoverageRequest rpcr) throws SQLException;
	public SavePolFullCoverageResponse savePolFullCoverage(SavePolFullCoverageRequest spfcr) throws SQLException;
	
	public PostPolicyResponse postPolicy(PostPolicyRequest ppr) throws SQLException;
	public GenHundredValPolPrintingResponse genHundredValPolPrinting(GenHundredValPolPrintingRequest ghvppr) throws SQLException;
	
	public ExtractExpiringPolicyResponse extractExpiringPolicy(ExtractExpiringPolicyRequest eepr) throws SQLException;
	public RetrieveExpPolListResponse retrieveExpPolList(RetrieveExpPolListRequest replr) throws SQLException;
	public RetrievePolDistResponse retrievePolDist(RetrievePolDistRequest rpcr) throws SQLException;
	
	public ProcessRenewablePolicyResponse processRenewablePolicy (ProcessRenewablePolicyRequest prpr) throws SQLException; 
	public RetrieveRiskDistributionResponse retrieveRiskDist(RetrieveRiskDistributionRequest rrdr) throws SQLException;
	public RetrievePoolDistributionResponse retrievePoolDist(RetrievePoolDistributionRequest rpdr) throws SQLException;
	public RetrieveDistCoInsResponse retrieveDistCoIns(RetrieveDistCoInsRequest rdcir) throws SQLException;

	public PostDistributionResponse postDistribution(PostDistributionRequest pdr) throws SQLException;
	public RetrievePoolDistributionResponse retrievePolPoolDist(RetrievePoolDistributionRequest rpdr) throws SQLException;

	public RetrievePolForPurgingResponse retrievePolForPurging(RetrievePolForPurgingRequest rpfpr)throws SQLException;
	public PurgeExpiringPolResponse purgeExpiryPol(PurgeExpiringPolRequest spfcr) throws SQLException;
	public SaveExpCovResponse saveExpCoverage(SaveExpCovRequest secr)throws SQLException;
}
