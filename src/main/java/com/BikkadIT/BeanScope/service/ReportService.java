package com.BikkadIT.BeanScope.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.BeanScope.dao.OracleReportDaoImpl;

@Service

public class ReportService {
		@Autowired
		private OracleReportDaoImpl reportDaoI;
	public void generateReport() {
		// TODO Auto-generated method stub
		String reportData=reportDaoI.getReportData();
		System.out.println("reportData");
	}

}
