package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import in.ashokit.dao.ReportDao;


@Service
public class ReportService {
	
	@Value("${report.type}")
	private String type;
	private ReportDao reportDao;
	
	public ReportService() {
		System.out.println("0-param constructor");
	}
	@Autowired
	public ReportService(ReportDao reportDao) {
		System.out.println("param constructor");
		this.reportDao=reportDao;
	}
	
	
	
//	@Autowired
//	public void setReportDao(ReportDao reportDao) {
//		System.out.println("setReportDao() method called");
//		this.reportDao=reportDao;
//	}
	
	public void printName(Integer userId) {
		System.out.println("Report Type ::"+type);
		String nameById=reportDao.getNameById(userId);
		System.out.println(nameById);
	}
}
