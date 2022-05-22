package cl.christian.java.tesoreria.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.christian.java.tesoreria.modelo.Factura;

public interface FacturaRepository extends JpaRepository<Factura, Long> {

}

