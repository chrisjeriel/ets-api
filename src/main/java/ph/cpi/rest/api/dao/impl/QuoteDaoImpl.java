package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.QuoteDao;
import ph.cpi.rest.api.model.Alop;
import ph.cpi.rest.api.model.Quotation;
import ph.cpi.rest.api.model.quote.Attachment;
import ph.cpi.rest.api.model.quote.Competition;
import ph.cpi.rest.api.model.quote.CoverageOc;
import ph.cpi.rest.api.model.quote.ProjectOc;
import ph.cpi.rest.api.model.quote.QuotationOc;

@Component
public class QuoteDaoImpl implements QuoteDao{

	@Autowired
	private SqlSession sqlSession;

	@Override
	public Alop retrieveQuoteAlop(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Alop alop = sqlSession.selectOne("retrieveQuoteAlopSample", params);
		return alop;
	}

	@Override
	public List<Alop> retrieveQuoteAlopList(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Alop> alopList = sqlSession.selectList("retrieveQuoteAlopSample", params);
		return alopList;
	}
	
	@Override
	public List<QuotationOc> retrieveQuoteAttachmentOcList(final HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<QuotationOc> attachmentOcList = sqlSession.selectList("retrieveQuoteAttachmentOc", params);
		return attachmentOcList;
	}
	
	@Override
	public List<Quotation> retrieveQuoteCompetitionList(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Quotation> competitionList = sqlSession.selectList("retrieveQuoteCompetition", params);
		return competitionList;
	}
	
	@Override
	public List<QuotationOc> retrieveQuoteCoverageOcList(final HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<QuotationOc> projectOc = sqlSession.selectList("retrieveQuoteCoverageOc", params);
		return projectOc;
	}
}
