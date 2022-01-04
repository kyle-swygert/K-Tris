package tetromino

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.awt.Color

internal class IPieceTest {

    var testI = IPiece()

    @Test
    fun getCells() {
        // create matrix of expected cell positions
        var testCells: Array<IntArray> = Array(4) { IntArray(4) }
        testCells[0][2] = 1
        testCells[1][2] = 1
        testCells[2][2] = 1
        testCells[3][2] = 1
        // compare to actual cell positions
        assertArrayEquals(testCells, testI.cells)

    }

    @Test
    fun getColor() {
        assertEquals(Color.CYAN, testI.getColor())
    }
}