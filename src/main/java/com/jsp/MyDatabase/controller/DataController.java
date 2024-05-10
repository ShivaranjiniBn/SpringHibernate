package com.jsp.MyDatabase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.MyDatabase.dto.DatasourceDto;
import com.jsp.MyDatabase.dto.UpdateDataSourceDTO;
import com.jsp.MyDatabase.entity.DataSourceEntity;
import com.jsp.MyDatabase.service.DataBaseServiceImpl;


@Component
public class DataController {
	 @Autowired
	DataBaseServiceImpl dataSourceimp;
	
	public void cretateDataSource(DatasourceDto datasourceDTO) {
		dataSourceimp.prepareandSaveDataSource(datasourceDTO);
	}
	
	public DataSourceEntity getDataSourceById(int id) {
		return dataSourceimp.getDataSourceById(id);
	}

	public void updateDataSourceData(UpdateDataSourceDTO updateDataSource) {
		dataSourceimp.updateDataSourceData(updateDataSource);
	}
	
	public List<DataSourceEntity> getAllData() {
		return dataSourceimp.getAllDataSource();
		
	}
	
	public void deleteDataSource(int id) {
		dataSourceimp.deleteById(id);
	}

}
