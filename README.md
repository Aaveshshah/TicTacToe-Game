Here's a `README.md` file for your Tic-Tac-Toe project in Java:

---

# Tic-Tac-Toe Game in Java

This project is a simple Tic-Tac-Toe game implemented in Java using the Swing framework for the graphical user interface (GUI). The game allows two players to play against each other, taking turns to place their marks (X and O) on a 3x3 grid. The game also tracks the scores of both players.

## Features

- **Two-Player Mode:** Two players can play against each other on the same computer.
- **Score Tracking:** The game keeps track of the scores for both players.
- **Graphical Interface:** The game has an intuitive and user-friendly graphical interface built using Java Swing.
- **Winning and Draw Conditions:** The game checks for winning combinations and declares the winner. In case of a draw, it displays an appropriate message.
- **Reset Functionality:** Players can reset the game to start a new round without resetting the score.
- **Disabling Buttons:** Once a player wins or the game is drawn, the buttons are disabled to prevent further moves.

## Requirements

- **Java Development Kit (JDK):** The game requires JDK 8 or higher to run.
- **IDE (Optional):** You can use any Java-compatible IDE like IntelliJ IDEA, Eclipse, or NetBeans.

## How to Run the Game

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/tic-tac-toe-java.git
   cd tic-tac-toe-java
   ```

2. **Compile the Java Program:**
   ```bash
   javac TicTacToe.java
   ```

3. **Run the Game:**
   ```bash
   java TicTacToe
   ```

4. **Play the Game:**
   - The game window will open.
   - Player 1 uses "X" and Player 2 uses "O".
   - Click on the buttons in the 3x3 grid to place your mark.
   - The game will declare the winner or announce a draw.
   - Click "Reset" to start a new round.

## Project Structure

- **TicTacToe.java:** The main Java file containing the game logic and GUI implementation.
- **README.md:** Documentation file for the project.

## How the Game Works

- Players take turns clicking on the buttons in the 3x3 grid.
- The first player to align three marks horizontally, vertically, or diagonally wins the game.
- The score is updated after each round.
- In case all nine buttons are filled without any player winning, the game declares a draw.
- Players can click the "Reset" button to start a new game round while keeping the score intact.

## Future Enhancements

- **AI Opponent:** Implement a single-player mode with an AI opponent.
- **Enhanced UI:** Improve the graphical interface with better styling and animations.
- **Sound Effects:** Add sound effects for button clicks and win/lose/draw announcements.
- **Custom Themes:** Allow players to select custom themes or colors for the game.

## Contributing

Feel free to fork this repository and submit pull requests with improvements or bug fixes. Contributions are welcome!

## License

This project is open-source and available under the MIT License. See the [LICENSE](LICENSE) file for more details.

## Contact

For any inquiries or feedback, please contact Aaveshshah77@gmail.com

---

