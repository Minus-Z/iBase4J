/**
 * 
 */
package org.ibase4j.sys;

import static org.apache.logging.log4j.LogManager.getLogger;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.Logger;
import org.ibase4j.service.sys.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageInfo;

/**
 * 
 * @author ShenHuaJie
 * @version 2016年4月9日 下午12:52:09
 */
@ComponentScan
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:Spring-db.xml", "classpath:Spring-mybatis.xml",
		"classpath:Spring-redis.xml" })
public class SysUserServiceTest {
	private Logger logger = getLogger();
	@Autowired
	SysUserService sysUserService;

	@Test
	public void testEmptyCollection() {
		PageInfo<Map<String, Object>> page = sysUserService.query(new HashMap<String, Object>());
		logger.info(page);
	}
}