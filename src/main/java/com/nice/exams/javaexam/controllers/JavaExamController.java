package com.nice.exams.javaexam.controllers;

import com.nice.exams.javaexam.JavaExamService;
import com.nice.exams.javaexam.model.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/java-exam")
public class JavaExamController {
    @Autowired
    private JavaExamService examService;

    @GetMapping("/random")
    public List<Exercise> exercises(@RequestParam("amount") int amount){
        return examService.getRandom(amount);
    }
}
