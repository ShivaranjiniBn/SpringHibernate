package com.jsp.MyDatabase.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.MyDatabase.dto.DatasourceDto;
import com.jsp.MyDatabase.dto.UpdateDataSourceDTO;
import com.jsp.MyDatabase.entity.DataSourceEntity;
import com.jsp.MyDatabase.repository.DatabaseRepository;

@Component
public class DataBaseServiceImpl implements DatabaseService {
	@Autowired
	DatabaseRepository databaseRepository;

	@Override
	public void prepareandSaveDataSource(DatasourceDto datasourceDTO) {
		DataSourceEntity dataSourceEntity=prepareDatasourceEntity(datasourceDTO );
		databaseRepository.Save1(dataSourceEntity);
		
	}

	public DataSourceEntity prepareDatasourceEntity(DatasourceDto datasourceDTO) {

		DataSourceEntity dataSourceEntity = new DataSourceEntity();
		dataSourceEntity.setAltkey(5);
		dataSourceEntity.setUserName(datasourceDTO.getUserName());
		dataSourceEntity.setDbname(datasourceDTO.getDbname());
		dataSourceEntity.setHostname(datasourceDTO.getHostname());
		dataSourceEntity.setPortNumber(datasourceDTO.getPortNumber());
		dataSourceEntity.setPassword(datasourceDTO.getPassword());
		dataSourceEntity.setModifiedDate(datasourceDTO.getModifiedDate());
		dataSourceEntity.setCreatedDate(new Date());
		return dataSourceEntity;

	}
    
	@Override
	public DataSourceEntity getDataSourceById(int id) {
		return databaseRepository.findById(id);
		
	}

	@Override
	public void updateDataSourceData(UpdateDataSourceDTO updateDataSource) {
		
		databaseRepository.updateDataSource(updateDataSource);
	}

	@Override
	public List<DataSourceEntity> getAllDataSource() {
		
		return databaseRepository.FindAll();
	}

	@Override
	public void deleteById(int id) {
		 databaseRepository.deleteById(id);
	}

}
