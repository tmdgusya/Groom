package roach.groom.roach.entity;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
public class Post extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String contents;

    private boolean deleted;

    @Column(name = "like_count")
    private Long likeCounts;

    @ManyToOne
    private User author;

    @OneToMany(mappedBy = "post", cascade = CascadeType.PERSIST)
    private final List<Comment> comments = new ArrayList<>();

}
