package ca.sheridancollege.pate3345.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.sheridancollege.pate3345.beans.Invoice;
import ca.sheridancollege.pate3345.services.InvoiceService;

@RestController
@RequestMapping("/api/v1/invoices")
public class InvoiceController {

	@Autowired
	private InvoiceService invoiceService;
	
	@GetMapping(value = { "", "/" })
	public List<Invoice> getCollection() {
		return invoiceService.findAll();
	}

	@PostMapping(value = { "", "/" })
	public Invoice save(@RequestBody Invoice invoice) {
		return invoiceService.save(invoice);
	}

}
