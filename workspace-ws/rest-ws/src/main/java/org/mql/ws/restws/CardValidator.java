package org.mql.ws.restws;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/v1") 
public class CardValidator {

	@GET
	public String test() {
		return "hell";
	}

	@POST
	@Path("/validate")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public CardValidationResponse validateCreditCard(CardValidationRequest cardValidationRequest) {
		String creditCardNumber = cardValidationRequest.getCreditCardNumber();
		// Your validation logic here
		System.out.println(">>>> " + creditCardNumber);

		CardValidationResponse response = new CardValidationResponse();

		if (isValidCreditCardNumber(creditCardNumber)) {
			response.setMessage("La carte de crédit est valide.");
		} else {
			response.setMessage("La carte de crédit n'est pas valide.");
		}

		return response;
	}

	private boolean isValidCreditCardNumber(String creditCardNumber) {
		// Supprimez les espaces et les tirets du numéro de carte de crédit
		String cleanedNumber = creditCardNumber.replaceAll("\\s|-", "");

		// Vérifiez si la longueur du numéro de carte est correcte (généralement 13 à 19
		// chiffres)
		if (cleanedNumber.length() < 13 || cleanedNumber.length() > 19) {
			return false;
		}

		// Appliquez l'algorithme de Luhn
		int sum = 0;
		boolean doubleDigit = false;

		for (int i = cleanedNumber.length() - 1; i >= 0; i--) {
			int digit = Character.getNumericValue(cleanedNumber.charAt(i));

			if (doubleDigit) {
				digit *= 2;
				if (digit > 9) {
					digit -= 9;
				}
			}

			sum += digit;
			doubleDigit = !doubleDigit;
		}

		return sum % 10 == 0;
	}
}
