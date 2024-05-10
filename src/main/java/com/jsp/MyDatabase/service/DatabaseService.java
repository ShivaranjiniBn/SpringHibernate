package com.jsp.MyDatabase.service;

import java.util.List;

import com.jsp.MyDatabase.dto.DatasourceDto;
import com.jsp.MyDatabase.dto.UpdateDataSourceDTO;
import com.jsp.MyDatabase.entity.DataSourceEntity;

public interface DatabaseService {

	void prepareandSaveDataSource(DatasourceDto datasourceDTO);// create and post data

	DataSourceEntity getDataSourceById(int id);// get data

	void updateDataSourceData(UpdateDataSourceDTO updateDataSource);// update data
	
	List<DataSourceEntity> getAllDataSource();
	
	void deleteById(int id);

}
