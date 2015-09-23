/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.refme.refme_server_prototype.dao;

import org.hibernate.SessionFactory;
import org.refme.refme_server_prototype.hib_pojo.RefererProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author prashant
 */
@Transactional
@Repository
public class RefererProfileDAOImpl implements RefererProfileDAO {

    @Autowired
    SessionFactory sessionFactory;
    
    
    @Override
    public RefererProfile getRefererProfile(Integer refererId) {   
        return (RefererProfile) sessionFactory.getCurrentSession().get(RefererProfile.class, refererId);  
    }

    @Override
    public void setRefererProfile(RefererProfile refererProfile) {
     sessionFactory.getCurrentSession().save(refererProfile);  
    }
    
    
    
}
