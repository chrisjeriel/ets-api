package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.MaintenanceDao;
import ph.cpi.rest.api.model.Alop;
import ph.cpi.rest.api.model.maintenance.Cession;
import ph.cpi.rest.api.model.maintenance.Risk;
import ph.cpi.rest.api.model.maintenance.SectionCovers;

@Component
public class MaintenanceDaoImpl implements MaintenanceDao{

	@Autowired
	private SqlSession sqlSession;

	@Override
	public Alop retrieveQuoteAlop(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Alop alop = sqlSession.selectOne("retrieveMaintenanceSample", params);
		return alop;
	}

	@Override
	public List<Alop> retrieveQuoteAlopList(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Alop> alopList = sqlSession.selectList("retrieveMaintenanceSample", params);
		return alopList;
	}

	@Override
	public Risk retrieveMtnRisk(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Risk risk = sqlSession.selectOne("retrieveMtnRisk", params);
		return risk;
	}
	
	@Override
	public List<Risk> retrieveMtnRiskListing(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Risk> riskList = sqlSession.selectList("retrieveMtnRiskListing", params);
		return riskList;
	}

	@Override
	public SectionCovers retrieveSectionCovers(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		SectionCovers sectionCovers = sqlSession.selectOne("retrieveMtnSectionCovers", params);
		return sectionCovers;
	}

	@Override
	public Cession retrieveTypeOfCession(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Cession cession = sqlSession.selectOne("retrieveMtnTypeOfCession", params);
		return cession;
	}

}
