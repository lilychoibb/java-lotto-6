package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import lotto.model.Lotto;

public class GeneratorLotto {
    public GeneratorLotto() {
    }

    public List<Integer> generateLottoNumbers() {
        return Randoms.pickUniqueNumbersInRange(1, 45, 6);
    }

    public List<Lotto> generateLottoTickets(int purchaseAmount) {
        List<Lotto> lottoNumbers = new ArrayList<>();

        for (int i = 0; i < purchaseAmount; i++) {
            lottoNumbers.add(generateRandomSortedLotto());
        }

        return lottoNumbers;
    }

    private Lotto generateRandomSortedLotto() {
        List<Integer> numbers = new ArrayList<>(generateLottoNumbers());
        Collections.sort(numbers);
        return new Lotto(numbers);
    }

    public List<List<Integer>> generateLottoNumbersList(List<Lotto> lottoNumbers) {
        return lottoNumbers.stream()
                .map(Lotto::getLottoNumbers)
                .collect(Collectors.toList());
    }
}