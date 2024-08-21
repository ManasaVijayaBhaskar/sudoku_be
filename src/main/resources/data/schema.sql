CREATE TABLE IF NOT EXISTS sudoku_puzzles (
    id SERIAL PRIMARY KEY,
    puzzle JSONB NOT NULL, -- 2D array stored as JSON
    digit_counts JSONB NOT NULL, -- Number of items for each digit, stored as JSON
    difficulty VARCHAR(50) NOT NULL, -- Difficulty level
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


--ALTER TABLE sudoku_puzzles ADD COLUMN hints JSONB DEFAULT NULL;
--ALTER TABLE sudoku_puzzles ADD COLUMN completion_time INTERVAL DEFAULT NULL;
