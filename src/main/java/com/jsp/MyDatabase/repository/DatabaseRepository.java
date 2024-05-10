package com.jsp.MyDatabase.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.jsp.MyDatabase.dto.UpdateDataSourceDTO;
import com.jsp.MyDatabase.entity.DataSourceEntity;

@Component
public class DatabaseRepository {

	@Autowired
	SessionFactory sessionFactory;

	//method is used to add and save the data into database
	public void Save1(DataSourceEntity dataSourceEntity) {
		try {

			Session session = sessionFactory.openSession();//opensession 
			Transaction transaction = session.beginTransaction(); //allocate memory in persistence context
			System.out.println("merging");
			session.merge(dataSourceEntity);
			System.out.println("data saved");
			transaction.commit();
			System.out.println("data committed");
			System.out.println("Data saved successfully");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("exception occured while saving data");
		}
	}

	public DataSourceEntity findById(int id) {
		try {
			Session session = sessionFactory.openSession();
			return session.get(DataSourceEntity.class, id);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("data fetched successfully");
		}
		return null;
	}

	public void updateDataSource(UpdateDataSourceDTO updateDataSource) {
		DataSourceEntity dataSourceEntity = findById(updateDataSource.getAltkey());

		if (dataSourceEntity != null) {
			dataSourceEntity.setPassword(updateDataSource.getPassword());
			dataSourceEntity.setPortNumber(updateDataSource.getPortnumber());
			dataSourceEntity.setUserName(updateDataSource.getUsername());
			Save1(dataSourceEntity);
			System.out.println("data updated!...");
		}
	}

	public List<DataSourceEntity> FindAll() {
		try {
			StringBuilder builder = new StringBuilder(" from DataSourceEntity ");
			Session session = sessionFactory.openSession();
			Query query = session.createQuery(builder.toString());
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public void deleteById(int id) {
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			DataSourceEntity dataSourceEntity = session.get(DataSourceEntity.class, id);
			System.out.println(dataSourceEntity);
			if (dataSourceEntity != null) {
				session.delete(dataSourceEntity);
				System.out.println("deleted the data successfully");
			}
			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}