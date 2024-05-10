package com.jsp.MyDatabase;

import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.MyDatabase.config.SqlConfig;
import com.jsp.MyDatabase.controller.DataController;
import com.jsp.MyDatabase.dto.DatasourceDto;
import com.jsp.MyDatabase.dto.UpdateDataSourceDTO;
import com.jsp.MyDatabase.entity.DataSourceEntity;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    	context.register(SqlConfig.class);
    	context.refresh();
    	DatasourceDto datasourcedto = new DatasourceDto();    
    	datasourcedto.setDbname("dummyDB");
    	datasourcedto.setHostname("production");
    	datasourcedto.setPassword("root");
    	datasourcedto.setUserName("root");
    	datasourcedto.setPortNumber("3306");
    	 Date currentDate = new Date();
    	datasourcedto.setModifiedDate(currentDate);
    	
    	DataController datacontroller = context.getBean(DataController.class);
    	//datacontroller.cretateDataSource(datasourcedto);	 // create data 
    	
//    	//fetch data from database using id
//    	DataSourceEntity dataSourceById = datacontroller.getDataSourceById(12);
//    	System.out.println(dataSourceById);
    	
//    	//update data from database
//    	UpdateDataSourceDTO updateDataSource = new UpdateDataSourceDTO();
//    	updateDataSource.setAltkey(5);
//    	updateDataSource.setPassword("update");
//    	updateDataSource.setPortnumber("8080");
//    	updateDataSource.setUsername("updating user");
//    	datacontroller.updateDataSourceData(updateDataSource);
    	
    	
    	//fetch all data from datasource
    	List<DataSourceEntity> allData = datacontroller.getAllData();
    	allData.forEach(each -> System.out.println(each));
    	
    	
    	//delete by id
    //	datacontroller.deleteDataSource(5);
    	
    	
    	
    }
}
