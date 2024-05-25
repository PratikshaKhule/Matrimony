package com.MatrimonyProject.Matrimony.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MatrimonyProject.Matrimony.Dao.DaoMatrimony;
import com.MatrimonyProject.Matrimony.Entity.Registration;

@Service
public class ServiceMatrimony {
	
	@Autowired
	DaoMatrimony dao;

	public String register(Registration member) {
		if (dao.register(member))
		{
			     return "User Registered Successfully❤️💘💞💟";
			     
		} else {
			      return "User Not Registerd 😞😞...Please Try Again❤️";
	    }
	
}

}
