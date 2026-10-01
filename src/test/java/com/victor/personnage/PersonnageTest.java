package com.victor.personnage;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonnageTest {

    @Test
    void tourner_0_devrait_retourner_NORD() {
        Personnage p = new Personnage();
        assertThat(p.tourner(0)).isEqualTo("NORD");
    }

}
