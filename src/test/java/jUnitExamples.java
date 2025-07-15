import org.junit.jupiter.api.*;

public class jUnitExamples {

    @BeforeAll
    static void BeforeAll() {
        System.out.println("Hello beforeALL");
    }

    @BeforeEach
    void BeforeEach() {
        System.out.println("Hello BeforeEach!");
    }

    @AfterAll
    static void AfterALL() {
        System.out.println("Hello AfterAll!");
    }

    @AfterEach
    void AfterEach() {
        System.out.println("Hello AfterEach!");
    }

    @Test
    void secondTest(){
        System.out.println("Hello everynyan 2!");
    }
}
