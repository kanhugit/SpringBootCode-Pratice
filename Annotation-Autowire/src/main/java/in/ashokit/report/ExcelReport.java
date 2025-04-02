package in.ashokit.report;

import org.springframework.stereotype.Component;

//@Component
@Component("excel")
public class ExcelReport implements IReport {


	public void generateReport() {
		System.out.println("ExcelReport Generated..");
		
	}

}
