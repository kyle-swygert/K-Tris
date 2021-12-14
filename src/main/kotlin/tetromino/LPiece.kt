package tetromino

import java.awt.Color

class LPiece() : Tetromino() {

    override fun setShapeCells() {

        cells[0][1] = 1
        cells[1][1] = 1
        cells[2][1] = 1
        cells[2][2] = 1

    }

    override fun getColor(): Color {
        return Color.ORANGE
    }

}