import board.Board
import tetromino.JPiece
import tetromino.LPiece
import tetromino.SPiece
import tetromino.ZPiece

/**/

// Import statements for classes to be used.

// Main function to execute program.
fun main() {

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

    board.printBoard()

}