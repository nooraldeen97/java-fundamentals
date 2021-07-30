/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
    }

    @Test public void noErrors(){
        String path="C:/401-projects/java-fundamentals/linter/app/src/test/resources/noErrors.js";

        assertEquals("This massege should return 0",0,App.checkSemiColon(path));
    }


    @Test public void oneErrors(){
        String path="C:/401-projects/java-fundamentals/linter/app/src/test/resources/one-Error.js";

        assertEquals("This massege should return 0",1,App.checkSemiColon(path));
    }

    @Test public void fewErrors(){
        String path="C:/401-projects/java-fundamentals/linter/app/src/test/resources/few-errors.js";

        assertEquals("This massege should return 0",3,App.checkSemiColon(path));
    }

    @Test public void emptyFile(){
        String path="C:/401-projects/java-fundamentals/linter/app/src/test/resources/empty-file.js";

        assertEquals("This massege should return zero for empty file",0,App.checkSemiColon(path));
    }

    @Test public void manyErrors(){
        String path="C:/401-projects/java-fundamentals/linter/app/src/test/resources/many-errors.js";

        assertEquals("This massege should return zero for empty file",7,App.checkSemiColon(path));
    }

}
