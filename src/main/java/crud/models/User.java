package crud.models;
import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, insertable = true, updatable = true, length = 20)
    private Long id;
    @Column(name = "name", nullable = false, insertable = true, updatable = true, length = 20)
    private String name;
    @Column(name = "last_name", nullable = false, insertable = true, updatable = true, length = 20)
    private String last_name;
    @Column(name = "email", nullable = false, insertable = true, updatable = true, length = 20)
    private String email;
    @Column(name = "age")
    private int age;

    public User() {
    }

    public User(String name, String last_name, String email, int age) {
        this.name = name;
        this.last_name = last_name;
        this.email = email;
        this.age = age;
    }

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

    public String getLast_name(){
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
