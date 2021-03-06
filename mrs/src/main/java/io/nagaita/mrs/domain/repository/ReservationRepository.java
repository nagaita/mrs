package io.nagaita.mrs.domain.repository;

import io.nagaita.mrs.domain.model.ReservableRoomId;
import io.nagaita.mrs.domain.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

	List<Reservation> findByReservableRoom_ReservableRoomIdOrderByStartTimeAsc(ReservableRoomId reservableRoomId);

}
