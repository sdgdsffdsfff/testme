package com.alibaba.testme.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.alibaba.testme.dao.SystemRequirePropDao;
import com.alibaba.testme.domain.dataobject.SystemRequirePropDO;

/**
 * SystemRequireProp Dao Implement
 * 
 * @author xiaopenzi
 */
public class SystemRequirePropDaoImpl extends SqlMapClientDaoSupport implements
        SystemRequirePropDao {

    /**
     * @param systemRequirePropDO
     * @return
     */
    @Override
    public Long addSystemRequirePropDO(SystemRequirePropDO systemRequirePropDO) {
        return (Long) this.getSqlMapClientTemplate().insert("systemRequireProp.add",
                systemRequirePropDO);
    }

    /**
     * @param systemRequirePropDO
     * @return
     */
    @Override
    public int updateSystemRequirePropDO(SystemRequirePropDO systemRequirePropDO) {
        Integer result = (Integer) this.getSqlMapClientTemplate().update(
                "systemRequireProp.update", systemRequirePropDO);
        if (result == null) {
            return 0;
        }

        return result;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public int deleteSystemRequirePropDO(Long id) {
        Integer result = (Integer) this.getSqlMapClientTemplate().delete(
                "systemRequireProp.deleteById", id);
        if (result == null) {
            return 0;
        }
        return result;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public SystemRequirePropDO findById(Long id) {
        return (SystemRequirePropDO) this.getSqlMapClientTemplate().queryForObject(
                "systemRequireProp.findById", id);
    }

    /**
     * @param id
     * @return
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<SystemRequirePropDO> findList(SystemRequirePropDO systemRequirePropDO) {
        return (List<SystemRequirePropDO>) this.getSqlMapClientTemplate().queryForList(
                "systemRequireProp.findList", systemRequirePropDO);
    }

}