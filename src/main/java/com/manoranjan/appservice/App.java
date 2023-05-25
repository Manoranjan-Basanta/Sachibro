package com.manoranjan.appservice;

import java.util.ArrayList;
import java.util.List;

import com.manoranjan.appservice.entity.BankAccount;
import com.manoranjan.appservice.repository.AppHqlRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		/*
		 * ApplicationEntity applicationEntity=new ApplicationEntity();
		 * applicationEntity.setApplicationName("snapchat");
		 * applicationEntity.setUrl("https://www.snapchat.com");
		 * applicationEntity.setUserName("shoaib");
		 * applicationEntity.setPassword("password");
		 * applicationEntity.setApplicationType("Govt app");
		 */
       
       //ApplicationRepository repository=new ApplicationRepository();
       //repository.saveOrUpdateApplicationDetails(applicationEntity);
      // ApplicationEntity applicationEntity2=repository.getById(124);
      // System.out.println(applicationEntity2);
       
       AppHqlRepository appHqlRepository=new AppHqlRepository();
       //List<ApplicationEntity>appList=appHqlRepository.findAll();
      // appList.forEach(each->{
    	//   System.out.println(each);
       //});
    

      // List<ApplicationEntity>collect=appList.stream().filter(each->
       //  each.getApplication().equalsIgnoreCase("instagram").collect(Collectors.toList()));
       //  ApplicationEntity entity=appList.stream().filter(each->each.getApplicationName().equalsIgnoreCase("instagram")).findAny().orElse(null);
    //    }
      // ApplicationEntity findByName=appHqlRepository.findByAppName("instagram");
      // System.out.println(findByName);
      // appHqlRepository.updateUrlByAppName("www.new instagram","instagram");
       //appHqlRepository.DeleteByAppName("snapchat");
		/*
		 * VehicleEntity vehicle= new VehicleEntity(); vehicle.setName("tata nexon");
		 * vehicle.setPrice(1000000.00); vehicle.setEngineNumber("fhfdhhf");
		 * vehicle.setModelNumber("14ghjfg");
		 * 
		 * RegistrationDetails details=new RegistrationDetails();
		 * details.setRegDate("10-2-2024"); details.setRegNumber("gfhfh");
		 * 
		 * vehicle.setDetails(details);
		 * 
		 * AssosiationRepository repository2=new AssosiationRepository();
		 * repository2.saveVehicleDetails(vehicle) ;
		 */
     List<BankAccount>list=new ArrayList<BankAccount>();
     
     
}  
    
}

