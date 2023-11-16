package org.mql.ws.restws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CardValidationRequest {
    private String creditCardNumber;

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
}
