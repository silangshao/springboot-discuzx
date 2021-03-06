package com.xstudio.discuzx.ultrax.service.impl;

import com.xstudio.discuzx.config.AbstractSecurityMybatisPageHelperServiceImpl;
import com.xstudio.discuzx.ultrax.mapper.CommonAdmingroupMapper;
import com.xstudio.discuzx.ultrax.model.CommonAdmingroup;
import com.xstudio.discuzx.ultrax.service.ICommonAdmingroupService;
import com.xstudio.spring.mybatis.pagehelper.IMybatisPageHelperDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * service implements for table pre_common_admingroup
 * 
 * @author mybatis generator
 * @version Sun Oct 06 19:53:14 CST 2019
 */
@Service
public class CommonAdmingroupServiceImpl extends AbstractSecurityMybatisPageHelperServiceImpl<CommonAdmingroup, Short> implements ICommonAdmingroupService {
    @Autowired
    private CommonAdmingroupMapper commonAdmingroupMapper;

    @Override
    public IMybatisPageHelperDao getRepositoryDao() {
        return this.commonAdmingroupMapper;
    }

    @Override
    public void setDefaults(CommonAdmingroup record) {
        // todo
        
    }
}