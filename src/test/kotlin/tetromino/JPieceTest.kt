package tetromino

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.awt.Color

internal class JPieceTest {

    var testJ = JPiece()

    @Test
    fun getCells() {
        // create matrix of expected cell positions
        var testCells: Array<IntArray> = Array(4) { IntArray(4) }
        testCells[0][1] = 1
        testCells[0][2] = 1
        testCells[1][1] = 1
        testCells[2][1] = 1
        // compare to actual cell positions
        assertArrayEquals(testCells, testJ.cells)
    }

    @Test
    fun getColor() {
        assertEquals(Color.BLUE, testJ.getColor())
    }
}