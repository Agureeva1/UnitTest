import org.junit.jupiter.api.*;

@DisplayName("Тестирование: PersonTest")

public class PersonTest {

    private Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Василий", "Петров", 4);
        System.out.println("Создали person до выполнения теста");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Тест окончен");
    }

    @Test
    @DisplayName("Тестирование метода - у person есть билет")
    void hasTicket() {
        Assertions.assertNotNull(person.hasTicket());
    }

    @Test
    @DisplayName("Тестирование метода - вернуть количество билетов person")
    void getTicket() {
        Assertions.assertEquals(4, person.getTicket());
    }

    @Test
    @DisplayName("Тестирование метода - вернуть имя person")
    void getName() {
        Assertions.assertEquals("Василий", person.getName());
    }

    @Test
    @DisplayName("Тестирование метода - вернуть фамилию person")
    void getSurname() {
        Assertions.assertNotNull(person.getSurname());
    }

}
