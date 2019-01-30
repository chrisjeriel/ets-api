package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.MaintenanceDao;
import ph.cpi.rest.api.model.AlopSample;
import ph.cpi.rest.api.model.maintenance.AdviceWordings;
import ph.cpi.rest.api.model.maintenance.Block;
import ph.cpi.rest.api.model.maintenance.CedingCompany;
import ph.cpi.rest.api.model.maintenance.Region;

@Component
public class MaintenanceDaoImpl implements MaintenanceDao{

	@Autowired
	private SqlSession sqlSession;

	/*@Override
	public AlopSample retrieveQuoteAlop(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		AlopSample alop = sqlSession.selectOne("retrieveMaintenanceSample", params);
		return alop;
	}

	@Override
	public List<AlopSample> retrieveQuoteAlopList(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<AlopSample> alopList = sqlSession.selectList("retrieveMaintenanceSample", params);
		return alopList;
	}*/


	@Override
	public List<AdviceWordings> retrieveMaintenanceAdviceWordings(HashMap<String, Object> params) throws SQLException {
		List<AdviceWordings> adviceWordingsList = sqlSession.selectList("retMtnAdviceWordings", params);
		return adviceWordingsList;
	}

	@Override
	public List<Region> retrieveMaintenanceBlockList(HashMap<String, Object> params) throws SQLException {
			List<Region> blockList = sqlSession.selectList("retrieveMtnBlock",params);
		return blockList;
	}

	@Override
	public List<CedingCompany> retrieveMaintenanceCedingCompanyList(HashMap<String, Object> params) throws SQLException {
			List<CedingCompany> cedingCompanyListing = sqlSession.selectList("retMtnCedingCompanyListing", params);
		return cedingCompanyListing;
	}

	@Override
	public List<CedingCompany> retrieveMaintenanceCedingCompany(HashMap<String, Object> params) throws SQLException {
			List<CedingCompany> cedingCompany = sqlSession.selectList("retMtnCedingCompany",params);
		return cedingCompany;
	}
	



	/*@Override
	public CedingCompany retrieveMaintenanceCedingCompany(HashMap<String, Object> params) throws SQLException {
		CedingCompany cedingCompany = sqlSession.selectOne("retrieveMaintenanceCedingCompany",params);
		return cedingCompany;
	}

	@Override
	public List<CedingCompany> retrieveMaintenanceCedingCompanyList(HashMap<String, Object> params)
			throws SQLException {
		List<CedingCompany> cedingCompanyList = sqlSession.selectList("retrieveMaintenanceCedingCompany", params);
		return cedingCompanyList;
	}*/


	

}
