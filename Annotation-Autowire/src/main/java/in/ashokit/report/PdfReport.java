package in.ashokit.report;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
@Component("pdf")
@Primary
public class PdfReport implements IReport{

	public void generateReport() {
		System.out.println("Pdf Report generated..");
	}

}
