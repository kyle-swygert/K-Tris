package tetromino

import board.TermColor
import java.awt.Color

class IPiece(): Tetromino() {

    init {
        cells[0][2] = 1
        cells[1][2] = 1
        cells[2][2] = 1
        cells[3][2] = 1
    }

    override fun getColor(): Color {
        return Color.CYAN
    }

//    override fun getTermColor(): TermColor {
//        return TermColor.CYAN
//    }
}