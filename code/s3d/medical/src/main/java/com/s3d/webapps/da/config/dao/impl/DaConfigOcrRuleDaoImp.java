package com.s3d.webapps.da.config.dao.impl;

import org.springframework.stereotype.Repository;

import com.s3d.webapps.common.dao.BaseDaoImp;
import com.s3d.webapps.da.config.dao.IDaConfigOcrRuleDao;
import com.s3d.webapps.da.config.persistence.DaConfigOcrRule;
import com.s3d.webapps.framework.spring.annotation.ChildOf;

/**
 * OCR规则数据访问接口实现
 * 
 * @author 
 * @version 1.0 2014-08-15
 */
@ChildOf(parent="BaseDao")
@Repository
public class DaConfigOcrRuleDaoImp extends BaseDaoImp implements IDaConfigOcrRuleDao {
	@Override
	public String getModelName() {
		return DaConfigOcrRule.class.getName();
	}
}
