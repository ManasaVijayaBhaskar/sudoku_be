package com.iqquestor.sudoku.controller;

import com.iqquestor.sudoku.model.SudokuPuzzle;
import com.iqquestor.sudoku.service.SudokuPuzzleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sudoku")
public class SudokuPuzzleController {

    @Autowired
    private SudokuPuzzleService puzzleService;

    @GetMapping("/puzzles/{difficulty}")
    public List<SudokuPuzzle> getPuzzles(@PathVariable String difficulty) {
        return puzzleService.getPuzzlesByDifficulty(difficulty);
    }

    @PostMapping("/puzzles")
    public SudokuPuzzle addPuzzle(@RequestBody SudokuPuzzle puzzle) {
        return puzzleService.savePuzzle(puzzle);
    }

    @DeleteMapping("/puzzles/{id}")
    public void deletePuzzle(@PathVariable Long id) {
        puzzleService.deletePuzzle(id);
    }
}
