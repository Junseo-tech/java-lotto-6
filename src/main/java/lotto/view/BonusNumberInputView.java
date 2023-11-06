package lotto.view;

import lotto.exception.BonusNumberException;
import lotto.util.StringToIntegerConverter;

public class BonusNumberInputView extends InputView {
    private static final String BONUS_NUMBER_MESSAGE = "보너스 번호를 입력해 주세요.";


    public String getBonusNumber(){
        System.out.println(BONUS_NUMBER_MESSAGE);
        String bonusNum = getInputValue();
        return bonusNum;
    }
}
