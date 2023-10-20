package com.ltp.gradesubmission.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltp.gradesubmission.entity.Grade;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
@RequestMapping("/grade")
public class GradeController {

  @GetMapping(value="/student/{studentId}/course/{courseId}")
  public ResponseEntity<Grade> getGrade(@PathVariable Long studentId, @PathVariable Long courseId) {
      return new ResponseEntity<>(HttpStatus.OK);
  }

  @PostMapping(value="/student/{studentId}/course/{courseId}")
  public ResponseEntity<Grade> saveGrade(@RequestBody Grade grade, @PathVariable Long studentId, @PathVariable Long courseId) {
      return new ResponseEntity<Grade>(grade, HttpStatus.CREATED);
  }

  @PutMapping(value="/student/{studentId}/course/{courseId}")
  public ResponseEntity<Grade> updateGrade(@PathVariable Long studentId, @PathVariable Long courseId, @RequestBody Grade grade) {
      return new ResponseEntity<Grade> (grade, HttpStatus.OK);
  }

  @DeleteMapping(value="/student/{studentId}/course/{courseId}")
  public ResponseEntity<HttpStatus> deleteGrade(@PathVariable Long studentId, @PathVariable Long courseId) {
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }

  @GetMapping(value="/student/{studentId}")
  public ResponseEntity<Grade> getStudentGrades(@PathVariable Long studentId) {
      return new ResponseEntity<Grade>(HttpStatus.OK);
  }

  @GetMapping(value="/course/{courseId}")
  public ResponseEntity<Grade> getCourseGrades(@PathVariable Long courseId) {
      return new ResponseEntity<Grade>(HttpStatus.OK);
  }

  @GetMapping(value="/all")
  public ResponseEntity<List<Grade>> getGrades() {
      return new ResponseEntity<List<Grade>> (HttpStatus.OK);
  }










}
