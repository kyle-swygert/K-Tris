package tetromino

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.assertThrows

internal class TetrominoFactoryTest {

    private val testFactory = TetrominoFactory()

    @Test
    fun generatePiece() {
        // Generate all piece types individually.
        // Test that each object is of the correct type.
        val testO = testFactory.generatePiece(0)
        assertEquals(OPiece::class, testO::class)

        val testI = testFactory.generatePiece(1)
        assertEquals(IPiece::class, testI::class)

        val testT = testFactory.generatePiece(2)
        assertEquals(TPiece::class, testT::class)

        val testL = testFactory.generatePiece(3)
        assertEquals(LPiece::class, testL::class)

        val testJ = testFactory.generatePiece(4)
        assertEquals(JPiece::class, testJ::class)

        val testS = testFactory.generatePiece(5)
        assertEquals(SPiece::class, testS::class)

        val testZ = testFactory.generatePiece(6)
        assertEquals(ZPiece::class, testZ::class)

        // Test that the method throws an exception for negative values as well as values greater than 6.

        // pieceType with value lower than expected
        assertThrows(Exception::class.java) {
            testFactory.generatePiece(-1)
        }

        // pieceType with value greater than expected
        assertThrows(Exception::class.java) {
            testFactory.generatePiece(7)
        }

    }

    @Test
    fun generateBag() {
        // generate a random bag
        // test that the bag contains 7 objects
        // test that the bag contains all 7 piece types, with each object type in the list only once.
        // could possibly use a HashTable to count the occurrences of each object type since that is a general use case for a HashTable.

        var testBag = testFactory.generateBag()

        var hashMap = HashMap<Tetromino, Int>()

        for (item: Tetromino in testBag) {
            // add the Tetromino to the hashMap and increment the value for the key.
            if (hashMap.containsKey(item)) {
                hashMap[item] = hashMap.getValue(item) + 1
            } else {
                hashMap[item] = 1
            }
        }

        var properBag = true
        val numTetromino = hashMap.count()

        // check that all the tetromino type objects are contained in the hashMap.
        // iterate through hashMap. Count number of pairs in hashMap. if count of pairs in hashmap is 7 AND all the int values are 1, then bag was generated properly.
        for ((key, value) in hashMap) {
            if (value != 1) {
                properBag = false
            }
        }

        assertEquals(true, properBag)

    }
}