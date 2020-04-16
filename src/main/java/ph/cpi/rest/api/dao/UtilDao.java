package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.utils.ACITR063A;
import ph.cpi.rest.api.model.utils.CLMR010A;
import ph.cpi.rest.api.model.utils.CLMR010B;
import ph.cpi.rest.api.model.utils.CLMR010C;
import ph.cpi.rest.api.model.utils.CLMR010D;
import ph.cpi.rest.api.model.utils.CLMR010E;
import ph.cpi.rest.api.model.utils.CLMR010F;
import ph.cpi.rest.api.model.utils.CLMR010G;
import ph.cpi.rest.api.model.utils.CLMR010H;
import ph.cpi.rest.api.model.utils.CLMR010I;
import ph.cpi.rest.api.model.utils.CLMR010J;
import ph.cpi.rest.api.model.utils.CLMR010K;
import ph.cpi.rest.api.model.utils.CLMR010L;
import ph.cpi.rest.api.model.utils.CLMR010M;
import ph.cpi.rest.api.model.utils.CLMR010N;
import ph.cpi.rest.api.model.utils.CLMR010O;
import ph.cpi.rest.api.model.utils.CLMR010P;
import ph.cpi.rest.api.model.utils.CLMR010Q;
import ph.cpi.rest.api.model.utils.CLMR010R;
import ph.cpi.rest.api.model.utils.CLMR010S;
import ph.cpi.rest.api.model.utils.CLMR010T;
import ph.cpi.rest.api.model.utils.CLMR010U;
import ph.cpi.rest.api.model.utils.CLMR010V;
import ph.cpi.rest.api.model.utils.CLMR010W;
import ph.cpi.rest.api.model.utils.CLMR010X;
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
import ph.cpi.rest.api.model.utils.POLR044OA;
import ph.cpi.rest.api.model.utils.POLR044OB;
import ph.cpi.rest.api.model.utils.POLR044P;
import ph.cpi.rest.api.model.utils.POLR044Q;
import ph.cpi.rest.api.model.utils.POLR044R;
import ph.cpi.rest.api.model.utils.POLR044S;
import ph.cpi.rest.api.model.utils.POLR044T;
import ph.cpi.rest.api.model.utils.POLR044W;
import ph.cpi.rest.api.model.utils.POLR044X;
import ph.cpi.rest.api.model.utils.POLR044Y;
import ph.cpi.rest.api.model.utils.POLR052A;
import ph.cpi.rest.api.model.utils.POLR052B;
import ph.cpi.rest.api.model.utils.POLR052C;
import ph.cpi.rest.api.model.utils.POLR052D;
import ph.cpi.rest.api.model.utils.POLR052E;
import ph.cpi.rest.api.model.utils.POLR052F;
import ph.cpi.rest.api.model.utils.POLR052G;
import ph.cpi.rest.api.model.utils.POLR052H;
import ph.cpi.rest.api.model.utils.POLR052I;

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
	public List<POLR044M> retrievePolR044m(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044N> retrievePolR044n(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044O> retrievePolR044o(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044OA> retrievePolR044oa(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044OB> retrievePolR044ob(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044P> retrievePolR044p(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044Q> retrievePolR044q(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044R> retrievePolR044r(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044S> retrievePolR044s(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044T> retrievePolR044t(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044W> retrievePolR044w(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044X> retrievePolR044x(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR044Y> retrievePolR044y(final HashMap<String, Object> params ) throws SQLException;
	
	public List<POLR052A> retrievePolR052a(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR052B> retrievePolR052b(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR052C> retrievePolR052c(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR052D> retrievePolR052d(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR052E> retrievePolR052e(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR052F> retrievePolR052f(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR052G> retrievePolR052g(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR052H> retrievePolR052h(final HashMap<String, Object> params ) throws SQLException;
	public List<POLR052I> retrievePolR052i(final HashMap<String, Object> params ) throws SQLException;
	
	public List<CLMR010A> retrieveClmR010a(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010B> retrieveClmR010b(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010C> retrieveClmR010c(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010D> retrieveClmR010d(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010H> retrieveClmR010h(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010E> retrieveClmR010e(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010F> retrieveClmR010f(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010G> retrieveClmR010g(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010I> retrieveClmR010i(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010J> retrieveClmR010j(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010K> retrieveClmR010k(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010L> retrieveClmR010l(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010M> retrieveClmR010m(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010N> retrieveClmR010n(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010O> retrieveClmR010o(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010P> retrieveClmR010p(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010Q> retrieveClmR010q(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010R> retrieveClmR010r(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010S> retrieveClmR010s(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010T> retrieveClmR010t(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010U> retrieveClmR010u(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010V> retrieveClmR010v(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010W> retrieveClmR010w(final HashMap<String, Object> params ) throws SQLException;
	public List<CLMR010X> retrieveClmR010x(final HashMap<String, Object> params ) throws SQLException;
	
	public List<ACITR063A> retrieveAcitR063a(final HashMap<String, Object> params ) throws SQLException;
}
