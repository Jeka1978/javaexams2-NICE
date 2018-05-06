package com.nice.exams.javaexam;

import com.nice.exams.javaexam.dao.ExerciseDao;
import com.nice.exams.javaexam.model.Exercise;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class JavaExamServiceImplTest {
    @Test
    public void getRandom() throws Exception {
        ExerciseDao exerciseDao = Mockito.mock(ExerciseDao.class);
        Mockito.when(exerciseDao.findAll()).thenReturn(new ArrayList<>(Arrays.asList(
                Exercise.builder().question("A").answer("1").build(),
                Exercise.builder().question("B").answer("2").build(),
                Exercise.builder().question("C").answer("3").build(),
                Exercise.builder().question("D").answer("4").build(),
                Exercise.builder().question("E").answer("5").build()
        )));

        JavaExamServiceImpl examService = new JavaExamServiceImpl();
        examService.setExerciseDao(exerciseDao);
        List<Exercise> exercises = examService.getRandom(3);
        Assert.assertEquals(3,exercises.size());
        Exercise exercise = exercises.get(0);
        Assert.assertNotNull(exercise.getAnswer());
        Assert.assertNotNull(exercise.getQuestion());
    }

}





