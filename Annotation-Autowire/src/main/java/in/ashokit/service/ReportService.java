package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.ashokit.report.IReport;

@Service
public class ReportService {
	@Autowired
	@Qualifier("excel")
	private IReport report;
	
	public void generate() {
		System.out.println("Injected ::"+report.getClass().getName());
		report.generateReport();
	}
}
