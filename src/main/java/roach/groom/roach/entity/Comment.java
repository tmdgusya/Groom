package roach.groom.roach.entity;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity(name = "Comment")
public class Comment extends BaseEntity{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String contents;

    private boolean deleted;

    @ManyToOne
    private User user;

    @ManyToOne
    private Post post;

}
