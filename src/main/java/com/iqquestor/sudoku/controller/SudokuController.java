// src/main/java/com/iqquestor/sudoku/controller/SudokuController.java

package com.iqquestor.sudoku.controller;

import com.iqquestor.sudoku.service.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sudoku")
@CrossOrigin(origins = "*") // Allow CORS for React frontend
public class SudokuController {

    @Autowired
    private Validator validator;

    @PostMapping("/validate")
    public String validateSudoku(@RequestBody int[][] board) {
//        System.out.println(board);
        String resultMsg = validator.isValidSudoku(board);
//        System.out.println(resultMsg);
        return resultMsg;
    }
}
