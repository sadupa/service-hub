package hms.service.hub.orm.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by yasitha on 7/26/16.
 */
@Entity(name = "permission")
public class Permission implements Serializable {
    private static final long serialVersionUID = -1550816135594806834L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "permission_name", unique = true, nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "permissionList")
    private List<Role> roleList;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "depends_on_permission_id", nullable = true)
    private Permission dependsOn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Permission getDependsOn() {
        return dependsOn;
    }

    public void setDependsOn(Permission dependsOn) {
        this.dependsOn = dependsOn;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Permission that = (Permission) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
