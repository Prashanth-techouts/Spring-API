package com.tech.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tech.Dao.RegisterDao;
import com.tech.Pojo.CustomerData;
import com.tech.Pojo.TotalData;


@RestController
public class MainController {

@PostMapping("/getDetails")
public List<?> getAdharDetails(@RequestBody CustomerData customerData ) throws IndexOutOfBoundsException {
	
	  RegisterDao registerDao=new RegisterDao();
	  System.out.println(customerData.toString());
	  
	  @SuppressWarnings("unchecked") List<TotalData>
	  totaldata=registerDao.updateDetails(customerData.getAdharno());
	  
	  System.out.println(totaldata.size());
	  
	  return totaldata;
	
}

@RequestMapping(value="/getdetailsphone",method = RequestMethod.POST )
public List getAdharDetailsphone(@RequestBody CustomerData customerData ) throws IndexOutOfBoundsException {
	
	
	RegisterDao registerDao=new RegisterDao();
	 
	 @SuppressWarnings("unchecked")
	List<TotalData> totaldata=registerDao.geteDetailsphone(customerData.getPhoneno() );
	 
	 

	return totaldata;

}

@RequestMapping(value="/update",method = RequestMethod.POST) 
  public List getUpdateDetails(@RequestBody CustomerData customerData ) throws IndexOutOfBoundsException { 
	  
	  
  
  RegisterDao registerDao=new RegisterDao();
 
 @SuppressWarnings("unchecked")
List<TotalData> totaldata=registerDao.updateDetails(customerData.getAdharno() );
  
 
	return totaldata;
 
  }
  
  
 @RequestMapping(value="/updatephone",method = RequestMethod.POST) 
 public List getUpdateDetailsphone(@RequestBody CustomerData customerData ) throws IndexOutOfBoundsException { 
	  
	  
  
  RegisterDao registerDao=new RegisterDao();
 
 @SuppressWarnings("unchecked")
List<TotalData> totaldata=registerDao.updateDetailsphone(customerData.getPhoneno());
  
	return totaldata;
  }
  
  
  
	
@SuppressWarnings("unchecked")	 	  
@PostMapping("/register")
public List doRegistartion(@RequestBody TotalData data) {
	  
 System.out.println(data.toString());
 RegisterDao registerDao=new RegisterDao();
	  
	System.out.println(data.getPhoneno()+data.getFirstname()+" "+data.getState());
	  
List<TotalData> totaldata =registerDao.register(data);
	  
	 return totaldata;  
	  }
	 
  
 
 @RequestMapping(value="updateddetails",method = RequestMethod.POST)
 public String updateddetails(@RequestBody  TotalData data) {
	  String msg=null;
	  	  
	  RegisterDao registerDao=new RegisterDao();
	  int count=registerDao.updateddetails(data);
	  System.out.println(count+" Controller count");
	  if (count==3) {
		   msg="Updated Succesfully";
		  	
	  }
	  
	  else {
	   msg="Sorry Failed to Update please try again..";
	 
	  }
	return msg;
	  
	  
  }  

}
