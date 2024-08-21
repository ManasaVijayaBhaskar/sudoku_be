package com.iqquestor.sudoku.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Map;

@Data
@Entity
@Table(name = "sudoku_puzzles")
public class SudokuPuzzle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "jsonb")
    private int[][] puzzle;

    @Column(columnDefinition = "jsonb")
    private Map<Integer, Integer> digitCounts;

    private String difficulty;

    private LocalDateTime createdAt = LocalDateTime.now();
}
