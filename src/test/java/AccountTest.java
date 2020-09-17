import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void initialMoneyShouldBe200() {
        //given
        Account account = new Account();

        //when
        BigDecimal value = account.getBalance();

        //then
        assertEquals(200, value.longValueExact());
    }

}