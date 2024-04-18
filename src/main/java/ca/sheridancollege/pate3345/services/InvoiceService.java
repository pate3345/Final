package ca.sheridancollege.pate3345.services;

import java.util.List;
import java.util.Optional;

import ca.sheridancollege.pate3345.beans.Invoice;


public interface InvoiceService {

	public List<Invoice> findAll();
	public Optional<Invoice> findById(Long id);
	public Optional<Invoice> findByTitle(String title);
	public Invoice save(Invoice invoice);
 
}
