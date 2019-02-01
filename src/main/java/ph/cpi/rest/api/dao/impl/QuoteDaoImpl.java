package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.QuoteDao;
import ph.cpi.rest.api.model.Alop;
import ph.cpi.rest.api.model.quote.Endorsements;
import ph.cpi.rest.api.model.quote.EndorsementsOc;
import ph.cpi.rest.api.model.quote.Project;
import ph.cpi.rest.api.model.quote.QuotationGeneralInfo;

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
	public QuotationGeneralInfo retrieveQuoteGeneralInfo(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		QuotationGeneralInfo quoteGeneralInfo = sqlSession.selectOne("retrieveQuoteGeneralInfo", params);
		return quoteGeneralInfo;		
	}

	@Override
	public List<Endorsements> retrieveQuoteEndorsements(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Endorsements> endorsements = sqlSession.selectList("retrieveQuoteEndorsements", params);
		return endorsements;
	}

	@Override
	public EndorsementsOc retrieveQuoteEndorsementsOc(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		EndorsementsOc endorsementsOc = sqlSession.selectOne("retrieveQuoteEndorsementsOc", params);
		return endorsementsOc;
	}

	@Override
	public Project retrieveQuoteProject(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Project project = sqlSession.selectOne("retrieveQuoteProject",params);
		return project;
	}

	

	
	
}
