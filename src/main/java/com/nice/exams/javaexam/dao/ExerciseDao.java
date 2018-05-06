package com.nice.exams.javaexam.dao;

import com.nice.exams.javaexam.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Evgeny Borisov
 */
public interface ExerciseDao extends JpaRepository<Exercise,Integer> {

}
