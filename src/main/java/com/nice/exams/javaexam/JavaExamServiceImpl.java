package com.nice.exams.javaexam;

import com.nice.exams.javaexam.dao.ExerciseDao;
import com.nice.exams.javaexam.model.Exercise;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Service
public class JavaExamServiceImpl implements JavaExamService {
    @Autowired
    @Setter
    private ExerciseDao exerciseDao;
    @Override
    public List<Exercise> getRandom(int amount) {
        List<Exercise> exercises = exerciseDao.findAll();
        Collections.shuffle(exercises);
        return exercises.subList(0, amount);
    }
}
