package com.example.studentapp.repository;

import com.example.studentapp.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class StudentRepository {
    private final JdbcTemplate jdbc;

    public StudentRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public List<Student> findAll() {
        return jdbc.query(
            "SELECT id, name, email, age, course FROM students ORDER BY id DESC",
            (rs, row) -> new Student(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("email"),
                rs.getInt("age"),
                rs.getString("course")
            )
        );
    }

    public int save(Student s) {
        return jdbc.update(
            "INSERT INTO students(name,email,age,course) VALUES(?,?,?,?)",
            s.getName(), s.getEmail(), s.getAge(), s.getCourse()
        );
    }

    public int delete(int id) {
        return jdbc.update("DELETE FROM students WHERE id=?", id);
    }
}
