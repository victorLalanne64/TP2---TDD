package com.victor.facteursPremiers;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FacteursPremiersTest {

    @Test
    void generate_1_devrait_retourner_liste_vide() {
        assertThat(FacteursPremiers.generate(1)).isEmpty();
    }

    @Test
    void generate_2_devrait_retourner_2() {
        assertThat(FacteursPremiers.generate(2)).containsExactly(2);
    }

    @Test
    void generate_3_devrait_retourner_3() {
        assertThat(FacteursPremiers.generate(3)).containsExactly(3);
    }

    @Test
    void generate_4_devrait_retourner_2_2() {
        assertThat(FacteursPremiers.generate(4)).containsExactly(2,2);
    }
}
