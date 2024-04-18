package ca.sheridancollege.pate3345.bootstrap;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.sheridancollege.pate3345.beans.Invoice;
import ca.sheridancollege.pate3345.services.InvoiceService;

@Component
public class InvoiceBootstrap implements CommandLineRunner {

	@Autowired
	private InvoiceService invoiceService;
	
	
	@Override
	public void run(String... args) throws Exception {

		
        Invoice i1 = new Invoice("bread", 2, LocalDate.of(2004, 1, 4));
        Invoice i2 = new Invoice("jam", 3, LocalDate.of(2009, 1, 1));
        Invoice i3 = new Invoice("butter", 5, LocalDate.of(2010, 1, 5));
		
		invoiceService.save(i1);
		invoiceService.save(i2);
		invoiceService.save(i3);

	}

}
