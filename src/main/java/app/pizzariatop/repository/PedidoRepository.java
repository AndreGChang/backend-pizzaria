package app.pizzariatop.repository;

import app.pizzariatop.entity.Pedido;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Long> {
	
	 	@Query(value = "SELECT * FROM pedido WHERE pedido.status = 'PREPARO'", nativeQuery = true)
	    List<Pedido> searchByStatus();
	
}
