package com.iqquestor.sudoku.service;

import com.iqquestor.sudoku.model.SudokuPuzzle;
import com.iqquestor.sudoku.repository.SudokuPuzzleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SudokuPuzzleService {

    @Autowired
    private SudokuPuzzleRepository puzzleRepository;

    public List<SudokuPuzzle> getPuzzlesByDifficulty(String difficulty) {
        return puzzleRepository.findByDifficulty(difficulty);
    }

    public SudokuPuzzle savePuzzle(SudokuPuzzle puzzle) {
        return puzzleRepository.save(puzzle);
    }

    public void deletePuzzle(Long id) {
        puzzleRepository.deleteById(id);
    }
}

