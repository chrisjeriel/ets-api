package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.Alop;
import ph.cpi.rest.api.model.Quotation;
import ph.cpi.rest.api.model.quote.Competition;
import ph.cpi.rest.api.model.quote.ProjectOc;
import ph.cpi.rest.api.model.quote.QuotationOc;

public interface QuoteDao {
	
	
	public Alop retrieveQuoteAlop(final HashMap<String, Object> params) throws SQLException;
	public List<Alop> retrieveQuoteAlopList(final HashMap<String, Object> params) throws SQLException;
	public List<QuotationOc> retrieveQuoteAttachmentOcList(final HashMap<String, Object> params) throws SQLException;
	public List<Quotation> retrieveQuoteCompetitionList(final HashMap<String, Object> params) throws SQLException;
	public List<ProjectOc> retrieveQuoteCoverageOcList(final HashMap<String, Object> params) throws SQLException;
	
}
