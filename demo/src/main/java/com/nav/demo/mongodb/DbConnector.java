package com.nav.demo.mongodb;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DbConnector {
	public MongoCollection<Document> getCollection(){
		MongoClient mongo=new MongoClient("localhost",27017);
		MongoDatabase db=mongo.getDatabase("mydb");
		MongoCollection<Document> collection = db.getCollection("employee");
		if(collection==null) {
			db.createCollection("employee");
			MongoCollection<Document> c = db.getCollection("employee");
			return c;
		}
		return collection;
	}
	
}
