package tetromino

import java.awt.Color

class JPiece() : Tetromino() {

    init {
        cells[0][1] = 1
        cells[0][2] = 1
        cells[1][1] = 1
        cells[2][1] = 1
    }

    override fun getColor(): Color {
        return Color.BLUE
    }

}