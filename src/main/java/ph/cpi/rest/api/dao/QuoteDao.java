package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.quote.Alop;
import ph.cpi.rest.api.model.quote.Endorsements;
import ph.cpi.rest.api.model.quote.EndorsementsOc;
import ph.cpi.rest.api.model.quote.Project;
import ph.cpi.rest.api.model.quote.Quotation;
import ph.cpi.rest.api.model.quote.QuotationGeneralInfo;
import ph.cpi.rest.api.model.quote.QuotationOc;

public interface QuoteDao {
	
	
//	public Alop retrieveQuoteAlop(final HashMap<String, Object> params) throws SQLException;
//	public List<Alop> retrieveQuoteAlopList(final HashMap<String, Object> params) throws SQLException;
	public List<Quotation> retrieveQuoteListing(final HashMap<String, Object> params) throws SQLException;
	public List<QuotationOc> retrieveQuoteListingOc(final HashMap<String, Object> params) throws SQLException;
	public Quotation retrieveQuoteOption(final HashMap<String, Object> params) throws SQLException;
	public Quotation retrieveQuoteCoverage(final HashMap<String, Object> params) throws SQLException;
	public QuotationOc retrieveQuoteDetailsOc(final HashMap<String, Object> params) throws SQLException;
	public Quotation retrieveQuoteDetails(final HashMap<String, Object> params) throws SQLException;
	public Quotation retrieveQuoteHoldCover(final HashMap<String, Object> params) throws SQLException;
	public List<QuotationOc> retrieveQuoterGeneralInfoOc(final HashMap<String, Object> params) throws SQLException;
	public List<Quotation> retrieveQuoteHoldCoverListing(final HashMap<String, Object> params) throws SQLException;

	public List<QuotationOc> retrieveQuoteAttachmentOcList(final HashMap<String, Object> params) throws SQLException;
	public List<Quotation> retrieveQuoteCompetitionList(final HashMap<String, Object> params) throws SQLException;
	public QuotationOc retrieveQuoteCoverageOc(final HashMap<String, Object> params) throws SQLException;
	
	public Quotation retrieveQuoteAlop(final HashMap<String, Object> params) throws SQLException;
	public List<Quotation> retrieveQuoteAttachmentList(final HashMap<String, Object> params) throws SQLException;
	public List<Quotation> retrieveAlopItemList(final HashMap<String, Object> params ) throws SQLException;
	public Integer saveQuoteAttachment(final HashMap<String, Object> params) throws SQLException;
	public Integer saveQuoteAlop(final HashMap<String, Object> params) throws SQLException;
	public Integer saveQuoteAlopItem(final HashMap<String, Object> params) throws SQLException;
	
	public Integer saveQuoteAttachmentOc(final HashMap<String, Object> params) throws SQLException;
	public Integer saveQuoteCoverage(final HashMap<String, Object> params ) throws SQLException;
	public Integer saveQuoteCoverageOc(final HashMap<String, Object> params ) throws SQLException;

//	public Alop retrieveQuoteAlop(final HashMap<String, Object> params) throws SQLException;
//	public List<Alop> retrieveQuoteAlopList(final HashMap<String, Object> params) throws SQLException;
	public QuotationGeneralInfo retrieveQuoteGeneralInfo(final HashMap<String, Object> params) throws SQLException;
	public List<Endorsements> retrieveQuoteEndorsements(final HashMap<String, Object> params) throws SQLException;
	public EndorsementsOc retrieveQuoteEndorsementsOc(final HashMap<String, Object> params) throws SQLException;
	public Project retrieveQuoteProject(final HashMap<String, Object> params) throws SQLException;
	public Integer saveQuoteGeneralInfo(final HashMap<String, Object> params) throws SQLException;
	public Integer saveQuoteCompetition(final HashMap<String, Object> params) throws SQLException;
	
	public Integer saveQuoteHoldCover(final HashMap<String, Object> params) throws SQLException;
	public Integer saveQuoteEndorsements(final HashMap<String, Object> params) throws SQLException;
	public Integer saveQuoteEndorsementsOc(final HashMap<String, Object> params) throws SQLException;

}
