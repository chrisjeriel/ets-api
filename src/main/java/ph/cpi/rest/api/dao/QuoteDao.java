package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.quote.Alop;
import ph.cpi.rest.api.model.quote.Quotation;
import ph.cpi.rest.api.model.quote.QuotationOc;
import ph.cpi.rest.api.model.AlopSample;
import ph.cpi.rest.api.model.quote.Quotation;

public interface QuoteDao {
	
	
	public Alop retrieveQuoteAlop(final HashMap<String, Object> params) throws SQLException;
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
	public List<QuotationOc> retrieveQuoteCoverageOcList(final HashMap<String, Object> params) throws SQLException;
	
	public List<Quotation> retrieveQuoteAlopList(final HashMap<String, Object> params) throws SQLException;
	public List<Quotation> retrieveQuoteAttachmentList(final HashMap<String, Object> params) throws SQLException;
	public List<Quotation> retrieveAlopItemList(final HashMap<String, Object> params ) throws SQLException;
	
}
