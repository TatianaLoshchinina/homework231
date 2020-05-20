import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredEquallyLimit() {
        BonusService service = new BonusService();
        //Подготавливаем данные
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;
        //Вызываем целевой метол:
        long actual = service.calculate(amount, registered);
        assertEquals(expected,actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForNoRegisteredEquallyLimit() {
        BonusService service = new BonusService();


        long amount = 5000_000;
        boolean registered = false;
        long expected = 500;


        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();


        long amount = 1000_000_60;
        boolean registered = true;
        long expected = 500;


        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForNoRegisteredAndOverLimit() {
        BonusService service = new BonusService();


        long amount = 1000_000_60;
        boolean registered = false;
        long expected = 500;


        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
}
