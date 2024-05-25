package com.MatrimonyProject.Matrimony.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.MatrimonyProject.Matrimony.Entity.Registration;

@Repository
public class DaoMatrimony {
	
	@Autowired
	SessionFactory factory;

	public boolean register(Registration member) {
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(member);
		tr.commit();
		return true;
	}

}
