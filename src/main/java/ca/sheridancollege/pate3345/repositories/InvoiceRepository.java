package ca.sheridancollege.pate3345.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.sheridancollege.pate3345.beans.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

	public Optional<Invoice> findByTitle(String title);
}
