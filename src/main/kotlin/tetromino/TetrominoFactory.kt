package tetromino

import java.util.*
import kotlin.collections.ArrayList

/**
 * Used to generate Tetromino objects for program.
 */
class TetrominoFactory {

    /**
     * Generates a single Tetromino object based on the input parameter.
     *
     * @param pieceType specifies the Tetromino object type to create. Expecting ints 0 through 6 inclusive.
     * @exception Exception thrown when improper value is given as input parameter.
     * @return a single Tetromino object corresponding to the input parameter value.
     */
    fun generatePiece(pieceType: Int): Tetromino {

        return when (pieceType) {
            0 -> OPiece()
            1 -> IPiece()
            2 -> TPiece()
            3 -> LPiece()
            4 -> JPiece()
            5 -> SPiece()
            6 -> ZPiece()
            else -> throw Exception("Improper pieceType parameter value, cannot generate Tetromino.")
        }

    }

    /**
     * Generates a randomized ArrayDeque of Tetromino objects
     *
     * @return an ArrayDeque of all 7 Tetromino objects in a shuffled order.
     * */
    fun generateBag() : ArrayDeque<Tetromino> {

        val resultBag = ArrayList<Tetromino>()

        // add all Tetromino objects to ArrayList in order
        for (i in 0 until 7) {
            resultBag.add(this.generatePiece(i))
        }

        // return the shuffled ArrayList as an ArrayDeque
        return ArrayDeque<Tetromino>(resultBag.shuffled())
    }

}