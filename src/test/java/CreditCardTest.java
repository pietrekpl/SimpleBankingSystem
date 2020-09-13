import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CreditCardTest {

    @Test
    public void shouldGeneratedCreditCardLengthBeSixteen() {

        //given
        CreditCard creditCard = new CreditCard();

        //when
        creditCard.generate("400000",16);

        //then
        assertEquals(16, creditCard.getCreditCardNumber().length());
    }

    @Test
    public void shouldCardPrefixBe400000() {

        //given
        CreditCard creditCard = new CreditCard();

        //when
        String prefix = creditCard.getCreditCardNumber().substring(0, 6);

        //then
        assertEquals("400000",prefix);
    }

    @Test
    public void shouldGeneratedPinCodeLengthBeFour() {

        //given
        CreditCard creditCard = new CreditCard();

        //when
        creditCard.generatePIN();
        String pinCodeLength = String.valueOf(creditCard.generatePIN());

        //then
        assertEquals(4, pinCodeLength.length());
    }
    @Test
    public void shouldPassCardValidate(){

        //given
        CreditCard creditCard = new CreditCard();

        //when
        creditCard.cardValidate();

        //then
        assertEquals("Credit card number is valid", creditCard.cardValidate());
    }


}