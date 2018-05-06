package com.nice.exams.javaexam;

import com.nice.exams.javaexam.model.Exercise;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public interface JavaExamService {
    List<Exercise> getRandom(int amount);
}
