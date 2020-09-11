import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AccountTest {

    @Test
    public void shouldGeneratedCreditCardLengthBeSixteen() {

        //given
        Account account = new Account();

        //when
        account.generate("400000",16);

        //then
        assertEquals(16,account.getCreditCardNumber().length());
    }

    @Test
    public void shouldCardPrefixBe400000() {

        //given
        Account account = new Account();

        //when
        String prefix = account.getCreditCardNumber().substring(0, 6);

        //then
        assertEquals("400000",prefix);
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
    @Test
    public void shouldPassCardValidate(){

        //given
        Account account = new Account();

        //when
        account.cardValidate();

        //then
        assertEquals("Credit card number is valid",account.cardValidate());
    }


}