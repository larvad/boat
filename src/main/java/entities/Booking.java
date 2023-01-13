package entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    @Column(name = "seats", nullable = false)
    private Integer spots;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "fullPrice", nullable = false)
    private Double fullPrice;

    @Column(name = "bookingDate", nullable = false)
    private Date bookingDate;





}