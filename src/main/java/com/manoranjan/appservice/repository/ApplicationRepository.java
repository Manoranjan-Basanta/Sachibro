package com.manoranjan.appservice.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.manoranjan.appservice.dto.ApplicationDto;
import com.manoranjan.appservice.entity.ApplicationEntity;
import com.manoranjan.appservice.util.MysqlConnectionPropertiesUtil;
import com.manoranjan.appservice.util.SessionFactoryUtil;

public class  ApplicationRepository {
public  void saveOrUpdateApplicationDetails(ApplicationEntity applicationEntity) {
  //Configuration	cfg=new Configuration();
	//cfg.setProperties(MysqlConnectionPropertiesUtil.getConnectionProperties());
	//cfg.addAnnotatedClass(ApplicationEntity.class);
	SessionFactory sessionfactory=SessionFactoryUtil.getSessionfactory();
    Session session=sessionfactory.openSession();
	Transaction transaction = session.beginTransaction();
	session.merge(applicationEntity);
	transaction.commit();
}
   public ApplicationEntity getById(long id) {
	  SessionFactory sessionfactory=SessionFactoryUtil.getSessionfactory();
	  Session session=sessionfactory.openSession();
	  return session.get(ApplicationEntity.class,id);
	  
	  
   }
   public void update(ApplicationDto applicationDto) {
	  ApplicationEntity applicationEntity=getById(applicationDto.getAltkey());
	  if(applicationEntity !=null) {
	  applicationEntity.setUserName(applicationDto.getUserName());
	  applicationEntity.setPassword(applicationDto.getPassword());
	  saveOrUpdateApplicationDetails(applicationEntity);
	  
    }
  }
}