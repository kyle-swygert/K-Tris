package tetromino

import java.awt.Color

class OPiece() : Tetromino() {

    init {
        cells[1][1] = 1
        cells[1][2] = 1
        cells[2][1] = 1
        cells[2][2] = 1
    }

    override fun getColor(): Color {
        return Color.YELLOW
    }

}