import GUIForms.GameForm
import board.Board
import board.TermColor
import tetromino.*

/**/

// Import statements for classes to be used.

// Main function to execute program.
fun main() {


    // change the text color of the output on terminal
    val purple = "\u001B[35m"
    val red = "\u001B[31m"
    val reset = "\u001B[0m"


    println(TermColor.PURPLE.color + "This text should be purple!!")
    println(red + "Now it should be red!!")
    println(reset + "Now it should be reset to normal!")


    // Note: This file will be where the main functionality of the program is executed.

    for (i in 0..42 step 2) {
        println(i)
    }


    val testJPiece = JPiece()
    val testLPiece = LPiece()
    val testSPiece = SPiece()
    val testZPiece = ZPiece()

    testJPiece.printShapeCells()
    println()
    testLPiece.printShapeCells()
    println()
    testSPiece.printShapeCells()
    println()
    testZPiece.printShapeCells()


    val board = Board()

    // Add pieces to the Board object to test if the terminal text color changes to the proper color for the tetrominoes.

    board.cells[0][0].populated = true
    board.cells[0][0].cellTermColor = TermColor.CYAN

    board.cells[1][0].populated = true
    board.cells[1][0].cellTermColor = TermColor.CYAN

    board.cells[2][0].populated = true
    board.cells[2][0].cellTermColor = TermColor.CYAN

    board.cells[3][0].populated = true
    board.cells[3][0].cellTermColor = TermColor.CYAN


    board.cells[0][10].populated = true
    board.cells[0][10].cellTermColor = TermColor.CYAN

    board.cells[0][20].populated = true
    board.cells[0][20].cellTermColor = TermColor.CYAN

    board.cells[0][30].populated = true
    board.cells[0][30].cellTermColor = TermColor.CYAN

    board.cells[0][39].populated = true
    board.cells[0][39].cellTermColor = TermColor.CYAN

    board.printBoard(true, false)

    board.printBoard()
//
//    println("Testing bag generation")
//    var factory = TetrominoFactory()
//
//    var bag = factory.generateBag()
//
//    for (item: Tetromino in bag) {
//        item.printShapeCells()
//        println()
//    }

//    var testForm = GameForm()
//
//    testForm.main()


}