import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AccountTest {

    @Test
    public void shouldGeneratedCreditCardLengthBeSixteen() {

        //given
        Account account = new Account();

        //when
        account.generateCardNumber();
        String creditCardLength = String.valueOf(account.generateCardNumber());

        //then
        assertEquals(16, creditCardLength.length());
    }

    @Test
    public void shouldCardPrefixBe400000() {

        //given
        Account account = new Account();

        //when
        String prefix = String.valueOf(account.getCreditCardNumber()).substring(0, 6);

        //then
        assertEquals(400000, Long.parseLong(prefix));
    }

    @Test
    public void shouldGeneratedPinCodeLengthBeFour() {

        //given
        Account account = new Account();

        //when
        account.generatePIN();
        String pinCodeLength = String.valueOf(account.generatePIN());

        //then
        assertEquals(4, pinCodeLength.length());
    }


}