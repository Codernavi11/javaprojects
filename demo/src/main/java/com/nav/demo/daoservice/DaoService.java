package com.nav.demo.daoservice;

import org.bson.Document;
import org.springframework.stereotype.Repository;

import com.mongodb.client.MongoCollection;
import com.nav.demo.mongodb.DbConnector;
import com.nav.model.Employee;

@Repository("dao")
public class DaoService {

	public String register(Employee e) {
		String str=null;
		
		if(e!=null) {
			DbConnector d=new DbConnector();
			MongoCollection<Document> c=d.getCollection();
			 Document document = new Document("title", "MongoDB") 
				      .append("employeeId",e.getEmployeeId())
				      .append("employeeName", e.getEmployeeName()) ;
			 c.insertOne(document);
			 str="Successfully Registered";
		}
		return str;
	}
}
