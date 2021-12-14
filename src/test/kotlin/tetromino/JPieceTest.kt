package tetromino

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.awt.Color


internal class JPieceTest {

    var testPiece = JPiece()

    @Test
    @DisplayName("Test J Piece Color")
    fun testGetColor() {
        // Correct Color
        assertEquals(Color.BLUE, testPiece.getColor())
        // Incorrect Color
        assertNotEquals(Color.RED, testPiece.getColor())
    }

}