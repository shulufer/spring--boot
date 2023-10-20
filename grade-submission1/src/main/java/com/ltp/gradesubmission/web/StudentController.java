package com.ltp.gradesubmission.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltp.gradesubmission.entity.Student;


@RestController
@RequestMapping(path = "/student")
public class StudentController {

  // @Autowired
  // StudentService studentService;

  @GetMapping("/{id}")
  public ResponseEntity<Student> getStudent(@PathVariable Long id) {
    // Student student = studentService.getStudent(id);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<Student> setStudent(@RequestBody Student student) {
    return new ResponseEntity<Student>(student, HttpStatus.CREATED);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<HttpStatus> deleteStudent(@PathVariable Long id) {
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }

  @GetMapping("/all")
  public ResponseEntity<List<Student>> getStudents(){
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
