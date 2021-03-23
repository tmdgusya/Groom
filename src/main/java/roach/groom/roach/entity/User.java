package roach.groom.roach.entity;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class User extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, length = 20)
    private String userId;

    @Column(length = 15)
    private String password;

    @Column(length = 30)
    private String email;

    private boolean authentication = false;

}
