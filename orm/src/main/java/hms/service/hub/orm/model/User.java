package hms.service.hub.orm.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by yasitha on 7/26/16.
 */
@Entity
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 7907557244205936381L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "username", unique = true, nullable = false)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password")
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private UserStatus status;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;



    public enum UserStatus {
        ACTIVE,
        INACTIVE
    }
}
