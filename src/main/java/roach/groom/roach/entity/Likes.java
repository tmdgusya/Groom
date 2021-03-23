package roach.groom.roach.entity;

import javax.persistence.*;

@Entity
public class Likes extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    User author;

    @ManyToOne
    Post post;

}
