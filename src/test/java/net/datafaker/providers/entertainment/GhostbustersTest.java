package net.datafaker.providers.entertainment;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GhostbustersTest extends EntertainmentFakerTest {

    @Test
    void actor() {
        assertThat(faker.ghostbusters().actor()).isNotEmpty();
    }

    @Test
    void character() {
        assertThat(faker.ghostbusters().character()).isNotEmpty();
    }

    @Test
    void quote() {
        assertThat(faker.ghostbusters().quote()).isNotEmpty();
    }
}
