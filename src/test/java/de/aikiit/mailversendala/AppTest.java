package de.aikiit.mailversendala;

import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void appIsNotNullAndLaunchable() throws IOException {
        assertThat(new App()).isNotNull();
        // TODO App.main(null);
    }

}
