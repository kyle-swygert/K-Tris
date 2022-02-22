package tetromino

import board.TermColor
import java.awt.Color

abstract class Tetromino {

    // Member variables

    // 2D array to represent shape of piece
    var cells: Array<IntArray> = Array(4) { IntArray(4) }

    // Class Methods
    abstract fun getColor(): Color

    //abstract fun getTermColor(): TermColor

    fun printShapeCells() {

        for (y in 3 downTo 0) {
            for (x in 0..3) {
                if (cells[x][y] == 1){
                    print(" X")
                }
                else {
                    print(" O")
                }
            }
            println()
        }

    }

}