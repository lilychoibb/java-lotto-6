package lotto.validator;

import lotto.model.Purchase;
public class ValidatorPurchaseAmount {
    public ValidatorPurchaseAmount() {
    }
    private boolean isThousandWonMultiple(Purchase purchase) {
        int returnAmount = Integer.parseInt(purchase.getPurchaseAmount());
        return returnAmount % 1000 == 0;
    }

    private boolean isLessThan1000(Purchase purchase) {
        int returnAmount = Integer.parseInt(purchase.getPurchaseAmount());
        return returnAmount >= 1000;
    }

}
