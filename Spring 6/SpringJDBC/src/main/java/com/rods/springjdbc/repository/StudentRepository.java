package com.rods.springjdbc.repository;

import com.rods.springjdbc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    private JdbcTemplate jdbc;


    public void save(Student s) {
        String query = "INSERT INTO Student(rollno,name,marks) values(?,?,?)";
        int rows = jdbc.update(query, s.getRollNo(), s.getName(), s.getMarks());
        System.out.println("Rows: " + rows + " Affected :)");
    }

    public List<Student> findAll() {
        String query = "SELECT * FROM student";


            // we can also implement the below function in the form of an arrow function
        RowMapper<Student> mapper = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student s = new Student();
                s.setRollNo(rs.getInt("rollno"));
                s.setName(rs.getString("name"));
                s.setMarks(rs.getInt("marks"));

                return s;
            }


        };
        return jdbc.query(query, mapper);

    }


    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    //spring will also handle the creation of jdbc templateobject
    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

}
