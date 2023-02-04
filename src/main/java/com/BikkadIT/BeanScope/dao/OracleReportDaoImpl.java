package com.BikkadIT.BeanScope.dao;

import org.springframework.stereotype.Repository;

@Repository
public class OracleReportDaoImpl implements ReportDaoI {

	@Override
	public String getReportData() {
		// TODO Auto-generated method stub
		String msg="getting data from OracleDB";
		return msg;
	}

}
