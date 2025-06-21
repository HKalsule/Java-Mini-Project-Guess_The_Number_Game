### 🎮 `GuessTheNumber.java`
**Concept:** Object-Oriented Game Development  
**Description:**  
A fun console-based guessing game where:
- The program randomly selects a number between 0 and 99.
- The player tries to guess the number with feedback after each guess:
  - "Too high!" if the guess is greater than the target.
  - "Too low!" if the guess is less than the target.
  - "Correct!" when the guess matches the target.
- The number of attempts is tracked.
- Based on performance, feedback is given:
  - ≤ 5 attempts: Excellent
  - 6–15 attempts: Moderate
  - >15 attempts: Needs improvement
- After finishing, the player is given an option to play again or exit.

**Key Concepts Used:**
- Class and object creation (`Game` class)
- Random number generation (`Random`)
- Encapsulation (private variables with class methods)
- Input handling (`Scanner`)
- Boolean control for replay and logic flow
- Method-based structure to break down the game into logical parts
