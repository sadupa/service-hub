package hms.service.hub.orm.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by yasitha on 7/26/16.
 */
@Entity(name = "role")
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private long id;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @OneToMany(mappedBy = "role")
    private List<User> users;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "role_permission",
            joinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id", nullable = false)},
            inverseJoinColumns = {@JoinColumn(name = "permission_id", referencedColumnName = "id", nullable = false)})
    private List<Permission> permissionList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Permission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<Permission> permissionList) {
        this.permissionList = permissionList;
    }
}
