package com.manoranjan.appservice.repository;


import java.util.List;


import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manoranjan.appservice.entity.ApplicationEntity;
import com.manoranjan.appservice.util.SessionFactoryUtil;



public class AppHqlRepository {
 private SessionFactory sessionfactory;
private Object applicationName;

public  List<ApplicationEntity>findAll() {
	
 StringBuilder builder=new StringBuilder();
 builder.append("from ApplicationEntity");
 SessionFactory sessionfactory=SessionFactoryUtil.getSessionfactory();
Session session =sessionfactory.openSession();
 Query query=session.createQuery(builder.toString());
 return query.getResultList();
 }
public  ApplicationEntity findByAppName(String appName) {
	 StringBuilder stringBuilder = new StringBuilder();
	 stringBuilder.append(" from applicationEntity where ");
	 stringBuilder.append(" applicationName=:appName");
	 SessionFactory sessionfactory=SessionFactoryUtil.getSessionfactory();
	 Session session=sessionfactory.openSession();
	 Query query=session.createQuery(stringBuilder.toString());
	 query.setParameter("appName", applicationName);
	return (ApplicationEntity)query.uniqueResult();
	 //query.getResultList();
}
 public void updateUrlByAppName(String url,String appName) {
	 StringBuilder stringBuilder = new StringBuilder();
	 stringBuilder.append(" update Application set ");
	 stringBuilder.append(" url=u: where applicationName=:appName");
	 SessionFactory sessionfactory = SessionFactoryUtil.getSessionfactory();
	 Session session=sessionfactory.openSession();
	Transaction transaction=session.beginTransaction();
	 Query query=session.createQuery(stringBuilder.toString());
	 query.setParameter("appName", appName);
	 query.setParameter("u", url);
	 query.executeUpdate();
	 transaction.commit();
	
 }
 public void DeleteByAppName(String appName) {
	 StringBuilder stringBuilder = new StringBuilder();
	 stringBuilder.append(" delete from ApplicationEntity");
	 stringBuilder.append(" where applicationName=:appName");
	 SessionFactory sessionfactory = SessionFactoryUtil.getSessionfactory();
	 Session session=sessionfactory.openSession();
		Transaction transaction=session.beginTransaction();
		 Query query=session.createQuery(stringBuilder.toString());
		 query.setParameter("appName", appName);
		 query.executeUpdate();
		 transaction.commit();
 }

}
