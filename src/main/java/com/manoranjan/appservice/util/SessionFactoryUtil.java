package com.manoranjan.appservice.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.manoranjan.appservice.entity.ApplicationEntity;
import com.manoranjan.appservice.entity.BankAccount;
import com.manoranjan.appservice.entity.Customer;
import com.manoranjan.appservice.entity.RegistrationDetails;
import com.manoranjan.appservice.entity.VehicleEntity;

public class SessionFactoryUtil {
	private static SessionFactory sessionFactory = null;
	static {
		Configuration cfg = new Configuration();
		cfg.setProperties(MysqlConnectionPropertiesUtil.getConnectionProperties());
		cfg.addAnnotatedClass(ApplicationEntity.class);
		cfg.addAnnotatedClass(VehicleEntity.class);
		cfg.addAnnotatedClass(RegistrationDetails.class);
        cfg.addAnnotatedClass(Customer.class);
        cfg.addAnnotatedClass(BankAccount.class);
		sessionFactory = cfg.buildSessionFactory();

	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}
}
