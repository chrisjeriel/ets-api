package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.utils.POLR044A;
import ph.cpi.rest.api.model.utils.POLR044B;
import ph.cpi.rest.api.model.utils.POLR044C;
import ph.cpi.rest.api.model.utils.POLR044D;
import ph.cpi.rest.api.model.utils.POLR044E;
import ph.cpi.rest.api.model.utils.POLR044F;
import ph.cpi.rest.api.model.utils.POLR044G;
import ph.cpi.rest.api.model.utils.POLR044H;
import ph.cpi.rest.api.model.utils.POLR044I;
import ph.cpi.rest.api.model.utils.POLR044J;
import ph.cpi.rest.api.model.utils.POLR044K;
import ph.cpi.rest.api.model.utils.POLR044L;
import ph.cpi.rest.api.model.utils.POLR044M;
import ph.cpi.rest.api.model.utils.POLR044N;
import ph.cpi.rest.api.model.utils.POLR044O;
import ph.cpi.rest.api.model.utils.POLR044P;
import ph.cpi.rest.api.model.utils.POLR044Q;
import ph.cpi.rest.api.model.utils.POLR044R;
import ph.cpi.rest.api.model.utils.POLR044S;
import ph.cpi.rest.api.model.utils.POLR044T;

public interface UtilDao {
	
	public Integer extractReport(final HashMap<String, Object> params) throws SQLException;
	public String getReportFileName(final HashMap<String, Object> params) throws SQLException;
	public String getReportPath() throws SQLException;
	
	public List<POLR044E> retrievePolR044e(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044A> retrievePolR044a(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044B> retrievePolR044b(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044C> retrievePolR044c(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044D> retrievePolR044d(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044F> retrievePolR044f(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044G> retrievePolR044g(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044H> retrievePolR044h(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044I> retrievePolR044i(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044J> retrievePolR044j(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044K> retrievePolR044k(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044L> retrievePolR044l(final HashMap<String, Object> params ) throws SQLException;
	//need to double check from this point below
	
	public List<POLR044M> retrievePolR044m(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044N> retrievePolR044n(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044O> retrievePolR044o(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044P> retrievePolR044p(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044Q> retrievePolR044q(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044R> retrievePolR044r(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044S> retrievePolR044s(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044T> retrievePolR044t(final HashMap<String, Object> params ) throws SQLException;
}
