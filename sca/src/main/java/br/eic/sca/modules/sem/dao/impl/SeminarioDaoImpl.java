package br.eic.sca.modules.sem.dao.impl;

import org.springframework.stereotype.Repository;

import br.eic.sca.api.dao.impl._DaoHibernateAbstract;
import br.eic.sca.modules.sem.dao.SeminarioDao;
import br.eic.sca.modules.sem.domain.Seminario;

@Repository
public class SeminarioDaoImpl extends _DaoHibernateAbstract<Seminario> implements SeminarioDao
{
	@Override
	public Class<Seminario> getEntityClass() 
	{
		return Seminario.class;
	}
}
