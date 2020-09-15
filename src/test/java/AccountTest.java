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
    @Test
    public void shouldAddAmountToBalance(){
        //given
        Account account = new Account();
        BigDecimal value = BigDecimal.valueOf(0.99);

        //when
       BigDecimal result =  account.addAmount(value);

        //then
        assertEquals(BigDecimal.valueOf(200.99),result);
        System.out.println(account.getBalance());
    }
}