package ca.sheridancollege.pate3345.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.sheridancollege.pate3345.beans.Invoice;
import ca.sheridancollege.pate3345.repositories.InvoiceRepository;

@Service
public class InvoiceServiceImpl implements InvoiceService {

	@Autowired
	private InvoiceRepository invoiceRepository;
	
	@Override
	public List<Invoice> findAll() {
 		return invoiceRepository.findAll();
	}

	@Override
	public Optional<Invoice> findById(Long id) {
 		return invoiceRepository.findById(id);
	}

	@Override
	public Optional<Invoice> findByTitle(String title) {
 		return invoiceRepository.findByTitle(title);
	}

	@Override
	public Invoice save(Invoice invoice) {
 		return invoiceRepository.save(invoice);
	}


}
