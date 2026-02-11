package hu.nyirszikszi.jpah2demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="students", uniqueConstraints = {
        @UniqueConstraint(name = "uk_student_email", columnNames = "email")
})
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private  String email;

    protected Student() {} // JPA miatt kell

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
