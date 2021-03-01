package com.tech.Dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;
import com.tech.Pojo.AddressData;
import com.tech.Pojo.CustomerData;
import com.tech.Pojo.PersonalData;
import com.tech.Pojo.TotalData;
import com.tech.util.GenerateRandon;
import com.tech.util.HibernateSession;

public class RegisterDao {
	
	

	HibernateSession HbSession=new HibernateSession();
	Session session=HbSession.register();
	
	
@SuppressWarnings({ "unchecked", "rawtypes" })
public List register(TotalData data) {
	
	GenerateRandon random=new GenerateRandon();
	 Long adharno=random.generateRandom();
	  String adharnumber=String.valueOf(adharno);
	  
	  CustomerData customerData=new CustomerData();
	  PersonalData personalData=new PersonalData();
	  AddressData addressData=new AddressData();
	  
	  customerData.setAdharno(adharnumber);
	  customerData.setPhoneno(data.getPhoneno());
	  personalData.setCustomerdata(customerData);
	  personalData.setDob(data.getDob());
	  personalData.setEmail(data.getEmail());
	  personalData.setFirstname(data.getFirstname());
	  personalData.setLastname(data.getLastname());
	  personalData.setGender(data.getGender());
	  addressData.setPersonalData(personalData);
	  addressData.setAddress(data.getAddress());
	  addressData.setPincode(data.getPincode());
	  addressData.setState(data.getPincode());
	  
	List<TotalData> totalDatas = null;
		
	Transaction txt=session.beginTransaction();
	try {
	session.save(customerData);
	session.save(personalData);
	session.save(addressData);
	txt.commit();
	String number=customerData.getPhoneno();
	 totalDatas=geteDetailsphone(number);
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		session.close();
	}	
		return totalDatas;
	}
	
	

@SuppressWarnings({ "rawtypes", "deprecation" })
public List updateDetails(String number )  throws IndexOutOfBoundsException{
	
	Transaction txt=session.beginTransaction();
	
		
	Query query=session.createSQLQuery("SELECT  cd.adharno,cd.phoneno, cd2.Firstname,cd2.Lastname,cd2.Dob,cd2.Gender,cd2.email,cd3.pincode,cd3.Address,cd3.state FROM CustomerData1  cd JOIN CustomerData2  cd2 ON cd.adharno=cd2.customerdata_adharno JOIN Customerdata3  cd3 ON cd2.customerid=cd3.personalData_customerid WHERE adharno  ='"+number+"';");
	System.out.println(query.toString());
	
	query.setResultTransformer(Transformers.aliasToBean(TotalData.class));
	@SuppressWarnings("unchecked")
	List<TotalData> totalDatas= (List<TotalData>)query.list();
	
	
	   txt.commit();
	
	return totalDatas;
	
}


@SuppressWarnings({ "deprecation", "rawtypes" })
public List updateDetailsphone(String number ) throws IndexOutOfBoundsException {

Transaction txt=session.beginTransaction();


System.out.println(number);


Query query=session.createSQLQuery("SELECT cd.adharno, cd.phoneno, cd2.Firstname,cd2.Lastname,cd2.Dob,cd2.Gender,cd2.email,cd3.pincode,cd3.Address,cd3.state FROM CustomerData1  cd JOIN CustomerData2  cd2 ON cd.adharno=cd2.customerdata_adharno JOIN Customerdata3  cd3 ON cd2.customerid=cd3.personalData_customerid WHERE phoneno  ='"+number+"';");
System.out.println(query.toString());


query.setResultTransformer(Transformers.aliasToBean(TotalData.class));
@SuppressWarnings("unchecked")
List<TotalData> totalDatas= (List<TotalData>)query.list();
	

   txt.commit();

return totalDatas;

}




@SuppressWarnings({ "deprecation", "rawtypes" })
public List geteDetailsphone(String number ) throws IndexOutOfBoundsException {

Transaction txt=session.beginTransaction();


System.out.println(number);


Query query=session.createSQLQuery("SELECT  cd.adharno,cd.phoneno, cd2.Firstname,cd2.Lastname,cd2.Dob,cd2.Gender,cd2.email,cd3.pincode,cd3.Address,cd3.state FROM CustomerData1  cd JOIN CustomerData2  cd2 ON cd.adharno=cd2.customerdata_adharno JOIN Customerdata3  cd3 ON cd2.customerid=cd3.personalData_customerid WHERE phoneno  ='"+number+"';");
System.out.println(query.toString());


query.setResultTransformer(Transformers.aliasToBean(TotalData.class));
@SuppressWarnings("unchecked")
List<TotalData> totalDatas= (List<TotalData>)query.list();
	
   txt.commit();

return totalDatas;

}

public int  updateddetails(TotalData data) {
	  
	
	int count=0;
	Transaction txt=session.beginTransaction();
	  
	     String firstname=data.getFirstname();
	     String Phoneno=data.getPhoneno();
		 String Lastname=data.getLastname();
		 String Address=data.getAddress();
		 String State=data.getState();
		 String Pincode=data.getPincode();
		 String Email=data.getEmail();
		 String Dob=data.getDob();
		 String adhar=data.getAdharno();
		 
		 try {
	 @SuppressWarnings("rawtypes")
	Query query=session.createSQLQuery("UPDATE CustomerData1 cd "
	 		+ " JOIN CustomerData2  cd2 ON cd.adharno=cd2.customerdata_adharno "
	 		+ " JOIN Customerdata3  cd3 ON cd2.customerid=cd3.personalData_customerid "
	 		+ " SET cd.phoneno='"+Phoneno+"',cd2.Firstname='"+firstname+"',cd2.Lastname='"+Lastname+"',cd2.Dob='"+Dob+"',cd2.email='"+Email+"',cd3.pincode='"+Pincode+"',cd3.Address='"+Address+"',cd3.state='"+State+"'"
	 		+ " WHERE cd.adharno ='"+adhar+"'");
	  
	  count=query.executeUpdate();
	  txt.commit();
	  System.out.println(count+" dao count");
		 }catch (Exception e) {
			e.printStackTrace();
		}
		 finally {
			session.close();
		}
	  return count;
	  
}

}

