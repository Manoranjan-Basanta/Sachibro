package com.manoranjan.appservice.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manoranjan.appservice.entity.VehicleEntity;
import com.manoranjan.appservice.util.SessionFactoryUtil;

public class AssosiationRepository {
public void saveVehicleDetails(VehicleEntity vehicle) {
	 SessionFactory sessionfactory = SessionFactoryUtil.getSessionfactory();
	 Session session=sessionfactory.openSession();
	Transaction transaction=session.beginTransaction();
	session.merge(vehicle);
	transaction.commit();
}
}