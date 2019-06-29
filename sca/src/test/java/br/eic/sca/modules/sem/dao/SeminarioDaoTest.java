package br.eic.sca.modules.sem.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.eic.sca.modules.sem.domain.Seminario;
import br.eic.sca.modules.sem.dao.SeminarioDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
({
	"file:src/main/webapp/WEB-INF/spring-servlet.xml"
})

public class SeminarioDaoTest {
	@Autowired
	SeminarioDao semDao;
		
	@Test
	public void testDao()
	{
		Assert.assertNotNull(semDao);
		
		List<Seminario> tsems = semDao.retrieveAll();
		
		Assert.assertFalse(tsems.isEmpty());
		
		for (Seminario tsem : tsems)
		{
			System.out.println(tsem);
		}
	}
}
