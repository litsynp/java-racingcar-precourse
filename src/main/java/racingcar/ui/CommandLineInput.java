package racingcar.ui;

import camp.nextstep.edu.missionutils.Console;

import java.util.regex.PatternSyntaxException;

import static racingcar.CarValidator.isValidCarName;
import static racingcar.ui.CommandLineOutput.printCarNamePatternInvalidError;
import static racingcar.ui.CommandLineOutput.printCarNameTooLongError;
import static racingcar.ui.CommandLineOutput.printMoveCountInvalidError;

class CommandLineInput {

    public static String[] inputCarNames() {
        try {
            String[] carNames = Console.readLine().split(",");
            for (String carName : carNames) {
                if (isValidCarName(carName)) {
                    printCarNameTooLongError();
                    throw new IllegalArgumentException();
                }
            }
            return carNames;
        } catch (PatternSyntaxException patternException) {
            printCarNamePatternInvalidError();
            throw new IllegalArgumentException();
        }
    }

    public static int inputMoveCount() {
        try {
            return Integer.parseInt(Console.readLine());
        } catch (NumberFormatException numberFormatException) {
            printMoveCountInvalidError();
            throw new IllegalArgumentException();
        }
    }
}
