import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleCheckerTest {

    @org.junit.jupiter.api.Test
    void checkTriangle() {



            // Arrange
            float a = 3;
            float b = 2;
            float c = 4;

            // Act
            TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

            // Assert
            assertEquals(TriangleChecker.TriangleType.NORMALTRIANGLE, type);

            // Arrange
            a = -2;
            b = 5;
            c = 2;

            // Act
            type = TriangleChecker.checkTriangle(a, b, c);

            // Assert
            assertEquals(TriangleChecker.TriangleType.NOTRIANGLE, type);

            // Arrange
            a = 5;
            b = 5;
            c = 10;

            // Act
            type = TriangleChecker.checkTriangle(a, b, c);

            // Assert
            assertEquals(TriangleChecker.TriangleType.NOTRIANGLE, type);
        }

        public void testIsoTriangle(){
            // Arrange
            float a = 6;
            float b = 6;
            float c = 3;

            // Act
            TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

            // Assert
            assertEquals(TriangleChecker.TriangleType.ISOSCELES, type);
        }


        public void testEqualTriangle(){
            // Arrange
            float a = 5;
            float b = 5;
            float c = 5;

            // Act
            TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

            // Assert
            assertEquals(TriangleChecker.TriangleType.EQUILATERAL, type);
        }
    }
